package com.detroitlabs.apiproject.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

//any property that doesn't match, this annotation ignores it
@JsonIgnoreProperties(ignoreUnknown = true)
public class MakeupProduct{

    private String id;
    private String name;
    private String brand;
    private String description;
    private String image_link;
    private String product_link;
    private String product_type;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("image_link")
    public String getImage_link() {
        return image_link;
    }

    @JsonProperty("image_link")
    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    @JsonProperty("product_link")
    public String getProduct_link() {
        return product_link;
    }

    @JsonProperty("product_link")
    public void setProduct_link(String product_link) {
        this.product_link = product_link;
    }
    @JsonProperty("product_type")
    public String getProduct_type() {
        return product_type;
    }
    @JsonProperty("product_type")
    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }
}
