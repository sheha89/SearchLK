package search.lanka.core.repository.mongo;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.google.common.base.Optional;
import com.mongodb.WriteConcern;
import org.bson.types.ObjectId;
import search.lanka.core.config.MongoDataStore;
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
    public Optional<Vendor> findVendorsById(String id) {
        Vendor vendor = ds.find(entityClazz, Vendor.VENDOR_ID, id).get();
        return Optional.fromNullable(vendor);
    }

    @Override
    public List<Vendor> findAllVendors() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Vendor> findVendorsByCategoryId(String categoryId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Vendor> findVendorsByLocationId(String locationId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Optional<Vendor> findVendorByPostId(String postId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
