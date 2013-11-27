package search.lanka.core.repository;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.DAO;
import com.google.common.base.Optional;
import org.bson.types.ObjectId;
import search.lanka.core.domain.Category;
import search.lanka.core.domain.Vendor;

import java.util.List;

/**
 *
 */
public interface CategoryRepository extends DAO<Category, ObjectId> {

    @Override
    Key<Category> save(Category category);

    Optional<Category> findCategoryById(String category_id);

    List<Category> findAllCategories();

    List<String> findVendorsByCategoryId(String categoryId);
    //can be retrieved by    #findCategoryById
}
