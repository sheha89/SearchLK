package search.lanka.core.repository.mongo;

import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class MongoTagRepositoryTest extends AbstractMongoRepositoryTest{

    MongoTagRepository mongoTagRepository;

    @Before
    public void setUp() throws Exception {
        dataStore.getDb().getCollection("Tag").drop();
        mongoTagRepository = new MongoTagRepository(dataStore);
    }

    @Test
    public void testSave() throws Exception {

    }

    @Test
    public void testFindTagsById() throws Exception {

    }

    @Test
    public void testFindTagsByPostId() throws Exception {

    }

    @Test
    public void testFindAllTags() throws Exception {

    }

    @Test
    public void testFindTagsByVendorId() throws Exception {

    }
}
