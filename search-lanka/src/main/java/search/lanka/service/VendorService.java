package search.lanka.service;

import search.lanka.model.VendorPost;

import java.util.List;

/**
 *
 */
public interface VendorService {

    List<VendorPost> getVendorPostsByVendor(String vendorId);

    void createVendorPost(VendorPost vendorPost);

}
