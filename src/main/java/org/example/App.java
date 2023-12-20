package org.example;

import org.example.model.A;
import org.example.model.B;

import java.io.*;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        InputStream csvA = App.class.getClassLoader().getResourceAsStream("a.csv");
        InputStream csvB = App.class.getClassLoader().getResourceAsStream("b.csv");
        CsvReader<A> readerA = new CsvReader<A>();
        CsvReader<B> readerB = new CsvReader<B>();

        List<A> aList = readerA.csvToBean(csvA, A.class);
        List<B> bList = readerB.csvToBean(csvB, B.class);

        System.out.println("aList = " + aList);
        System.out.println("bList = " + bList);
    }
}
