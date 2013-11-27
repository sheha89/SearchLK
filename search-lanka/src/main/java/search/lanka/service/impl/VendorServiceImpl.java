package search.lanka.service.impl;

import com.google.common.base.Optional;
import com.google.common.base.Strings;
import search.lanka.core.domain.*;
import search.lanka.core.repository.mongo.*;
import search.lanka.service.VendorService;

import java.util.List;

/**
 *
 */
public class VendorServiceImpl implements VendorService {

    private MongoVendorRepository mongoVendorRepository;
    private MongoVendorPostRepository mongoVendorPostRepository;
    private MongoTagRepository mongoTagRepository;
    private MongoCategoryRepository mongoCategoryRepository;
    private MongoLocationRepository mongoLocationRepository;

    @Override
    public void createVendor(Vendor vendor) {
        mongoVendorRepository.save(vendor);
    }

    @Override
    public Optional<Vendor> getVendorById(String vendor_id) {
        String vendorId = Strings.nullToEmpty(vendor_id).trim();
        if (!vendorId.isEmpty()){
            return Optional.fromNullable(new Vendor());
        }
        return mongoVendorRepository.findVendorById(vendorId);
    }

    @Override
    public List<Vendor> getAllVendors() {
        return mongoVendorRepository.findAllVendors();
    }

    @Override
    public Optional<Vendor> getVendorByPost(String postId) {
        return null;
    }

    @Override
    public List<String> getCategoriesByVendorId(String vendorId) {
        return mongoVendorRepository.findCategoriesByVendorId(vendorId);
    }

    @Override
    public List<Location> getLocationsByVendorId(String vendorId) {
        return mongoVendorRepository.findLocationsByVendorId(vendorId);
    }

    @Override
    public Optional<Vendor> getVendorByLocationId(String locationId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void createVendorPost(VendorPost vendorPost) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<VendorPost> getVendorPostsByVendor(String vendorId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Optional<VendorPost> getVendorPostsById(String postId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<VendorPost> getPostsByTitle(String title) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<VendorPost> getPostsByCategory(String categoryId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<VendorPost> getPostsByTag(String tagId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Tag> getTagsByPostId(String postId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Optional<Vendor> findVendorByPostId(String postId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void createTag(Tag tag) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Optional<Tag> getTagById(String tagId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Tag> getAllTags() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Tag> getTagsByVendorId(String vendorId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void createCategory(Category category) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Optional<Category> getCategoryById(String category_id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Category> getAllCategories() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<String> getVendorsByCategoryId(String categoryId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


    public void setMongoVendorRepository(MongoVendorRepository mongoVendorRepository) {
        this.mongoVendorRepository = mongoVendorRepository;
    }

    public void setMongoVendorPostRepository(MongoVendorPostRepository mongoVendorPostRepository) {
        this.mongoVendorPostRepository = mongoVendorPostRepository;
    }

    public void setMongoTagRepository(MongoTagRepository mongoTagRepository) {
        this.mongoTagRepository = mongoTagRepository;
    }

    public void setMongoCategoryRepository(MongoCategoryRepository mongoCategoryRepository) {
        this.mongoCategoryRepository = mongoCategoryRepository;
    }

    public void setMongoLocationRepository(MongoLocationRepository mongoLocationRepository) {
        this.mongoLocationRepository = mongoLocationRepository;
    }
}
