package lab1.my.solution;

import java.util.Date;



/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        /*
            Are we violating SRP (Single Responsibility Principle)?
        
            HINT: think about what we are trying to do ... hire an employee.
            Whose job is it to do this? The current class? Or, a new class?
            Should we do the work here or delegate to the new class? You
            may need to create a new class that talks to Employee. This does
            not have to be a GUI class.
        */
        
        Employee employee = new Employee("Piper","Piper","555555555",new Date("05/25/1992"));
        HumanResources humanResources = new HumanResources();
        
        

//        System.out.println("The employee's status is: " + employee.getStatus());
    }
    
    
}
