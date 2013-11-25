package search.lanka.core.repository.mongo;

import com.github.jmkgreen.morphia.dao.BasicDAO;
import org.bson.types.ObjectId;
import search.lanka.core.config.MongoDataStore;
import search.lanka.core.domain.Category;
import search.lanka.core.repository.CategoryRepository;

import java.util.List;

/**
 *
 */
public class MongoCategoryRepository extends BasicDAO<Category, ObjectId> implements CategoryRepository {

    protected MongoCategoryRepository(final MongoDataStore mongoDs) {
        super(mongoDs.getDataStore());
        getDatastore().ensureIndexes();
    }

    @Override
    public List<Category> findAllCategories() {
        return ds.find(Category.class).asList();
    }
}
