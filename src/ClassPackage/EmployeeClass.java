/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassPackage;

import java.io.BufferedReader;

public class EmployeeClass {
    
    private String EmployeeId;
    private String EmployeeName;
    private int EPF;
    private int Age;
    private String Address;
    private String Department;
    private String Designation;
    
    private int EmployeeCount;
    FileSystem fileSystem = new FileSystem("Employee.txt");
    
    public EmployeeClass(){}
    
    public EmployeeClass(String EmployeeId, String EmployeeName,int EPF, int Age, String Address, String Department, String Designation){
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.EPF = EPF;
        this.Age = Age;
        this.Address = Address;
        this.Department = Department;
        this.Designation = Designation;     
    }
    public String getEmployeeId(){
        return EmployeeId;
    }
    public void setEmployeeId(String EmployeeId){
        this.EmployeeId = EmployeeId; 
    }
    public String getEmployeeName(){
        return EmployeeName;
    }
    public void setEmployeeName(String EmployeeName){
        this.EmployeeName = EmployeeName;
    }
    public int getEPF(){
        return EPF;
    }
    public void setEPF(int EPF){
        this.EPF = EPF;
    }
    public int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }
    public String getDepartment(){
        return Department;
    }
    public void setDepartment(String Department){
        this.Department = Department;
    }
    public String getDesignation(){
        return Designation;
    }
    public void setDesignation(String Designation){
        this.Designation = Designation;
    }
    public int getEmployeeCount(){
        return EmployeeCount;
    }
    public void setEmployeeCount(int EmployeeCount){
        this.EmployeeCount = EmployeeCount;
    }
    
    public boolean addEmployee(){
        if(!fileSystem.Create_NewFile()){
            String record = EmployeeId + " " + EmployeeName + " " + EPF + " " + Age + " " +
                    Address + " " + Department + " " + Designation;
            System.err.println(EmployeeId + " " + EmployeeName + " " + EPF + " " + Age + " " + 
                    Address + " " + Department + " " + Designation );
            return fileSystem.writeDataToFile(record);
        }
        return false;
    }
    public boolean searchEmployee(String keyword){
        boolean isFound = false;
        try{
            String [] words = null;
            BufferedReader bufferedReader = fileSystem.readAFile();
            String employee;
            outerloop:
            while((employee = bufferedReader.readLine()) != null){
                words = employee.split(" ");
                for(String word : words){
                    if(word.equals(keyword)){
                        isFound = true;
                        this.setEmployeeId(words[0]);
                        this.setEmployeeName(words[1]);
                        this.setEPF(Integer.parseInt(words[2]));
                        this.setAge(Integer.parseInt(words[3]));
                        this.setAddress(words[4]);
                        this.setDepartment(words[5]);
                        this.setDesignation(words[6]);
                        
                        break outerloop;    
                    }
                }
            }  
        }catch(Exception e){
            System.err.println("Something Worng with searching Employees" + e);   
        }
        return isFound;
    }
    public String viewAllEmployee(){
        String Employee, allEmployee = " ";
        String words [] = null;
        int count = 0;
        BufferedReader bufferedReader = fileSystem.readAFile();
        try{
            while((Employee = bufferedReader.readLine()) != null){
                words = Employee.split(" ");
                allEmployee = allEmployee + words[0] + "\t" + words[1] + "\t" + words[2] + "\t" + words[3] + "\t" + 
                        words[4] + "\t" + words[5] + "\t" + words[6] + "\n";
                count++;
            }
        }catch(Exception e){
            System.err.println("Something worng with Viewing " + e);    
        }
        setEmployeeCount(count);
        return allEmployee;
    }   
    
}
