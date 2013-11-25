package search.lanka.core.domain;

import com.github.jmkgreen.morphia.annotations.Id;

import java.util.List;

/**
 *
 */
public class Vendor {

    public static String VENDOR_NAME = "name";
    public static String VENDOR_ID = "vendor_id";
    public static String CATEGORY_ID = "category_id";
    public static String LOCATION_ID = "location_id";
    @Id
    private String vendor_id;
    private String name;
    private String about;
    private String username;
    private String password;
    private List<String> categories;

    public Vendor() {
    }

    public Vendor(String vendor_id, String name, String about) {
        this.about = about;
        this.vendor_id = vendor_id;
        this.name = name;
    }

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        builder.append("Vendor [vendor_id=");
//        builder.append(vendor_id);
//        builder.append(", name=");
//        builder.append(name);
//        builder.append(", about=");
//        builder.append(about);
//        builder.append("category_id=");
//        builder.append(category_id);
//        builder.append("location_id=");
//        builder.append(location_id);
//        builder.append(", username=");
//        builder.append(username);
//        builder.append(", password=");
//        builder.append(password);
//        builder.append("]");
//        return builder.toString();
//    }

}
