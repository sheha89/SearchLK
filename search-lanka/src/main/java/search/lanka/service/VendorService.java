package search.lanka.service;

import search.lanka.core.domain.VendorPost;

import java.util.List;

/**
 *
 */
public interface VendorService {

    List<VendorPost> getVendorPostsByVendor(String vendorId);

    void createVendorPost(VendorPost vendorPost);

}
