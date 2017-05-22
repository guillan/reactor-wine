package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by glannebere on 09/05/2017.
 */
@Document
public class Wine {

    @Id
    private Integer id;
    private String name;
    private String region;
    private String appelation;
    private String type;

    public Wine() {
    }

    public Wine(Integer id, String name, String region, String appelation, String type) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.appelation = appelation;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAppelation() {
        return appelation;
    }

    public void setAppelation(String appelation) {
        this.appelation = appelation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
