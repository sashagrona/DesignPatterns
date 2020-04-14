package my.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class VideoService implements Service<Video> {

    private String [] ids;

    public VideoService(String... ids) {
        this.ids = ids;
    }

    @Override
    public List<Video> getAll() {
        List<Video> videos = new ArrayList<>();
        for (String id:ids) {
            System.out.println("Long id initialization...");
            videos.add(new Video(id));
        }
        return videos;
    }
}
