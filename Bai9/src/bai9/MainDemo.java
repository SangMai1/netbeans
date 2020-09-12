/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class MainDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        //ghi flie
        List<Person> ls = new ArrayList<>();//
        FileOutputStream fos = new FileOutputStream("file1.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ls.add(new Person(1, "A1"));
        ls.add(new Person(2, "A2"));
        ls.add(new Person(3, "A3"));
        
//        Person p = new Person(1, "Hai Chau");
        oos.writeObject(ls);
        oos.close();
        //doc file sau do in ra man hinh
        List<Person> ls1 = new ArrayList<>();
        FileInputStream fis = new FileInputStream("file1.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
//        Person p1 = (Person) ois.readObject();
//        System.out.println("=>"+p1.toString());
        ls1 = (List<Person>) ois.readObject();//
        for (Person pp : ls1) {
            pp.print();
        }
//        p1.print();
        ois.close();
        fis.close();
    }
}
