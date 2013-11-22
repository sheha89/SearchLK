package search.lanka.core.repository.mongo;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.google.common.base.Optional;
import org.bson.types.ObjectId;
import search.lanka.core.config.MongoDataStore;
import search.lanka.core.domain.Tag;
import search.lanka.core.repository.TagRepository;

import java.util.List;

/**
 *
 */
public class MongoTagRepository extends BasicDAO<Tag, ObjectId> implements TagRepository {

    protected MongoTagRepository(final MongoDataStore mongoDs) {
        super(mongoDs.getDataStore());
        getDatastore().ensureIndexes();
    }

    @Override
    public Key<Tag> save(Tag tag) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Optional<Tag> findTagsById(String id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Tag> findTagsByPostId(String postId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Tag> findAllTags() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Tag> findTagsByVendorId() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
