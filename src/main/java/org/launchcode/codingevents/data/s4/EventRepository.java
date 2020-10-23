package org.launchcode.codingevents.data.s4;

import org.launchcode.codingevents.models.s4.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Chris Bay
 */
@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
