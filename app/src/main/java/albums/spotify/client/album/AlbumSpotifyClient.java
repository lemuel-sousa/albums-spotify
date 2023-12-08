package albums.spotify.client.album;


import albums.spotify.client.album.dto.AlbumResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
        name = "AlbumSpotifyClient",
        url = "https://api.spotify.com"
)
public interface AlbumSpotifyClient {
    @GetMapping("/v1/browse/new-releases")
    AlbumResponse getNewReleases(@RequestHeader("Authorization") String authorization);
}
