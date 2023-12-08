package albums.spotify.client.album.dto;

import java.util.List;

public record AlbumWrapper(
        List<Album> items
) {
}
