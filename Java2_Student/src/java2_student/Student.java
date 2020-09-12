/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_student;

import java.io.Serializable;

/**
 *
 * @author SANG
 */
public class Student implements Serializable{
    private int id;
    private String name;
    private float html;
    private float php;

    public Student() {
    }

    public Student(int id, String name, float html, float php) {
        this.id = id;
        this.name = name;
        this.html = html;
        this.php = php;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(float html) {
        this.html = html;
    }

    public double getPhp() {
        return php;
    }

    public void setPhp(float php) {
        this.php = php;
    }

   public double sum(){
       return this.html + this.php;
   }
   public double avg(){
       return (this.html + this.php) /2;
   }
}
