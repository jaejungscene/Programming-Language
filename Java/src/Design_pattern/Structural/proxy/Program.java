package Design_pattern.Structural.proxy;

public class Program {
    public static void main(String[] args) {
        String url = "url";
        Thumbnail thumbnail = new ProxyThumbnail(
                url,
                new RealThumbnail(url)
        );

        thumbnail.showTitle();
        System.out.println("-----------------------");
        thumbnail.showPreview();
        System.out.println("-----------------------");
        thumbnail.showPreview();
        System.out.println("-----------------------");
        thumbnail.showPreview();
    }
}
/**
 * <output>
 * title in Proxy
 * -----------------------
 * preview.......in Real
 * preview....... in Proxy
 * -----------------------
 * preview....... in Proxy
 * -----------------------
 * preview....... in Proxy
 */
