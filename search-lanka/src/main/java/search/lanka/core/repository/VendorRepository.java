package search.lanka.core.repository;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.DAO;
import com.google.common.base.Optional;
import org.bson.types.ObjectId;
import search.lanka.core.domain.Location;
import search.lanka.core.domain.Vendor;

import java.util.List;

/**
 *
 */
public interface VendorRepository extends DAO<Vendor, ObjectId> {

    @Override
    Key<Vendor> save(Vendor vendor);

    Optional<Vendor> findVendorById(String vendor_id);

    List<Vendor> findAllVendors();

    List<String> findCategoriesByVendorId(String vendorId);
    //can be retrieved by    #findVendorById

    List<Location> findLocationsByVendorId(String vendorId);
    //can be retrieved by    #findVendorById

    Optional<Vendor> findVendorByLocationId(String locationId);

}
