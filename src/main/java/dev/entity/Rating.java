package dev.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Rating extends PanacheEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    public Activity activity;

    @ManyToOne(fetch = FetchType.EAGER)
    public Student student;

    public Note note;

}