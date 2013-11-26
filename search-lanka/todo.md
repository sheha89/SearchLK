Add many to many relationships
and updated queries

add indexes on querying fields

Embed locations to vendor as locations are unique to them

https://github.com/mongodb/morphia/wiki/DAOSupport
https://github.com/mongodb/morphia/wiki/Query



compound indexes
@Entity // this is require to know where the indexes are to be created
@Indexes( @Index("user, -date") )

@Indexes({
   @Index("user, -cs"),
   @Index("changedRecord, -cs")})


public List<BlogEntry> findByTitle( String title ) {
    Pattern regExp = Pattern.compile(title + ".*", Pattern.CASE_INSENSITIVE);
    return ds.find(entityClazz).filter("title", regExp).sort("title").asList();
}

avoid multiple querying?
get by city?

performance and database capacity

embedding over referencing

less queries


if embedding duplicates same data reference them

data models should avoid document growth when possible.

@Entity(value="hotels", noClassnameStored=true) so can name class Hotel
noClassnameStored needed for when children are being stored in the same collection -> cats and dogs in the animal
otherwise mophia won't know which one to save

____________
would not have its own ID, and would not be stored in a separate collection. In this case we would annotate the Address class as @Embedded
___________

-------------------------------------------------------------------------------------------

Test log4j integration
Write test cases for new ones
Category ?

-----------------------------------------------------------------------------------

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


--------------------------------------------------------------------------------------

for names and tiles 
 Pattern regex = Pattern.compile(name, Pattern.CASE_INSENSITIVE);


private static final Logger LOGGER = LoggerFactory.getLogger(MongoSubscriberRepository.class);


        ContactGroup result = ds.find(ContactGroup.class, ContactGroup.BULK_APP_ID, bulkAppId)
                .filter(ContactGroup.GROUP_ID, groupId).get();


        String appId = Strings.nullToEmpty(bulkAppId).trim();
        if (appId.isEmpty())
            return new MessageHistoryResp(ResponseCode.ERROR_CAN_NOT_SEARCH_WITH_NULL);


memory can contain array of size of million which is not good

------------------------------------------------------------------------------------------------
