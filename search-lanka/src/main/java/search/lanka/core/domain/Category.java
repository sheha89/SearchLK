package search.lanka.core.domain;

import com.github.jmkgreen.morphia.annotations.Id;

/**
 *
 */
public class Category {

    @Id
    private String category_id;
    private String category_name;
    private String description;
    private String image;

    public Category() {
    }

    public Category(String category_name, String category_id) {
        this.category_name = category_name;
        this.category_id = category_id;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Category [category_id=");
        builder.append(category_id);
        builder.append(", category_name=");
        builder.append(category_name);
        builder.append(", description=");
        builder.append(description);
        builder.append("image=");
        builder.append(image);
        builder.append("]");
        return builder.toString();
    }

}
