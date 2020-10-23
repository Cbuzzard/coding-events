package org.launchcode.codingevents.data.s4;

import org.launchcode.codingevents.models.s4.EventCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Chris Bay
 */
@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {

}
