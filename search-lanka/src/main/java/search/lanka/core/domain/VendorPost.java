package search.lanka.core.domain;

/**
 *
 */
public class VendorPost {

    public static String VENDOR_ID = "vendor_id";

    private String post_id;
    private String title;
    private String description;
    private String image;
    private String vendor_id;

    public VendorPost() {
    }

    public VendorPost(String post_id, String title, String description, String vendor_id) {
        this.post_id = post_id;
        this.title = title;
        this.description = description;
        this.vendor_id = vendor_id;
    }

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
