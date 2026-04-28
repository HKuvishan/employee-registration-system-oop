/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassPackage;

import java.io.BufferedReader;

public class UserInfoClass {
    
    private String UserId;
    private String Password;
    private String UserType;
    
    FileSystem fileSystem = new FileSystem("userInfo.txt");
    
    public UserInfoClass(){}
    public UserInfoClass(String userId, String password){
        this.UserId = userId;
        this.Password = password;
    }
    public UserInfoClass(String userId, String password, String userType){
        this.UserId = userId;
        this.Password = password;
        this.UserType = userType;
        
    }
    public void setUserId(String userId){
        this.UserId = userId;
    }
    public String getUserId(){
        return UserId;
    }
    public void setPassword(String password){
        this.Password = password;
    }
    public String getPassword(){
        return Password;
    }
    public void setUserType(String userType){
        this.UserType = userType;
    }
    public String getUserType(){
        return UserType;
    }
    public boolean addNewUser(){
        if(!fileSystem.Create_NewFile()){
            String record = UserId + " " + Password + " " + UserType;
            return fileSystem.writeDataToFile(record);
        }
        return false;
    }
    public boolean validateLogin(){
        try{
            String[] words = null;
            
            BufferedReader bufferedReader = fileSystem.readAFile();
            String user;
            while((user = bufferedReader.readLine()) != null){
                words = user.split(" ");
                if (words[0].equals(UserId) && words[1].equals(Password))
                {
                    this.setUserId(words[0]);
                    this.setPassword(words[1]);
                    this.setUserType(words[2]);
                    return true;
                }
            }
        }catch(Exception e){
            System.err.println("There is a error with ValidateLogin!" + e);
            return false;   
        }
        return false;
    }
      public String viewAllUsers () {
        String user, allUsers = " ";
        String[] words = null;
        int count = 0;

        BufferedReader bufferedReader = fileSystem.readAFile();

        try {
            while ((user = bufferedReader.readLine()) != null) {    
                words = user.split(" ");
                allUsers = allUsers + words[0] +  "\t" +  words[2] + "\n";
                count++;
            }
        } catch (Exception e) {
            System.err.println("Something went wrong when vewing User" + e);
        }   
        return allUsers;
    }    
    
}
