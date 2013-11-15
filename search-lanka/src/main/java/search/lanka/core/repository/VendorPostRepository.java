package search.lanka.core.repository;

import search.lanka.core.domain.VendorPost;

import java.util.List;

/**
 *
 */
public interface VendorPostRepository {

    List<VendorPost> findPostsByVendorId(String vendorId);

}
