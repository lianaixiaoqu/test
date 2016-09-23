package com.demo.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by taylor on 8/7/16.
 * twitter: @taylorwang789
 */
public class DateUtil {


    public static Date toDate(String date , String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat) ;
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static long toMillisecond(String date , String dateFormat) {
        return toDate(date,dateFormat).getTime();
    }

    public static String toString(Date date , String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat) ;
        return sdf.format(date);
    }


}
