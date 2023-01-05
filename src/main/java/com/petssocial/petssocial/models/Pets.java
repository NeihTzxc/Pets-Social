package com.petssocial.petssocial.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Pets {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String created_at;
    private String updated_at;
    private Boolean deleted_flg;
    private String name;
    private Date birth_day;
    private String avatar_uri;
    private Integer status;
    private Float weight;
    private Float height;
    private Float length;

    public Pets(Long id) {
        this.id = id;
    }

    public Pets(Long id, String created_at, String updated_at, Boolean deleted_flg, String name, Date birth_day, String avatar_uri, Integer status, Float weight, Float height, Float length) {
        this.id = id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_flg = deleted_flg;
        this.name = name;
        this.birth_day = birth_day;
        this.avatar_uri = avatar_uri;
        this.status = status;
        this.weight = weight;
        this.height = height;
        this.length = length;
    }

    public Pets() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Boolean getDeleted_flg() {
        return deleted_flg;
    }

    public void setDeleted_flg(Boolean deleted_flg) {
        this.deleted_flg = deleted_flg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(Date birth_day) {
        this.birth_day = birth_day;
    }

    public String getAvatar_uri() {
        return avatar_uri;
    }

    public void setAvatar_uri(String avatar_uri) {
        this.avatar_uri = avatar_uri;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }
}
