package search.lanka.core.repository;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.DAO;
import org.bson.types.ObjectId;
import search.lanka.core.domain.Category;

import java.util.List;

/**
 *
 */
public interface CategoryRepository extends DAO<Category, ObjectId> {

    @Override
    Key<Category> save(Category category);

    List<Category> findAllCategories();

}
