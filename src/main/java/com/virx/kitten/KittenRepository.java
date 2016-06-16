package com.virx.kitten;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Virx on 16.06.2016.
 */
@RepositoryRestResource
public interface KittenRepository extends CrudRepository<Kitten, Long> {
}
