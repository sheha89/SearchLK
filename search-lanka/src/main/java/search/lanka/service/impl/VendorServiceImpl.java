package search.lanka.service.impl;

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
    public List<VendorPost> getVendorPostsByVendor(String vendorId) {
        return mongoVendorPostRepository.findPostsByVendorId(vendorId);
    }

    @Override
    public void createVendorPost(VendorPost vendorPost) {
        mongoVendorPostRepository.save(vendorPost);
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
