package nucleus.com.driverapp.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kevintan on 27/10/2017.
 */

public class AuthResponse {
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("photoURL")
    @Expose
    private String photoURL;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("emailVerified")
    @Expose
    private Boolean emailVerified;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("isAnonymous")
    @Expose
    private Boolean isAnonymous;
    @SerializedName("providerData")
    @Expose
    private List<ProviderDatum> providerData = null;
    @SerializedName("apiKey")
    @Expose
    private String apiKey;
    @SerializedName("appName")
    @Expose
    private String appName;
    @SerializedName("authDomain")
    @Expose
    private String authDomain;
    @SerializedName("stsTokenManager")
    @Expose
    private StsTokenManager stsTokenManager;
    @SerializedName("redirectEventId")
    @Expose
    private String redirectEventId;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getAnonymous() {
        return isAnonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        isAnonymous = anonymous;
    }

    public List<ProviderDatum> getProviderData() {
        return providerData;
    }

    public void setProviderData(List<ProviderDatum> providerData) {
        this.providerData = providerData;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAuthDomain() {
        return authDomain;
    }

    public void setAuthDomain(String authDomain) {
        this.authDomain = authDomain;
    }

    public StsTokenManager getStsTokenManager() {
        return stsTokenManager;
    }

    public void setStsTokenManager(StsTokenManager stsTokenManager) {
        this.stsTokenManager = stsTokenManager;
    }

    public String getRedirectEventId() {
        return redirectEventId;
    }

    public void setRedirectEventId(String redirectEventId) {
        this.redirectEventId = redirectEventId;
    }
}
