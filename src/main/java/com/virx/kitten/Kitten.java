package com.virx.kitten;

import lombok.Getter;

import javax.persistence.*;

/**
 * Created by Virx on 16.06.2016.
 */
@Entity
@Getter
public class Kitten {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int ageInYears;
    @Enumerated(EnumType.STRING)
    private KittenColor color;

}