package albums.spotify.service.spotify.provider;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@ConfigurationProperties("spotify.login")
public class SpotifyProvider {
    
    String clientId;
    String clientSecret;
    
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public String getClientSecret() {
        return clientSecret;
    }
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @PostConstruct
    public void logProperties() {
        System.out.println("ClientId: " + clientId);
        System.out.println("ClientSecret: " + clientSecret);
    }
}
