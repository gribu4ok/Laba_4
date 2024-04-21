/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laba4;
import java.sql.Connection;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author gribu
 */
public class Laba4 {

    public static void main(String[] args) {
        try {
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        } catch (Exception e){} 
        System.out.println("При віт");
        Database database = new Database();
        Connection c = database.getConnection();
        DataExtractor de = new  DataExtractor(c);
        DataInsert di = new DataInsert(c);
        Scanner input = new Scanner (System.in) ;
        //di.insertAuthor("Test1", "Test1", "Tese1");
        //de.getData();
        Menu menu = new Menu() ;
        while(true) {
            int selection = menu.menu(); 
            switch (selection) {
                case 1: 
                    de.getData();
                    break;
                case 2: 
                    System.out.print("new author firstname: ");
                    String first_name = input.nextLine();
                    System.out.print("new author lastname: ");
                    String last_name = input.nextLine();
                    System.out.print("new author middlename: ");
                    String middle_name = input.nextLine();
                    di.insertAuthor (first_name, last_name, middle_name);
                    break;
                default: 
                    System.out.println("chosse entry from menu ");
            }
        }
    }
}
