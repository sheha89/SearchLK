package search.lanka.service;

import com.github.jmkgreen.morphia.Key;
import com.google.common.base.Optional;
import search.lanka.core.domain.*;

import java.util.List;

/**
 *
 */
public interface VendorService {

    //Vendor
    void createVendor(Vendor vendor);

    Optional<Vendor> getVendorById(String vendor_id);

    List<Vendor> getAllVendors();

    Optional<Vendor> getVendorByPost(String postId);

    List<String> getCategoriesByVendorId(String vendorId);

    List<Location> getLocationsByVendorId(String vendorId);

    List<Vendor> getVendorsByLocation(String locationId);


    //VendorPost
    void createVendorPost(VendorPost vendorPost);

    List<VendorPost> getVendorPostsByVendor(String vendorId);

    Optional<VendorPost> getVendorPostsById(String postId);

    List<VendorPost> getPostsByTitle(String title);

    List<VendorPost> getPostsByCategory(String categoryId);

    List<VendorPost> getPostsByTag(String tagId);

    List<String> getTagsByPostId(String postId);

    String  getVendorByPostId(String postId);


    //Tag
    void createTag(Tag tag);

    Optional<Tag> getTagById(String tagId);

    List<Tag> getAllTags();

    List<Tag> getTagsByVendorId(String vendorId);


    //Category
    void createCategory(Category category);

    public Optional<Category> getCategoryById(String category_id);

    List<Category> getAllCategories();

    List<String> getVendorsByCategoryId(String categoryId);

}
