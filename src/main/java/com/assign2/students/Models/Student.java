package com.assign2.students.Models;

import jakarta.persistence.*;


@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String name;
    private int weight;
    private int height;
    private String haircolor;
    private double gpa;
    public Student() {
    }
    public Student(String name, int weight, int height, String haircolor, double gpa) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.haircolor = haircolor;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public int getHeight() {
        return height;
    }
    public String getHaircolor() {
        return haircolor;
    }
    public double getGpa() {
        return gpa;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    
}

