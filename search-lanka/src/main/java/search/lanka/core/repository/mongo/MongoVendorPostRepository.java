package search.lanka.core.repository.mongo;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.google.common.base.Optional;
import com.mongodb.WriteConcern;
import org.bson.types.ObjectId;
import search.lanka.core.config.MongoDataStore;
import search.lanka.core.domain.Vendor;
import search.lanka.core.domain.VendorPost;
import search.lanka.core.repository.VendorPostRepository;

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
    public Optional<VendorPost> findVendorPostById(String postId) {
        VendorPost vendorPost = ds.find(VendorPost.class, VendorPost.POST_ID, postId).get();
        return Optional.fromNullable(vendorPost);
    }

    @Override
    public List<VendorPost> findPostsByVendorId(String vendorId) {
        List<VendorPost> posts = ds.find(VendorPost.class, VendorPost.VENDOR_ID, vendorId).asList();
        return posts;
    }

    @Override
    public List<VendorPost> findPostsByTitle(String title) {
        List<VendorPost> posts = ds.find(VendorPost.class, VendorPost.TITLE, title).asList();
        return posts;
    }

    @Override
    public List<VendorPost> findPostsByCategoryId(String categoryId) {
        return null;
    }

    @Override
    public List<VendorPost> findPostsByTagId(String tagId) {
        return null;
    }

    @Override
    public Optional<Vendor> findVendorByPostId(String postId) {
        return (Optional<Vendor>) ds.find(VendorPost.class, VendorPost.POST_ID, postId).field(Vendor.VENDOR_ID);
    }

}
