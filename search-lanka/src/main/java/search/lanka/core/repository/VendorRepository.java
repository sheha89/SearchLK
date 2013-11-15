package search.lanka.core.repository;

import search.lanka.core.domain.Vendor;

import com.google.common.base.Optional;

/**
 *
 */
public interface VendorRepository {

    Optional<Vendor> findVendorsById(String id);

}
