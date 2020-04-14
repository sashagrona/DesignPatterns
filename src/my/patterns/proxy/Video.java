package my.patterns.proxy;

import java.util.Objects;

public class Video {
    private String id;
    private String name;
    private String url;

    public Video(String id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public Video(String id) {
        this.id = id;
    }

    public Video() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Objects.equals(id, video.id) &&
                Objects.equals(name, video.name) &&
                Objects.equals(url, video.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, url);
    }
}
