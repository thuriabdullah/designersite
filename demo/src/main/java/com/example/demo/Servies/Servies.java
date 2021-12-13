package com.example.demo.Servies;

import com.example.demo.Designer.Designer;
import com.example.demo.Gallery.Gallery;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="services")
public class Servies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String title;
    private String description;
    private Date duration;
    private double price;
    private String type;
@ManyToOne(fetch = FetchType.EAGER, optional = false)
//@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//@JoinColumn(name ="designer_id")
private Designer designer;
@OneToOne(fetch = FetchType.EAGER)
private Gallery gallery;


    public Servies(String title, String description, Date duration, double price, String type,Designer designer) {

        this.title = title;
        this.description = description;
        this.duration = duration;
        this.price = price;
        this.type = type;
        this.designer=designer;
    }
    public Servies(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getServiesID() {
        return id;
    }

    public void setServiesID(Long serviesID) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Designer getDesigner() {
        return designer;
    }

    public void setDesigner(Designer designer) {
        this.designer = designer;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }

//    always try to add to string to your classes

    @Override
    public String toString() {
        return "Servies{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", designer=" + designer +
                ", gallery=" + gallery +
                '}';
        /*"title":"ffgghj",
    "description":"fghjkl;",
    "duration":"2020-12-03",
    "price":200,
    "type":"rtyy"*/
    }
}
