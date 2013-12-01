package search.lanka.core.repository.mongo;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.github.jmkgreen.morphia.query.Query;
import com.google.common.base.Optional;
import com.mongodb.WriteConcern;
import org.bson.types.ObjectId;
import search.lanka.core.config.MongoDataStore;
import search.lanka.core.domain.Category;
import search.lanka.core.domain.Vendor;
import search.lanka.core.repository.CategoryRepository;

import java.util.List;

/**
 *
 */
public class MongoCategoryRepository extends BasicDAO<Category, ObjectId> implements CategoryRepository {

    protected MongoCategoryRepository(final MongoDataStore mongoDs) {
        super(mongoDs.getDataStore());
        getDatastore().ensureIndexes();  //creates all defined with @Indexed //apply indexes
    }

    @Override
    public Key<Category> save(final Category category) {
        return super.save(category, WriteConcern.SAFE);
    }

    @Override
    public Optional<Category> findCategoryById(String category_id) {
        Category category = ds.find(Category.class, Category.CATEGORY_ID, category_id).get();
        return Optional.fromNullable(category);
    }

    @Override
    public List<Category> findAllCategories() {
        return ds.find(Category.class).asList();
    }

    @Override
    public List<String> findVendorsByCategoryId(String categoryId) {
        return this.findCategoryById(categoryId).get().getVendors();
    }

}
