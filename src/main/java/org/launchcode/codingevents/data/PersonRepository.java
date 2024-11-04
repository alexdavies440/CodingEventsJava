package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Person;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{
}
