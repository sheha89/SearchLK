package search.lanka.core.repository.mongo;

import com.google.common.base.Optional;
import org.junit.Before;
import org.junit.Test;
import search.lanka.core.domain.Location;
import search.lanka.core.domain.Vendor;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<String> cats = new ArrayList<>();
        cats.add("CAT1"); cats.add("CAT2");

        Vendor vendor = new Vendor(id, name, about);
        vendor.setCategories(cats);
        mongoVendorRepository.save(vendor);

        Optional<Vendor> tempVendor = mongoVendorRepository.findVendorById(id);
        assertTrue("App should be available in db", tempVendor.isPresent());
        assertThat(name, is(tempVendor.get().getName()));
        assertTrue(tempVendor.isPresent());

    }

    @Test
    public void testFindVendorById() throws Exception {
        String id = "V002";
        String name = "temp 02";
        String about = "about temp 02";
        Vendor vendor = new Vendor(id, name, about);
        mongoVendorRepository.save(vendor);

        Optional<Vendor> tempVendor = mongoVendorRepository.findVendorById(id);
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
    public void testFindCategoriesByVendorId() throws Exception {
        String id = "V004";
        String name = "temp";
        String about = "about temp";
        Vendor vendor = new Vendor(id, name, about);
        vendor.setCategories(Arrays.asList("Cata1", "Cat2"));
        mongoVendorRepository.save(vendor);

        List<String> catsByVendor = mongoVendorRepository.findCategoriesByVendorId(id);
        assertTrue("Vendors should be available in db", !catsByVendor.isEmpty());
        assertEquals(2, catsByVendor.size());
    }

    @Test
    public void testFindLocationsByVendorId() throws Exception {
        String id = "V005";
        String name = "temp";
        String about = "about temp";
        Vendor vendor = new Vendor(id, name, about);
        vendor.setCategories(Arrays.asList("Cata1", "Cat2"));

        String location_name = "msbola";
        String city = "wattala";
        String addy = "612/1/a";

        Location location = new Location(location_name, city, addy);

        vendor.setLocations(Arrays.asList(location));

        mongoVendorRepository.save(vendor);

        List<Location> locationsById = mongoVendorRepository.findLocationsByVendorId(id);
        assertTrue("Locations should be available in db", locationsById.isEmpty());
        assertEquals(1, locationsById.size());
    }

    @Test
    public void testFindVendorsByLocation() throws Exception {
        String id = "V006";
        String name = "temp";
        String about = "about temp";
        Vendor vendor = new Vendor(id, name, about);
        vendor.setCategories(Arrays.asList("Cata1", "Cat2"));

        String location_name = "msbolaaa";
        String city = "wattala";
        String addy = "612/1/a";

        Location location = new Location(location_name, city, addy);

        vendor.setLocations(Arrays.asList(location));

        mongoVendorRepository.save(vendor);

        List<Vendor> ById = mongoVendorRepository.findVendorsByLocation(location_name);
        assertTrue("Vendors should be available in db", ById.isEmpty());
        assertEquals(1, ById.size());
    }
}
