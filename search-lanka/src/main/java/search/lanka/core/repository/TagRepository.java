package search.lanka.core.repository;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.DAO;
import com.google.common.base.Optional;
import search.lanka.core.domain.Tag;

import java.util.List;

/**
 *
 */
public interface TagRepository implements DAO<Tag, K> {

    @Override
    Key<Tag> save(Tag tag);

    Optional<Tag> findTagsById(String id);

    List<Tag> findTagsByPostId(String postId);

    List<Tag> findAllTags();

    List<Tag> findTagsByVendorId();

}
