package com.petssocial.petssocial.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String created_at;
    private String updated_at;
    private Boolean deleted_flg;
    private String user_name;
    private String email;
    private String phone;
    private Date birth_day;
    private String password;
    private String avatar_uri;

    public Users() {
    }

    public Users(Long id, String created_at, String updated_at, Boolean deleted_flg, String user_name, String email, String phone, Date birth_day, String password, String avatar_uri) {
        this.id = id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_flg = deleted_flg;
        this.user_name = user_name;
        this.email = email;
        this.phone = phone;
        this.birth_day = birth_day;
        this.password = password;
        this.avatar_uri = avatar_uri;
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

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(Date birth_day) {
        this.birth_day = birth_day;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar_uri() {
        return avatar_uri;
    }

    public void setAvatar_uri(String avatar_uri) {
        this.avatar_uri = avatar_uri;
    }
}
