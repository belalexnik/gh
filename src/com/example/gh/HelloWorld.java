package com.example.gh;
import java.math.*;
import java.util.ArrayList;
import java.time.*;
import java.text.NumberFormat ;
import java.time.format.DateTimeFormatter ;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // округдение
        double dblValue = 90.9876;
        long intValue = Math.round(dblValue);
        System.out.println("intValue="+intValue);

        // ArrayList
        ArrayList<String> list = new  ArrayList<>();
        for (int i=0; i < 10; i++){
            list.add("item="+String.valueOf(i));
        }
        list.forEach((x) -> System.out.println( "Элемент: " + x ));

        // Time
        LocalDateTime date = LocalDateTime.now();
        System.out.println( "\nСейчас " + date );
        date = date.withYear(2019) ;
        System.out.println( "\nТеперь текущее время " + date ) ;

        // format number
        NumberFormat nf = NumberFormat.getNumberInstance() ;
        System.out.println( "\nЧисло: " + nf.format(123456789) ) ;
        NumberFormat cf = NumberFormat.getCurrencyInstance() ;
        System.out.println( "\nВалюта: " + cf.format(1234.50f) ) ;
        NumberFormat pf = NumberFormat.getPercentInstance();
        System.out.println( "\nПроцент: " + pf.format( 0.75f ) ) ;
        java.time.LocalDateTime now = java.time.LocalDateTime.now() ;
        DateTimeFormatter df = DateTimeFormatter.ofPattern( "MMM d, yyy" ) ;
        System.out.println( "\nДата: " + now.format( df ) ) ;

    }
}