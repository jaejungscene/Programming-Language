package Design_pattern.Structural.proxy;

public class ProxyThumbnail implements Thumbnail{
    private String url;
    private String title;
    private String previewCache;
    private Thumbnail thumbnail;

    public ProxyThumbnail(String url, Thumbnail thumbnail) {
        this.url = url;
        this.thumbnail = thumbnail;
    }

    private void getTitle(String url){
        /* ... */
        this.title = "title";
    }

    @Override
    public String showTitle() {
        getTitle(this.url);
        System.out.println(this.title + " in Proxy");
        return this.title;
    }

    @Override
    public String showPreview() {
        if(previewCache == null)
            this.previewCache = thumbnail.showPreview();
        System.out.println(this.previewCache + " in Proxy");
        return this.previewCache;
    }
}
