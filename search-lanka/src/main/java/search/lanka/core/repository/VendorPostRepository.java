package search.lanka.core.repository;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.github.jmkgreen.morphia.dao.DAO;
import com.google.common.base.Optional;
import search.lanka.core.domain.VendorPost;

import java.util.List;

/**
 *
 */
public interface VendorPostRepository implements DAO<VendorPost, K> {

    @Override
    Key<VendorPost> save(VendorPost vendorPost);

    Optional<VendorPost> findVendorPostsById(String id);

    List<VendorPost> findPostsByVendorId(String vendorId);

    List<VendorPost> findPostsByTitle(String title);

    List<VendorPost> findPostsByCategoryId(String categoryId);

    List<VendorPost> findPostsByTagId(String tagId);
}
