package dev.entity;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Activity extends PanacheEntity{

    public String description;

}