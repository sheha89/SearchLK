Test log4j integration
Write test cases for new ones
Category ?



SearchLK
========

SearchLk

integrate log4j
integrate git
db-scripts

getPostsByVendor
getPostByTitle
getPostsByCategory
getPostsBytag

getTagsAllTags
getTagsByVendor
getTagsByPost

getLocationsByVendor
getAllCategories

getVendorsAllVendors
getVendorsByCategory
getVendorsByLocation





for names and tiles 
 Pattern regex = Pattern.compile(name, Pattern.CASE_INSENSITIVE);


private static final Logger LOGGER = LoggerFactory.getLogger(MongoSubscriberRepository.class);


        ContactGroup result = ds.find(ContactGroup.class, ContactGroup.BULK_APP_ID, bulkAppId)
                .filter(ContactGroup.GROUP_ID, groupId).get();


        String appId = Strings.nullToEmpty(bulkAppId).trim();
        if (appId.isEmpty())
            return new MessageHistoryResp(ResponseCode.ERROR_CAN_NOT_SEARCH_WITH_NULL);


memory can contain array of size of million which is not good
