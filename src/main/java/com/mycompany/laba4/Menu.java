/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laba4;
import java.util.Scanner;
/**
 *
 * @author gribu
 */
public class Menu {
    public int menu(){
        int selection ;
        Scanner input = new Scanner (System.in) ;
        System.out.println("1 - list all authors") ;
        System.out.println("2 - create new authors") ;
        System.out.print("choose menu item:");
        selection = input.nextInt() ;
        return selection ;
    }
}
