package com.example.parcel.parcelertest.model;

import org.parceler.Parcel;
import org.parceler.Transient;

/**
 * Created by Administrador on 01/06/2016.
 */

@Parcel
public class User {
    // class vars must be public
    public String name;
    public String lastName;
    public String job;
    @Transient
    public boolean hasCar;

    // empty constructor needed by the Parceler library
    public User() {
    }

    public User(String name, String lastName, String job, boolean hasCar) {
        this.name = name;
        this.lastName = lastName;
        this.job = job;
        this.hasCar = hasCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }
}
