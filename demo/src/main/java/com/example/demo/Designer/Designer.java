package com.example.demo.Designer;

import com.example.demo.Servies.Servies;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Designers")
public class Designer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String userName;
    private int password;
    private int age;
    private double  rate;
    @Column
    @ElementCollection(targetClass=String.class)
    private List<String> protofolio;
    private boolean availabilty;
    @Column
    @ElementCollection(targetClass=String.class)
    private  List<String> designType;


//    designerType : {
//    "internal design",
//    "external design"
//    }
//    }

@JsonIgnore
@OneToMany(mappedBy = "designer")
private List<Servies> servies;



    public Designer(String fullName, String userName, int password, int age, double rate, List<String> protofolio, boolean availabilty, List<String> designType, List<Servies> servies) {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.rate = rate;
        this.protofolio = protofolio;
        this.availabilty = availabilty;
        this.designType = designType;
        this.servies = servies;
    }
    public Designer(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isAvailabilty() {
        return availabilty;
    }

    public void setAvailabilty(boolean availabilty) {
        availabilty = availabilty;
    }

    public List<Servies> getServies() {
        return servies;
    }

    public void setServies(List<Servies> servies) {
        this.servies = servies;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getProtofolio() {
        return protofolio;
    }

    public void setProtofolio(List<String> protofolio) {
        this.protofolio = protofolio;
    }

    public List<String> getDesignType() {
        return designType;
    }

    public void setDesignType(List<String> designType) {
        this.designType = designType;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", userName='" + userName + '\'' +
                ", password=" + password +
                ", age=" + age +
                ", rate=" + rate +
                ", protofolio=" + protofolio +
                ", availabilty=" + availabilty +
                ", designType=" + designType +
                ", servies=" + servies +
                '}';
    }
}
