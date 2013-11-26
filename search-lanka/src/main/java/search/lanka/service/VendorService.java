package search.lanka.service;

import com.google.common.base.Optional;
import search.lanka.core.domain.Vendor;
import search.lanka.core.domain.VendorPost;

import java.util.List;

/**
 *
 */
public interface VendorService {

    void createVendor(Vendor vendor);

    Optional<Vendor> getVendorById(String vendor_id);

    List<Vendor> getAllVendors();

    List<Vendor> getVendorsByCategory(String categoryId);

    Optional<Vendor> findVendorByPost(String postId);


    List<VendorPost> getVendorPostsByVendor(String vendorId);

    void createVendorPost(VendorPost vendorPost);

    Optional<VendorPost> getVendorPostsById(String postId);

    List<VendorPost> getPostsByTitle(String title);

    List<VendorPost> getPostsByCategory(String categoryId);

    List<VendorPost> getPostsByTag(String tagId);

}
