/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdsoft.techblog.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Programmer Hrishav
 */
public class DateUtils {
    public static final DateTimeFormatter format=DateTimeFormat.forPattern("EEEEE, dd MMMMM yyyy");
    public static String getDate(){
        return DateTime.now().toString(format);
    }
    
    public static String getTime(){
        return DateTime.now().toString(DateTimeFormat.forPattern("hh : mm : ss a"));
    }
    
    public static String convert(String date){
        DateTime dt=DateTime.parse(date, DateTimeFormat.forPattern("yyyy-MM-dd"));
        return dt.toString(DateTimeFormat.forPattern("EEEEE, dd MMMMM yyyy"));
    }
}
