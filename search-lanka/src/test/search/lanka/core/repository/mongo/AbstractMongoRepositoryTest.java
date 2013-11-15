package search.lanka.core.repository.mongo;

import org.junit.BeforeClass;
import search.lanka.core.config.MongoDataStore;

import java.net.UnknownHostException;

/**
 *
 */
public class AbstractMongoRepositoryTest {

    protected static MongoDataStore dataStore;

    @BeforeClass
    public static void init() {
//        BasicConfigurator.configure();
        dataStore = new MongoDataStore();
        dataStore.setDbName("search-test");
        dataStore.setHost("localhost");
        dataStore.setPort(27017);
        try {
            dataStore.init();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
