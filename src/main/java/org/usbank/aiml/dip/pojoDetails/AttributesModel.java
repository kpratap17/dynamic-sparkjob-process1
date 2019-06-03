package org.usbank.aiml.dip.pojoDetails;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"order","name","type","length","posfrom","posto","universalrule","policyrule"})
public class AttributesModel {
    private Integer order;
    private String name;
    private String type;
    private Integer length;
    private Integer posfrom;
    private Integer posto;
    private String universalrule;
    private String policyrule;

    public AttributesModel(Integer order, String name, String type, Integer length, Integer posfrom, Integer posto, String universalrule, String policyrule) {
        this.order = order;
        this.name = name;
        this.type = type;
        this.length = length;
        this.posfrom = posfrom;
        this.posto = posto;
        this.universalrule = universalrule;
        this.policyrule = policyrule;
    }

    public AttributesModel(){

    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getPosfrom() {
        return posfrom;
    }

    public void setPosfrom(Integer posfrom) {
        this.posfrom = posfrom;
    }

    public Integer getPosto() {
        return posto;
    }

    public void setPosto(Integer posto) {
        this.posto = posto;
    }

    public String getUniversalrule() {
        return universalrule;
    }

    public void setUniversalrule(String universalrule) {
        this.universalrule = universalrule;
    }

    public String getPolicyrule() {
        return policyrule;
    }

    public void setPolicyrule(String policyrule) {
        this.policyrule = policyrule;
    }

    @Override
    public String toString() {
        return "AttributesModel{" +
                "order=" + order +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                ", posfrom=" + posfrom +
                ", posto=" + posto +
                ", universalrule='" + universalrule + '\'' +
                ", policyrule='" + policyrule + '\'' +
                '}';
    }
}

