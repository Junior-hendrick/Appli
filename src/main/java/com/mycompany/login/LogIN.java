/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;
import java.util.Scanner;
// Name Rakhumo Junior Kemorwe 
// ST 10520371
/**
 *
 * @author Student
 */
public class LogIN {

    public static void main(String[] args) {
        Registration Regi = new Registration(); 
        Scanner input = new Scanner(System.in);
       
        
        // Creating a menu
        
        System.out.println("\n=====Menu======");    
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit ");  
        
        
        
        
       
     System.out.println("Enter Username: "); 
     String newUsername = input.nextLine();
     Regi.isUsernameused(newUsername);
     
    }
    
}
