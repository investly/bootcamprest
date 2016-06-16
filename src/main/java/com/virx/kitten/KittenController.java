package com.virx.kitten;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Virx on 16.06.2016.
 */
@RestController
public class KittenController {

    KittenRepository kittenRepository;

    public KittenController(KittenRepository repository) {
        this.kittenRepository = repository;
    }

    @RequestMapping(value = "/cutest/add", method = RequestMethod.PUT)
    public Kitten save(@RequestBody Kitten kitten) {
        return kittenRepository.save(kitten);
    }

}
