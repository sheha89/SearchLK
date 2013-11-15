package search.lanka.config;


import com.github.jmkgreen.morphia.Datastore;
import com.github.jmkgreen.morphia.Morphia;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;


import java.net.UnknownHostException;


/**
 *
 */
public class MongoDataStore {
//    private static final Logger LOGGER = LoggerFactory.getLogger(MongoDataStore.class);
    private int port;
    private String host;
    private String dbName;
    private Mongo mongoDb;
    private Datastore dataStore;

    /**
     * Initialize the database connection.
     *
     * @throws UnknownHostException
     */
    public void init() throws UnknownHostException {
//        LOGGER.info("Initializing MongoDB connection to[{}:{}/{}]", new Object[]{host, port, dbName});
        this.mongoDb = new Mongo(host, port);
        this.dataStore = new Morphia().createDatastore(this.mongoDb, dbName);
        this.dataStore.ensureIndexes();
    }

    /**
     * Return reference to mongo database.
     *
     * @return
     */
    public DB getDb() {
        validateDb();
        return this.mongoDb.getDB(dbName);
    }

    /**
     * Return reference to given collection name.
     *
     * @param collectionName
     * @return
     */
    public DBCollection getCollection(String collectionName) {
        return getDb().getCollection(collectionName);
    }

    /**
     * Return Mophia DataStore
     *
     * @return
     */
    public Datastore getDataStore() {
        validateDs();
        return this.dataStore;
    }

    private void validateDb() {
        if (this.mongoDb == null) {
            throw new IllegalStateException("Mongo DB not yet initialized.");
        }
    }

    private void validateDs() {
        if (this.dataStore == null) {
            throw new IllegalStateException("Mongo DB not yet initialized.");
        }
    }

    public Mongo getMongoDb() {
        validateDb();
        return mongoDb;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

}