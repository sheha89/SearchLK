package search.lanka.core.domain;

import com.github.jmkgreen.morphia.annotations.Entity;
import com.github.jmkgreen.morphia.annotations.Id;

import java.util.List;

/**
 *
 */
@Entity
public class Tag {

    public static String TAG_ID = "tag_id";

    @Id
    private String tag_id;
    private String title;
    private String description;
    private List<String> urls;
    private List<String> posts;

    public Tag() {
    }

    public String getTag_id() {
        return tag_id;
    }

    public void setTag_id(String tag_id) {
        this.tag_id = tag_id;
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

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public List<String> getPosts() {
        return posts;
    }

    public void setPosts(List<String> posts) {
        this.posts = posts;
    }

//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        builder.append("Tag [tag_id=");
//        builder.append(tag_id);
//        builder.append(", title=");
//        builder.append(title);
//        builder.append(", description=");
//        builder.append(description);
//        builder.append("urls=");
//        builder.append(urls);
//        builder.append("]");
//        return builder.toString();
//    }

}
