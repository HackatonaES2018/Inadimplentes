package br.com.gastronomia.util;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class ImageUtil {

    private static Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dapuhipoe",
                "api_key", "488145667173878",
                "api_secret", "OQBUtEbnbf0scRDi-9aowMxstrw"
        ));
    }

    private static boolean ensureDirExists(String path) {
        File file = new File(path);
        return file.exists() || file.mkdirs();
    }

    private static BufferedImage scale(BufferedImage input, int max) {
        int w = input.getWidth(), h = input.getHeight();
        int newWidth, newHeight;

        if (w < h) { // portrait
            newWidth = max;
            newHeight = (int) ((double) h / w * max);
        } else { // landscape
            newWidth = (int) ((double) w / h * max);
            newHeight = max;
        }

        BufferedImage scaled = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        Graphics g = scaled.getGraphics();
        g.drawImage(input, 0, 0, newWidth, newHeight, null);
        g.dispose();

        return scaled;
    }

    private static BufferedImage crop(BufferedImage input, int width, int height) {
        BufferedImage precrop = input.getSubimage(0, 0, width, height);

        BufferedImage cropped = new BufferedImage(precrop.getWidth(), precrop.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = cropped.getGraphics();
        g.drawImage(precrop, 0, 0, null);
        g.dispose();

        return cropped;
    }

    private static String saveTemporaryImage(InputStream inputImage, String path) {
        String fullPath = "tmp/" + path;
        ensureDirExists(fullPath);

        try {
            BufferedImage bufferedInput = ImageIO.read(inputImage);

            BufferedImage scaled = scale(bufferedInput, 200);
            BufferedImage cropped = crop(scaled, 200, 200);

            ImageIO.write(cropped, "png", new File(fullPath));
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }

        return fullPath;
    }

    public static boolean save(String path, InputStream image) {
        ensureDirExists(path);
        String temporaryImagePath = saveTemporaryImage(image, path);

        if (temporaryImagePath == null)
            return false;

        File file = new File(temporaryImagePath);
        Map info = ObjectUtils.asMap("public_id", "dietoterapia/" + path);

        try {
            cloudinary().uploader().upload(file, info);
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    public static String getURL(String path) {
        return cloudinary().url().format("png").generate("dietoterapia/" + path);
    }
}
