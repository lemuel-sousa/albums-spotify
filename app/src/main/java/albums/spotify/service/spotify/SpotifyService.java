package albums.spotify.service.spotify;

import albums.spotify.client.album.AlbumSpotifyClient;
import albums.spotify.client.album.dto.AlbumResponse;
import albums.spotify.client.auth.AuthSpotifyClient;
import albums.spotify.client.dto.SpotifyLoginRequest;
import albums.spotify.client.dto.SpotifyLoginResponse;
import albums.spotify.service.spotify.provider.SpotifyProvider;
import org.springframework.stereotype.Service;

@Service
public class SpotifyService {
    private final AuthSpotifyClient authSpotifyClient;
    private final AlbumSpotifyClient albumSpotifyClient;
    private final SpotifyProvider spotifyProvider;

    public SpotifyService(AuthSpotifyClient authSpotifyClient, AlbumSpotifyClient albumSpotifyClient, SpotifyProvider spotifyProvider) {
        this.authSpotifyClient = authSpotifyClient;
        this.albumSpotifyClient = albumSpotifyClient;
        this.spotifyProvider = spotifyProvider;
    }

    public SpotifyLoginResponse authenticate() {
        var loginRequest = new SpotifyLoginRequest(
                "client_credentials",
                spotifyProvider.getClientId(),
                spotifyProvider.getClientSecret());
        return authSpotifyClient.login(loginRequest);
    }

    public AlbumResponse getNewReleases(String authorization) {
        return albumSpotifyClient.getNewReleases(authorization);
    }
}
