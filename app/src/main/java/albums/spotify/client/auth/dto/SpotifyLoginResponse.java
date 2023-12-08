package albums.spotify.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SpotifyLoginResponse(
    @JsonProperty("access_token")
    String accessToken
) {
        
}
