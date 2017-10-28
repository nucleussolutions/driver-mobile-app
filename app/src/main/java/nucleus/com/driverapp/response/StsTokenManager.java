package nucleus.com.driverapp.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kevintan on 28/10/2017.
 */

public class StsTokenManager {
    @SerializedName("apiKey")
    @Expose
    private String apiKey;
    @SerializedName("refreshToken")
    @Expose
    private String refreshToken;
    @SerializedName("accessToken")
    @Expose
    private String accessToken;
    @SerializedName("expirationTime")
    @Expose
    private Integer expirationTime;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Integer expirationTime) {
        this.expirationTime = expirationTime;
    }
}
