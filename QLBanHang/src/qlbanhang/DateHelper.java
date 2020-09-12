/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbanhang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SANG
 */
public class DateHelper {
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    public static String toString(Date date){
        return DATE_FORMAT.format(date);
    }
    public static Date toDate(String strDate) throws ParseException{
        return DATE_FORMAT.parse(strDate);
    }

}
