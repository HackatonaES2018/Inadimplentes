package br.com.gastronomia.dto;


public class StandardResponseDTO {
    private boolean success;
    private String message;
    private Object data;

    public StandardResponseDTO(boolean s, String m) {
        success = s;
        message = m;
    }

    public StandardResponseDTO(boolean s, String m, Object data) {
        success = s;
        message = m;
        this.data = data;
    }

    public StandardResponseDTO() {}

    public void setMessage(String m) {
        message = m;
    }

    public void setSuccess(boolean s) {
        success = s;
    }

    public String getMessage() {
        return message;
    }

    public boolean getSuccess() {
        return success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}