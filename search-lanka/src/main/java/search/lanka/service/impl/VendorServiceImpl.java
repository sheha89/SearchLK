package search.lanka.service.impl;

import com.google.common.base.Optional;
import search.lanka.core.domain.Vendor;
import search.lanka.core.domain.VendorPost;
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
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Optional<Vendor> getVendorById(String vendor_id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Vendor> getAllVendors() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Vendor> getVendorsByCategory(String categoryId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Optional<Vendor> findVendorByPost(String postId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<VendorPost> getVendorPostsByVendor(String vendorId) {
        return mongoVendorPostRepository.findPostsByVendorId(vendorId);
    }

    @Override
    public void createVendorPost(VendorPost vendorPost) {
        mongoVendorPostRepository.save(vendorPost);
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
