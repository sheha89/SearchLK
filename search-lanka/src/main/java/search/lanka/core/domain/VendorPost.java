package search.lanka.core.domain;

import com.github.jmkgreen.morphia.annotations.Id;

import java.util.List;

/**
 *
 */
public class VendorPost {

    public static String VENDOR_ID = "vendor_id";
    public static String TITLE = "title";
    public static String POST_ID = "post_id";

    @Id
    private String post_id;
    private String title;
    private String description;
    private String image;
    private String vendor_id;
    private List<String> tags;

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

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        builder.append("VendorPost [post_id=");
//        builder.append(post_id);
//        builder.append(", title=");
//        builder.append(title);
//        builder.append(", description=");
//        builder.append(description);
//        builder.append("image=");
//        builder.append(image);
//        builder.append("vendor_id=");
//        builder.append(vendor_id);
//        builder.append("]");
//        return builder.toString();
//    }

}
