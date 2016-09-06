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
    

    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalaryInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
        String fmtDate = sdf.format(currentDate);
        System.out.println("Met with Hr on " + fmtDate);
        metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        if (metWithHr) {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
            String fmtDate = sdf.format(currentDate);
            System.out.println("Met with Dept. Staff on " + fmtDate);
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if (metWithHr && metDeptStaff) {
            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            String fmtDate = sdf.format(currentDate);
            System.out.println("Reviewed Dept. Policies on " + fmtDate);
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        if (metWithHr && metDeptStaff && reviewedDeptPolicies) {
            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            String fmtDate = sdf.format(currentDate);
            System.out.println("Moved into cube on " + fmtDate);
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
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(currentDate);

        if (metWithHr && metDeptStaff
                && reviewedDeptPolicies && movedIn) {
            return "Orientation is completed on: " + fmtDate;
        } else {
            return fmtDate + ": Orientation in progress...";
        }
    }
}

