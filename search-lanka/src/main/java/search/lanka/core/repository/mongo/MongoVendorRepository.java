package search.lanka.core.repository.mongo;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.google.common.base.Optional;
import com.mongodb.WriteConcern;
import org.bson.types.ObjectId;
import search.lanka.core.config.MongoDataStore;
import search.lanka.core.domain.Location;
import search.lanka.core.domain.Vendor;
import search.lanka.core.repository.VendorRepository;

import java.util.List;

/**
 *
 */
public class MongoVendorRepository extends BasicDAO<Vendor, ObjectId> implements VendorRepository {

    protected MongoVendorRepository(final MongoDataStore mongoDs) {
        super(mongoDs.getDataStore());
        getDatastore().ensureIndexes();
    }

    @Override
    public Key<Vendor> save(final Vendor vendor) {
        return super.save(vendor, WriteConcern.SAFE);
    }

    @Override
    public Optional<Vendor> findVendorById(String vendor_id) {
        Vendor vendor = ds.find(Vendor.class, Vendor.VENDOR_ID, vendor_id).get();
        return Optional.fromNullable(vendor);
    }

    @Override
    public List<Vendor> findAllVendors() {
        List<Vendor> vendors = ds.find(Vendor.class).asList();
        return vendors;
    }

    @Override
    public List<String> findCategoriesByVendorId(String vendorId) {
//        List<String> categories = ds.find(Vendor.class, Vendor.VENDOR_ID vendorId)
//        return categories;

        return null;
    }

    @Override
    public List<Location> findLocationsByVendorId(String vendorId) {
//        return ds.find(Location.class, Location.VENDOR_ID, vendorId).asList();
        return null;
    }

    @Override
    public Optional<Vendor> findVendorByLocationId(String locationId) {
//        Optional<Vendor> vendor = ds.find(Vendor.class, Vendor, locationId).field(Location.VENDOR_ID);
//        return vendor;
        return null;
    }


}
