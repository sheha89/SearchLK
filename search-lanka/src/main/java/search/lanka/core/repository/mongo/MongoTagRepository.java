package search.lanka.core.repository.mongo;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.google.common.base.Optional;
import com.mongodb.WriteConcern;
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
        Key<Tag> save = super.save(tag, WriteConcern.SAFE);
        return save;
    }

    @Override
    public Optional<Tag> findTagById(String tagId) {
        Tag tag = ds.find(Tag.class, Tag.TAG_ID, tagId).get();
        return Optional.fromNullable(tag);
    }




    @Override
    public List<Tag> findAllTags() {
        return ds.find(Tag.class).asList();
    }

    //post repo
    @Override
    public List<Tag> findTagsByVendorId(String vendorId) {
        return null;
    }
}
