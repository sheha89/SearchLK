package search.lanka.repository.mongo;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.mongodb.WriteConcern;
import org.bson.types.ObjectId;
import search.lanka.config.MongoDataStore;
import search.lanka.model.VendorPost;
import search.lanka.repository.VendorPostRepository;

import java.util.List;

/**
 *
 */
public class MongoVendorPostRepository extends BasicDAO<VendorPost, ObjectId> implements VendorPostRepository {

    protected MongoVendorPostRepository(final MongoDataStore mongoDs) {
        super(mongoDs.getDataStore());
        getDatastore().ensureIndexes();
    }

    @Override
    public Key<VendorPost> save(final VendorPost vendorPost) {
        return super.save(vendorPost, WriteConcern.SAFE);
    }

    @Override
    public List<VendorPost> findPostsByVendorId(String vendorId) {
        List<VendorPost> posts = ds.find(VendorPost.class, VendorPost.VENDOR_ID, vendorId).asList();
        return posts;
    }

}
