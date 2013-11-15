package search.lanka.repository;

import search.lanka.model.Vendor;

import com.google.common.base.Optional;

/**
 *
 */
public interface VendorRepository {

    Optional<Vendor> findVendorsById(String id);

}
