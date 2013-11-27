package search.lanka.core.repository.mongo;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.github.jmkgreen.morphia.query.Query;
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
        return this.findVendorById(vendorId).get().getCategories();
    }

    @Override
    public List<Location> findLocationsByVendorId(String vendorId) {
        return this.findVendorById(vendorId).get().getLocations();
    }

    @Override
    public List<Vendor> findVendorsByLocation(String location) {
        Query vendors = ds.createQuery(Vendor.class).field("Vendor.location.location").equal(location);
        return vendors.asList();

        /*
        *         DBCollection tasksCollection = dataStore.getCollection("br_tasks");
        BasicDBObject query = new BasicDBObject().append("br_request.message_data.bulkAppId", bulkAppId);

        DBCursor cursor = tasksCollection.find(query).sort(new BasicDBObject("schedule_time", -1)).skip(lastSentIndex).limit(batchSize);
        List<Task> tasks = new ArrayList<Task>();
        while (cursor.hasNext()) {
            tasks.add(Task.fromDbObject(cursor.next()));
        }

        return tasks;
        * */
    }


}
