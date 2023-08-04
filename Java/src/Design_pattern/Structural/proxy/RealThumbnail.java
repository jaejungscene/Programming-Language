package Design_pattern.Structural.proxy;

public class RealThumbnail implements Thumbnail{
    private String url;
    private String title;
    private String preview;


    public RealThumbnail(String url) {
        this.url = url;
    }

    private String getTitle(String url){
        /* ... */
        this.title = "title";
        return this.title;
    }

    private String getPreview(String url){
        /* ... */
        this.preview = "preview.......";
        return this.preview;
    }

    @Override
    public String showTitle() {
        getTitle(this.url);
        System.out.println(this.title + "Real");
        return this.title;
    }

    @Override
    public String showPreview() {
        getPreview(this.url);
        System.out.println(this.preview + "in Real");
        return this.preview;
    }
}
