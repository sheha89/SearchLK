package search.lanka.core.repository;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.github.jmkgreen.morphia.dao.DAO;
import org.bson.types.ObjectId;
import search.lanka.core.domain.Vendor;

import com.google.common.base.Optional;

import java.util.List;

/**
 *
 */
public interface VendorRepository extends BasicDAO<Vendor, ObjectId> {

    @Override
    Key<Vendor> save(Vendor vendor);

    Optional<Vendor> findVendorsById(String id);

    List<Vendor> findAllVendors();

    List<Vendor> findVendorsByCategoryId(String categoryId);

    List<Vendor> findVendorsByLocationId(String locationId);

    Optional<Vendor> findVendorByPostId(String postId);
}
