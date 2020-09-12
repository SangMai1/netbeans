/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_project;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author SANG
 */
public class DataOutPutExample {
    public static void main(String[] args) {
        try {
            FileOutputStream pos = new FileOutputStream("D:/netbean/file1.dat");
            DataOutputStream doc = new DataOutputStream(pos);
            doc.writeInt(10);
            doc.writeDouble(9.5);
            pos.close();
            doc.close();
            System.out.println("Done!"); 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
