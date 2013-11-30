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
    public List<Vendor> getVendorsByLocation(String locationId) {
        return mongoVendorRepository.findVendorsByLocation(locationId);
    }

    @Override
    public void createVendorPost(VendorPost vendorPost) {
        mongoVendorPostRepository.save(vendorPost);
    }

    @Override
    public List<VendorPost> getVendorPostsByVendor(String vendorId) {
        return mongoVendorPostRepository.findPostsByVendorId(vendorId);
    }

    @Override
    public Optional<VendorPost> getVendorPostsById(String postId) {
        return mongoVendorPostRepository.findVendorPostById(postId);
    }

    @Override
    public List<VendorPost> getPostsByTitle(String title) {
        return mongoVendorPostRepository.findPostsByTitle(title);
    }

    @Override
    public List<VendorPost> getPostsByCategory(String categoryId) {
        return mongoVendorPostRepository.findPostsByCategoryId(categoryId);
    }

    @Override
    public List<VendorPost> getPostsByTag(String tagId) {
        return mongoVendorPostRepository.findPostsByTagId(tagId);
    }

    @Override
    public List<String> getTagsByPostId(String postId) {
        return mongoVendorPostRepository.findTagsByPostId(postId);
    }

    @Override
    public String getVendorByPostId(String postId) {
        return mongoVendorPostRepository.findVendorByPostId(postId);
    }

    @Override
    public void createTag(Tag tag) {
        mongoTagRepository.save(tag);
    }

    @Override
    public Optional<Tag> getTagById(String tagId) {
        return mongoTagRepository.findTagById(tagId);
    }

    @Override
    public List<Tag> getAllTags() {
        return mongoTagRepository.findAllTags();
    }

    @Override
    public List<Tag> getTagsByVendorId(String vendorId) {
        return mongoTagRepository.findTagsByVendorId(vendorId);
    }

    @Override
    public void createCategory(Category category) {
        mongoCategoryRepository.save(category);
    }

    @Override
    public Optional<Category> getCategoryById(String category_id) {
        return mongoCategoryRepository.findCategoryById(category_id);
    }

    @Override
    public List<Category> getAllCategories() {
        return mongoCategoryRepository.findAllCategories();
    }

    @Override
    public List<String> getVendorsByCategoryId(String categoryId) {
        return mongoCategoryRepository.findVendorsByCategoryId(categoryId);
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
