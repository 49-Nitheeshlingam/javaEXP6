/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author 22cseb57
 */
public class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String a;
        System.out.println("Enter the String:");
        a=obj.next();
        char b[]=a.toCharArray();
        try
        {
            System.out.println(a.substring(10));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("String Array Index Value is Out of Range");
        }
    }
}