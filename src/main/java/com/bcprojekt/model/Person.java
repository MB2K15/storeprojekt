/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcprojekt.model;

/**
 *
 * @author Matt
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * @author Matt
 */

public class Person {


    
    private String Name;
    
    private String Lname;
    private int age;
     
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }


    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", Lname=" + Lname + ", age=" + age + '}';
    }


}

