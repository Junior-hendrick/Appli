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
public class Registration {
    public void Registra (){
        
    }
    Scanner input = new Scanner(System.in);
     public ArrayList<String> usernames = new ArrayList<>(); 
     public ArrayList<String> OldPasswords = new ArrayList<>();
     private ArrayList<String> phoneNumbers = new ArrayList<>();
     public Registration(){
         //Contains ols usernames
        usernames.add("Pass");
         usernames.add("Hello");
          usernames.add("Admin");
          
          // Contains old passwords
          OldPasswords.add("Pass@123");
       OldPasswords.add("Hello&99");
       OldPasswords.add("Admin^01");
       
       // Contains old Numbers
       phoneNumbers.add("0762749502");
        phoneNumbers.add("0645075884");
        phoneNumbers.add("0726118647");
     }
      public boolean isUsernameused(String newUsername){
        System.out.print("Enter a new Username : ");  
        newUsername = input.nextLine();
        String Name = input.nextLine(); 
         String Surname = input.nextLine();
        
            if (usernames.contains(newUsername)){ 
               System.out.print("Username already exists"); 
                return true; //Username already exists
            }
        System.out.println("Welcome: "+Name+""+Surname);
        
        return false; // Username does not already exists and is new 
    }
    
    
       String newPassword = input.nextLine();
     // Method to confirm password 
    public  boolean confirmPassword(String password, String confirmPassword){
       System.out.print("Enter a new password : ");
            return password.equals(confirmPassword);
        }
      //Method to check if password already exists
    public boolean isPasswordused(String newPassword){
       
            if (OldPasswords.contains(newPassword)){ 
                 System.out.println("This password has already been used. Please choose a different one");
                return true; //Password already exists
            }
        
        return false; // Password does not already exists and is new 
    }
   // Method to validate if the phone number is following the right format
    public boolean isValidPassword(String password){
        // Code to make sure number has 10 digits and starts with a 0
        if (password.length() <8){
            System.out.println("Password must be at least 8 characters long");
            return false;
            // Check if entered characters are all numbers
        }
            if (!password.matches(".*[A-Z].*")){
               System.out.println("Password must contain at least 1 Uppercase Letter.");
               return false;
            }
           if(!password.matches(".*[!@#$%^&*].*")){
             System.out.println("Password must contain at least 1 Character.");  
             return false;
           }
           if(!password.matches(".*[0-9].*")){
            System.out.println("Password must contain at least 1 Digit.");   
            return false;
           }
           OldPasswords.add(newPassword);
       System.out.println("Password successfully created");
           return true;// Password is valid
        
       
    }
   
    
   

   
    //Method to check if phone number already exists
    public boolean isPhoneused(String newNumber){
        System.out.println("Enter your phone number: " );
        newNumber = input.nextLine();
            if (phoneNumbers.contains(newNumber)){ 
                System.out.println("This phone number already exists");
                return true; //Number already exists
            }
    
        return false; // Number does not already exists and is new 
    }
    // Method to validate if the phone number is following the right format
    public boolean isValidPhoneNumbers(String numbers){
        // Code to make sure number has 10 digits and starts with a 0
        if (numbers.length()==10 && numbers.startsWith("0") ){
            // Check if entered characters are all numbers
            for (int i =0; i< numbers.length();i++){
                if (!Character.isDigit(numbers.charAt(i))){
                    System.out.print("Invalid phone number.Must be 10 digits and start with 0 ");
                    return false;
                }
            }
            return true;
        }
        phoneNumbers.add(numbers);
        System.out.println("Number accepted");
         return false;
    }
    
   
        

    
   
}
