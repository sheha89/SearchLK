package search.lanka.core.domain;

import com.github.jmkgreen.morphia.annotations.Id;

/**
 *
 */
public class Vendor {

    public static String  VENDOR_NAME = "name";
    public static String VENDOR_ID = "_id";

    @Id
    private String _id;
    private String name;
    private String about;

    public Vendor() {
    }

    public Vendor(String about, String _id, String name) {
        this.about = about;
        this._id = _id;
        this.name = name;
    }


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
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

//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        builder.append("Vendor [_id=");
//        builder.append(_id);
//        builder.append(", name=");
//        builder.append(name);
//        builder.append(", about=");
//        builder.append(about);
//        builder.append("]");
//        return builder.toString();
//    }

}
