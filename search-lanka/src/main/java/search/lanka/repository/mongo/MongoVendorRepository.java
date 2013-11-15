package search.lanka.repository.mongo;

import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.github.jmkgreen.morphia.query.Query;
import com.google.common.base.Optional;
import com.mongodb.WriteConcern;
import org.bson.types.ObjectId;
import search.lanka.config.MongoDataStore;
import search.lanka.model.Vendor;
import search.lanka.repository.VendorRepository;

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
    public com.github.jmkgreen.morphia.Key<Vendor> save(final Vendor vendor) {
        return super.save(vendor, WriteConcern.SAFE);
    }

    @Override
    public Optional<Vendor> findVendorsById(String id) {
        Vendor vendor = ds.find(entityClazz, Vendor.VENDOR_ID, id).get();
        return Optional.fromNullable(vendor);
    }

}
