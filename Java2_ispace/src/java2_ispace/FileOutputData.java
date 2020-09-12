/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_ispace;

import java.io.DataOutputStream;
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
public class FileOutputData {

    static void write(String FILE_NAME) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void writeFile(String fileName, List ls) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ls);
        } catch (Exception ex) {
            System.out.println("Error"+ex.toString());
        }
    }
    public static List readFile(String fileName){
        List ls = new ArrayList();
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream red = new ObjectInputStream(fis);
            ls = (List) red.readObject();
            red.close();
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
}
