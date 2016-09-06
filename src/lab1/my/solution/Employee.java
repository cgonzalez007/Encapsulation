package lab1.my.solution;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 * 
 * @author Chris Gonzalez
 * 
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String SocialSecurityNumber;
    private Date birthDate;
    private String cubeId;
    
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    
    private Date currentDate;

    public Employee(String lastName, String firstName, String SocialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SocialSecurityNumber = SocialSecurityNumber;
    }
    
    public Employee(String lastName, String firstName, String SocialSecurityNumber, Date birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.SocialSecurityNumber = SocialSecurityNumber;
        this.birthDate = birthDate;
    }
    
    public void completeFirstDayProcedures(){
    
    }
    
    // Assume this must be performed first
    public void meetWithHrForBenefitAndSalaryInfo() {
        System.out.println("Met with Hr on " + getFormattedDate());
        metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        if (metWithHr) {
            System.out.println("Met with Dept. Staff on " + getFormattedDate());
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if (metWithHr && metDeptStaff) {
            System.out.println("Reviewed Dept. Policies on " + getFormattedDate());
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    public void moveIntoCubicle(String cubeId) {
        if (metWithHr && metDeptStaff && reviewedDeptPolicies) {
            System.out.println("Moved into cube on " + getFormattedDate());
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    public String getStatus() {
        if (metWithHr && metDeptStaff
                && reviewedDeptPolicies && movedIn) {
            return "Orientation is completed on: " + getFormattedDate();
        } else {
            return getFormattedDate() + ": Orientation in progress...";
        }
    }
    
    public String getFormattedDate(){
    SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
        return sdf.format(currentDate);
    }
}   

