package search.lanka.repository;

import search.lanka.model.VendorPost;

import java.util.List;

/**
 *
 */
public interface VendorPostRepository {

    List<VendorPost> findPostsByVendorId(String vendorId);

}
