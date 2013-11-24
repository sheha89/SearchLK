package search.lanka.core.repository;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.DAO;
import com.google.common.base.Optional;
import org.bson.types.ObjectId;
import search.lanka.core.domain.Tag;

import java.util.List;

/**
 *
 */
public interface TagRepository extends DAO<Tag, ObjectId> {

    @Override
    Key<Tag> save(Tag tag);

    Optional<Tag> findTagsById(String tagId);

    List<Tag> findTagsByPostId(String postId);

    List<Tag> findAllTags();

    List<Tag> findTagsByVendorId(String vendorId);

}
