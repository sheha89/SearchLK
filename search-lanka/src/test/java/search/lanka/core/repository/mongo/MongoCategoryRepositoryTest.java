package search.lanka.core.repository.mongo;

import com.google.common.base.Optional;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import search.lanka.core.domain.Category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class MongoCategoryRepositoryTest extends AbstractMongoRepositoryTest {

    MongoCategoryRepository mongoCategoryRepository;

    @Before
    public void setUp() throws Exception {
        dataStore.getDb().getCollection("Category").drop();
        mongoCategoryRepository = new MongoCategoryRepository(dataStore);
    }

    @Test
    public void testSave() throws Exception {
        String id = "CAT001";
        String name = "Food";

        Category category = new Category(id, name);
        mongoCategoryRepository.save(category);

        Optional<Category> categoriesById = mongoCategoryRepository.findCategoryById(id);
        Assert.assertTrue("Category should be available in db", categoriesById.isPresent());
        assertThat(name, is(categoriesById.get().getCategory_name()));
        Assert.assertTrue(categoriesById.isPresent());

    }

    @Test
    public void testFindCategoryById() throws Exception {
        String name = "Food";
        String id = "CAT002";

        Category category = new Category(id, name);
        mongoCategoryRepository.save(category);

        Optional<Category> categoriesById = mongoCategoryRepository.findCategoryById(id);

        Assert.assertTrue("Category should be available in db", categoriesById.isPresent());
        assertThat(name, is(categoriesById.get().getCategory_name()));
        Assert.assertTrue(categoriesById.isPresent());

    }

    @Test
    public void testFindAllCategories() throws Exception {
        String name = "Food";
        String id = "CAT003";

        Category category = new Category(id, name);
        mongoCategoryRepository.save(category);

        List<Category> categories = mongoCategoryRepository.findAllCategories();
        Assert.assertTrue("categories should be available in db", !categories.isEmpty());
        assertEquals(1, categories.size());
    }

    @Test
    public void testFindVendorsByCategoryId() throws Exception {
        String name = "Food";
        String id = "CAT004";
//        Vendor vendor = new Vendor("110", "name", "about");
//        List<Vendor> vendors = Collections.emptyList();
//        vendors.add(vendor);

        Category category = new Category(id, name);
        category.setVendors(Arrays.asList("3232", "3233"));
        mongoCategoryRepository.save(category);


        List<String> vendorsByCategoryId = mongoCategoryRepository.findVendorsByCategoryId(id);
        assertEquals(2, vendorsByCategoryId.size());
        assertFalse(vendorsByCategoryId.isEmpty());

    }
}
