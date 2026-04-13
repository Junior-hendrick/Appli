/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;
import java.util.ArrayList;
import java.util.Scanner;
// Name Rakhumo Junior Kemorwe 
// ST 10520371
/**
 *
 * @author Student
 */
public class Log {
     Scanner input = new Scanner(System.in);
     public ArrayList<String> usernames = new ArrayList<>();
      public ArrayList<String> OldPasswords = new ArrayList<>();
      
      public boolean isPassword(String user, String pass){
        System.out.print("Enter Username : ");  
        System.out.print("Enter Password : ");
        user = input.nextLine();
        pass = input.nextLine();
            if (usernames.contains(user) && OldPasswords.contains(pass)){ 
                System.out.println("Welcome back: Rakhumo Junior Kemorwe");
                return true; //Username already exists
            }
       System.out.println("Invalid ");
        return false; // Username does not already exists and is new 
    }
    
    
    
}
