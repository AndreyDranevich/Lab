package com.university.lab5;

import java.io.IOException;
import java.util.List;

/**
 * Created by Andrey on 23.10.2016.
 */

public class Test {

    public static void main(String[] args) throws IOException{
        Test1();
        Test2();
        Test3();
        Test4();
        Test5();
        Test6();
        Test7();
        Test8();
        Test9();
    }
    public static void Test1()throws IOException {
        List<String> list = Reader.readFile("Task1.txt");
        System.out.println("Test task 1: ");
        String temp;
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i) + " => " + (Regex.isCorrectText(list.get(i)));
            System.out.println(temp);
        }
        System.out.println();

    }

    public static void Test2()throws IOException {
        List<String> list = Reader.readFile("Task2.txt");
        System.out.println("Test task 2: ");
        String temp;
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i) + (Regex.isCorrectTime(list.get(i)) ? " - correctly" : " - not correctly");
            System.out.println(temp);
        }
        System.out.println();
    }
    public static void Test3()throws IOException{
        List<String> list = Reader.readFile("Task3.txt");
        System.out.println("Test task 3: ");
        String temp;
        for(int i=0;i<list.size();i++){
            temp = list.get(i) +( Regex.isCorrectGUID(list.get(i))? " - correctly":" - not correctly");;
            System.out.println(temp);
        }
        System.out.println();
    }
    public static void Test4()throws IOException{
        List<String> list = Reader.readFile("Task4.txt");
        System.out.println("Test task 4: ");
        String temp;
        for(int i=0;i<list.size();i++){
            temp = list.get(i) +( Regex.isCorrectIPV4(list.get(i))? " - correctly":" - not correctly");;
            System.out.println(temp);
        }
        System.out.println();
    }
    public static void Test5()throws IOException{
        List<String> list = Reader.readFile("Task5.txt");
        System.out.println("Test task 5: ");
        String temp;
        for(int i=0;i<list.size();i++){
            temp = list.get(i) +( Regex.isCorrectURL(list.get(i))? " - correctly":" - not correctly");;
            System.out.println(temp);
        }
        System.out.println();
    }
    public static void Test6()throws IOException{
        List<String> list = Reader.readFile("Task6.txt");
        System.out.println("Test task 6: ");
        String temp;
        for(int i=0;i<list.size();i++){
            temp = list.get(i) +( Regex.isCorrectDate(list.get(i))? " - correctly":" - not correctly");;
            System.out.println(temp);
        }
        System.out.println();
    }
    public static void Test7()throws IOException{
        List<String> list = Reader.readFile("Task7.txt");
        System.out.println("Test task 7: ");
        String temp;
        for(int i=0;i<list.size();i++){
            temp = list.get(i) +( Regex.isCorrectHtmlColours(list.get(i))? " - correctly":" - not correctly");;
            System.out.println(temp);
        }
        System.out.println();
    }
    public static void Test8()throws IOException{
        List<String> list = Reader.readFile("Task8.txt");
        System.out.println("Test task 8: ");
        String temp;
        for(int i=0;i<list.size();i++){
            temp = list.get(i) + " => " + Regex.tokens(list.get(i));
            System.out.println(temp);
        }
        System.out.println();
    }
    public static void Test9()throws IOException{
        List<String> list = Reader.readFile("Task9.txt");
        System.out.println("Test task 9: ");
        String temp;
        for(int i=0;i<list.size();i++){
            temp = list.get(i) +( Regex.isCorrectIrc(list.get(i))? " - correctly":" - not correctly");;
            System.out.println(temp);
        }
        System.out.println();
    }

}
