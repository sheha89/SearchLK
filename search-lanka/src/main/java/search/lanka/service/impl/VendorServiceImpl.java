package search.lanka.service.impl;

import search.lanka.model.VendorPost;
import search.lanka.repository.mongo.MongoVendorPostRepository;
import search.lanka.repository.mongo.MongoVendorRepository;
import search.lanka.service.VendorService;

import java.util.List;

/**
 *
 */
public class VendorServiceImpl implements VendorService {

    private MongoVendorRepository mongoVendorRepository;
    private MongoVendorPostRepository mongoVendorPostRepository;

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

}
