package search.lanka.core.repository;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.DAO;
import com.google.common.base.Optional;
import org.bson.types.ObjectId;
import search.lanka.core.domain.Tag;
import search.lanka.core.domain.Vendor;
import search.lanka.core.domain.VendorPost;

import java.util.List;

/**
 *
 */
public interface VendorPostRepository extends DAO<VendorPost, ObjectId> {

    @Override
    Key<VendorPost> save(VendorPost vendorPost);

    Optional<VendorPost> findVendorPostById(String postId);

    List<VendorPost> findPostsByVendorId(String vendorId);

    List<VendorPost> findPostsByTitle(String title);

    List<VendorPost> findPostsByCategoryId(String categoryId);

    List<Tag> findTagsByPostId(String postId);

    List<VendorPost> findPostsByTagId(String tagId);

    Optional<Vendor> findVendorByPostId(String postId);

}
