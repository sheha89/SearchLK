package search.lanka.core.repository.mongo;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.google.common.base.Optional;
import com.mongodb.WriteConcern;
import org.bson.types.ObjectId;
import search.lanka.core.config.MongoDataStore;
import search.lanka.core.domain.Location;
import search.lanka.core.domain.Vendor;
import search.lanka.core.repository.LocationRepository;

import java.util.List;

/**
 *
 */
public class MongoLocationRepository extends BasicDAO<Location, ObjectId> implements LocationRepository {

    protected MongoLocationRepository(final MongoDataStore mongoDs) {
        super(mongoDs.getDataStore());
        getDatastore().ensureIndexes();
    }

    @Override
    public Key<Location> save(Location location) {
        Key<Location> save = super.save(location, WriteConcern.SAFE);
        return save;
    }

    @Override
    public List<Location> findLocationsByVendorId(String vendorId) {
        return ds.find(Location.class, Location.VENDOR_ID, vendorId).asList();
    }

    @Override
    public Optional<String> findVendorByLocationId(String locationId) {
        Optional<String> vendor = (Optional<String>) ds.find(Location.class, Location.LOCATION_ID, locationId).field(Location.VENDOR_ID);
        return vendor;
    }

}
