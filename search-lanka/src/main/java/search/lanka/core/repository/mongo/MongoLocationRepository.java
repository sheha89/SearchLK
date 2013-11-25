package search.lanka.core.repository.mongo;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.mongodb.WriteConcern;
import org.bson.types.ObjectId;
import search.lanka.core.config.MongoDataStore;
import search.lanka.core.domain.Location;
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
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
