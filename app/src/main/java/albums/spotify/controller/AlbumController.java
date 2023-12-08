package albums.spotify.controller;

import albums.spotify.service.spotify.SpotifyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {

    private final SpotifyService spotifyService;

    private AlbumController(SpotifyService spotifyService) {
        this.spotifyService = spotifyService;
    }

    @GetMapping("albums")
    private ResponseEntity<?> findAlbums() {
        var login = spotifyService.authenticate();
        var response = spotifyService.getNewReleases("Bearer " + login.accessToken());
        return ResponseEntity.ok(response);
    }
}
