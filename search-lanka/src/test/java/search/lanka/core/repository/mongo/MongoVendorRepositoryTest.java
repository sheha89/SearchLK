package search.lanka.core.repository.mongo;

import com.google.common.base.Optional;
import org.junit.Before;
import org.junit.Test;
import search.lanka.core.domain.Vendor;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class MongoVendorRepositoryTest extends AbstractMongoRepositoryTest{

    MongoVendorRepository mongoVendorRepository;

    @Before
    public void setUp() throws Exception {
        dataStore.getDb().getCollection("Vendor").drop();
        mongoVendorRepository = new MongoVendorRepository(dataStore);
    }

    @Test
    public void testSave() throws Exception {
        String id = "V001";
        String name = "temp";
        String about = "about temp";
        Vendor vendor = new Vendor(id, name, about);
        mongoVendorRepository.save(vendor);

        Optional<Vendor> tempVendor = mongoVendorRepository.findVendorsById(id);
        assertTrue("App should be available in db", tempVendor.isPresent());
        assertThat(name, is(tempVendor.get().getName()));
        assertTrue(tempVendor.isPresent());

    }

    @Test
    public void testFindVendorsById() throws Exception {
        String id = "V002";
        String name = "temp 02";
        String about = "about temp 02";
        Vendor vendor = new Vendor(id, name, about);
        mongoVendorRepository.save(vendor);

        Optional<Vendor> tempVendor = mongoVendorRepository.findVendorsById(id);
        assertTrue("Vendor should be available in db", tempVendor.isPresent());
        assertThat(name, is(tempVendor.get().getName()));
    }

    @Test
    public void testFindAllVendors() throws Exception {
        String id = "V003";
        String name = "temp";
        String about = "about temp";
        Vendor vendor = new Vendor(id, name, about);
        mongoVendorRepository.save(vendor);

        List<Vendor> vendors = mongoVendorRepository.findAllVendors();
        assertTrue("Vendors should be available in db", !vendors.isEmpty());
        assertEquals(1, vendors.size());
    }

    @Test
    public void testFindVendorsByCategoryId() throws Exception {

    }

    @Test
    public void testFindVendorsByLocationId() throws Exception {

    }

    @Test
    public void testFindVendorByPostId() throws Exception {

    }
}
