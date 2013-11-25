package search.lanka.core.repository.mongo;

import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class MongoCategoryRepositoryTest extends AbstractMongoRepositoryTest{

    MongoCategoryRepository mongoCategoryRepository;

    @Before
    public void setUp() throws Exception {
        dataStore.getDb().getCollection("Category").drop();
        mongoCategoryRepository = new MongoCategoryRepository(dataStore);
    }

    @Test
    public void testFindAllCategories() throws Exception {

    }
}
