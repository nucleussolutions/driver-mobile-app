package nucleus.com.driverapp.response;

/**
 * Created by kevintan on 27/10/2017.
 */

public class LoginResponse {

    private String kind;
    private String idToken;

    private String email;

    private String refreshToken;

    private String expiresIn;

    private String localId;

    private boolean registered;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "kind='" + kind + '\'' +
                ", idToken='" + idToken + '\'' +
                ", email='" + email + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", expiresIn='" + expiresIn + '\'' +
                ", localId='" + localId + '\'' +
                ", registered=" + registered +
                '}';
    }
}
