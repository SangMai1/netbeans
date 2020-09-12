/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SANG
 */
public class DateHelper {

    static final SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");

    public static String toString(Date date, String... pa) {
        if (pa.length > 0) {
            date_format.applyPattern(pa[0]);
        }
        if (date == null) {
            date = DateHelper.now();
        }
        return date_format.format(date);
    }

    public static Date todate(String date, String... pa) {
        try {
            if (pa.length > 0) {
                date_format.applyPattern(pa[0]);
            }
            if (date == null) {
                return DateHelper.now();
            }
            return date_format.parse(date);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Date now() {
        return new Date();
    }
    public static Date todate(Date birthday, String ddMMyyyy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
