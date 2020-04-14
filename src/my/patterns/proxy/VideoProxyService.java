package my.patterns.proxy;

import java.util.List;

public class VideoProxyService implements Service<Video>{
    private List<Video> videos;
    private VideoService service;
    private String [] ids;

    public VideoProxyService(String[] ids) {
        this.ids = ids;
    }

    @Override
    public List<Video> getAll() {
        if (service == null){
            service = new VideoService(ids);
            videos = getVideos();
        }

        return videos;
    }

    private List<Video> getVideos(){
        return service.getAll();
    }
}
