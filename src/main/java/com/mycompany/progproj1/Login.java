/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progproj1;

/**
 *
 * @author bring
 */
class Login {
    //Declarations
       private String username;
       private String password;
       private String firstname;
       private String lastname;
       private String cellPhone;
       
    public boolean checkUserName(String username) //method header 
    { 
         return(username.contains("_") && username.length() <= 5);
    }
    public boolean checkPasswordComplexity(String password) //method 2
    {
        boolean length = password.length() >= 8;
        boolean capital = ! password.equals(password.toLowerCase());
        boolean number = password.matches(".*[0-9].*");
           boolean special = password.matches(".*[!@#$%^&*].*");
        return length && capital && number && special;
    }
    
    public boolean checkCellPhoneNumber(String phoneNumber)
    {
        return phoneNumber.matches("^[+]27 [6-8][0-9] [0-9]{3} [0-9]{4}$");
    }
    public String registerUser(String username, String password, String phoneNumber){
        if (!checkUserName(username)) {
            return "Username is incorrectly formatted "
                    + "please ensure your username contains an underscore "
                    + "and is not more than five characters in length";
        }
        if (!checkPasswordComplexity(password)){
            return "Password does not meet the complexity requirements"
                    + " please ensure that the password contains"
                    + " at least eight characters a number, a capital letter, and a special character ";
        }
        if (!checkCellPhoneNumber(phoneNumber)){
            return "Cell phone number is incorrectly formatted";
        }
        this.username = username;
        this.password = password;
        this.cellPhone = phoneNumber;
        return "User has been registered successfully";
    }
    
    public boolean loginUser(String enteredUsername, String enteredPassword){
        //login code
        return enteredUsername.equals(username)&& enteredPassword.equals(password);
    }
    public String returnLoginStatus(boolean loginStatus, String firstName, String lastName){
        //registeration code
        if (loginStatus){
            return "welcome" + firstName + " " + lastName +", it is nice to see you again";
        }
        else{
            return "username and password incorrect, please try again";
        }
    }

    public void registerUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void loginUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
