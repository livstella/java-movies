package com.example.javamovies.models;


import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name="Character")
public class Character {

    @Id
    @SequenceGenerator(
            name="character_sequence",
            sequenceName = "character_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "character_sequence"

    )
    private Long id;
    private String fullName;
    private String alias;
    private String gender;

    public Character( String fullName, String alias, String gender, String pictureUrl) {
        this.fullName = fullName;
        this.alias = alias;
        this.gender = gender;
        this.pictureUrl = pictureUrl;
    }

    public Character() {

    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", alias='" + alias + '\'' +
                ", gender='" + gender + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    private String pictureUrl;
}
