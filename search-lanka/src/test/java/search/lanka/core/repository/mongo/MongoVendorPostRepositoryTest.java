package search.lanka.core.repository.mongo;

import com.google.common.base.Optional;
import org.junit.Before;
import org.junit.Test;
import search.lanka.core.domain.VendorPost;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

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

        List<VendorPost> postsByVendorId = mongoVendorPostRepository.findPostsByVendorId(vendor_id);
        assertFalse("VendorPost should be available in db", postsByVendorId.isEmpty());
        assertEquals(1, postsByVendorId.size());

    }

    @Test
    public void testFindPostsByVendorId() throws Exception {
        String postId = "P002";
        String title = "Sample Post";
        String description = "Sample Post Description";
        String image = "../image/location";
        String vendor_id = "V001";

        VendorPost vendorPost = new VendorPost(postId, title, description, vendor_id);
        mongoVendorPostRepository.save(vendorPost);

        List<VendorPost> postsByVendorId = mongoVendorPostRepository.findPostsByVendorId(vendor_id);
        assertFalse("VendorPost should be available in db", postsByVendorId.isEmpty());
        assertEquals(1, postsByVendorId.size());
    }
    @Test
    public void testFindVendorPostsById() throws Exception {
        String postId = "P003";
        String title = "Sample Post";
        String description = "Sample Post Description";
        String image = "../image/location";
        String vendor_id = "V001";

        VendorPost vendorPost = new VendorPost(postId, title, description, vendor_id);
        mongoVendorPostRepository.save(vendorPost);

        Optional<VendorPost> vendorPostsById = mongoVendorPostRepository.findVendorPostById(postId);
        assertTrue("VendorPost should be available in db", vendorPostsById.isPresent());
        assertThat(title, is(vendorPostsById.get().getTitle()));
    }

    @Test
    public void testFindPostsByTitle() throws Exception {
        String postId = "P004";
        String title = "Sample Post";
        String description = "Sample Post Description";
        String image = "../image/location";
        String vendor_id = "V001";

        VendorPost vendorPost = new VendorPost(postId, title, description, vendor_id);
        mongoVendorPostRepository.save(vendorPost);

        List<VendorPost> vendorPostsById = mongoVendorPostRepository.findPostsByTitle(title);
        assertTrue("VendorPost should be available in db", !vendorPostsById.isEmpty());

    }

    @Test
    public void testFindPostsByCategoryId() throws Exception {

    }

    @Test
    public void testFindPostsByTagId() throws Exception {

    }
}
