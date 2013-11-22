package search.lanka.core.repository.mongo;

import org.junit.Before;
import org.junit.Test;
import search.lanka.core.domain.VendorPost;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class MongoVendorPostRepositoryTest extends AbstractMongoRepositoryTest{

    MongoVendorPostRepository mongoVendorPostRepository;

    @Before
    public void setUp() throws Exception {
        dataStore.getDb().getCollection("VendorPost").drop();
        mongoVendorPostRepository = new MongoVendorPostRepository(dataStore);
    }

    @Test
    public void testSave() throws Exception {
        String postId = "P001";
        String title = "Sample Post";
        String description = "Sample Post Description";
        String image = "../image/location";
        String vendor_id = "V001";

        VendorPost vendorPost = new VendorPost(postId, title, description, vendor_id);
        mongoVendorPostRepository.save(vendorPost);

    }

    @Test
    public void testFindPostsByVendorId() throws Exception {
        String postId = "P001";
        String title = "Sample Post";
        String description = "Sample Post Description";
        String image = "../image/location";
        String vendor_id = "V001";

        VendorPost vendorPost = new VendorPost(postId, title, description, vendor_id);
        mongoVendorPostRepository.save(vendorPost);

        List<VendorPost> postsByVendorId = mongoVendorPostRepository.findPostsByVendorId(postId);
        assertTrue("App should be available in db", !postsByVendorId.isEmpty());
        assertEquals(1, postsByVendorId.size());
    }
}
