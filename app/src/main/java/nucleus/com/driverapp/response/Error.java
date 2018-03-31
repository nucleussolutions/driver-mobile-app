package nucleus.com.driverapp.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Error {
    @SerializedName("errors")
    @Expose
    private List<Error_> errors = null;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;

    public List<Error_> getErrors() {
        return errors;
    }

    public void setErrors(List<Error_> errors) {
        this.errors = errors;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Error{" +
                "errors=" + errors +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
