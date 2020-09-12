/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author SANG
 */
public class Example2 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("filel.dat");
        int c;
        while ((c = fis.read()) != -1) {            
            System.out.println((char) c);
        }
        fis.close();
    }
}
