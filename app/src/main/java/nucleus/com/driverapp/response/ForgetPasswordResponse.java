package nucleus.com.driverapp.response;

public class ForgetPasswordResponse {

    private String kind;
    private String email;
    private String requestType;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return "ForgetPasswordResponse{" +
                "kind='" + kind + '\'' +
                ", email='" + email + '\'' +
                ", requestType='" + requestType + '\'' +
                '}';
    }
}
