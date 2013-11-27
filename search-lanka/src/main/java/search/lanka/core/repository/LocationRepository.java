package search.lanka.core.repository;

import com.github.jmkgreen.morphia.Key;
import com.github.jmkgreen.morphia.dao.DAO;
import com.google.common.base.Optional;
import org.bson.types.ObjectId;
import search.lanka.core.domain.Location;
import search.lanka.core.domain.Vendor;

import java.util.List;

/**
 *
 */
public interface LocationRepository extends DAO<Location, ObjectId> {

    @Override
    Key<Location> save(Location location);

}
