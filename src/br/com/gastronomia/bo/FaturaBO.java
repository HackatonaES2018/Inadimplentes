

import br.com.gastronomia.dao.FaturaDAO;

import br.com.gastronomia.dto.FaturaDTO;

import br.com.gastronomia.exception.ValidationException;
import br.com.gastronomia.model.Fatura;

import com.sun.org.apache.bcel.internal.generic.FADD;

import javax.validation.ConstraintViolationException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FaturaBO {
    private FaturaDAO faturaDAO;

    public Fatura criarFatura(FaturaDTO dto) throws ValidationException {
        if (dto != null) {
            try {
                Fatura fatura = modelFromDTO(dto);
                fatura.setStatus(true);
                faturaDAO.save(fatura);
                return fatura;
            } catch (ConstraintViolationException e) {
                throw new ValidationException(e.getMessage());
            } catch (Exception e) {
                throw new ValidationException(e.getMessage());
            }
        }
        return null;
    }

    public long deactivateRefeicao(long id) throws ValidationException {
        return faturaDAO.alterStatus(id, false);
    }

    public Map<String, List<Fatura>> list() {
        return Collections.singletonMap("Faturas", faturaDAO.listAll(Fatura.class));
    }

    public void update(FaturaDTO dto) throws ValidationException {
        if (dto == null)
            throw new IllegalArgumentException();

        Fatura fatura = modelFromDTO(dto);
        faturaDAO.update(fatura);
    }

    private Fatura modelFromDTO(FaturaDTO dto) {
        Fatura fatura = new Fatura();


        fatura.setId(dto.getId());
        fatura.setData(dto.getData());
        fatura.setValor(dto.getValor());
        fatura.setStatus(dto.isStatus());
        fatura.setSequencia(dto.getSequencia());

        return fatura;
    }


}
