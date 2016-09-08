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

    public Employee(String lastName, String firstName,
            String SocialSecurityNumber) {
        currentDate = new Date();
        this.firstName = firstName;
        this.lastName = lastName;
        this.SocialSecurityNumber = SocialSecurityNumber;
    }

    public void completeFirstDayProcedures(String cubeId) {
        meetWithHrForBenefitAndSalaryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeId);
    }

    public String getStatus() {
        if (metWithHr && metDeptStaff
                && reviewedDeptPolicies && movedIn) {
            return "Orientation was completed : " + getFormattedDate();
        } else {
            return getFormattedDate() + ": Orientation in progress...";
        }
    }

    public String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY");
        return sdf.format(currentDate);
    }

    // Assume this must be performed first
    public void meetWithHrForBenefitAndSalaryInfo() {
        System.out.println("Met with Hr on " + getFormattedDate());
        setMetWithHr(true);
    }

    // Assume this is must be performed second
    public void meetDepartmentStaff() {
        if (metWithHr) {
            System.out.println("Met with Dept. Staff on " + getFormattedDate());
            setMetDeptStaff(true);
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    public void reviewDeptPolicies() {
        if (metWithHr && metDeptStaff) {
            System.out.println("Reviewed Dept. Policies on "
                    + getFormattedDate());
            setReviewedDeptPolicies(true);
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
            setCubeId(cubeId);
            setMovedIn(true);
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        //requires validation
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
          //requires validation
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public void setSocialSecurityNumber(String SocialSecurityNumber) {
          //requires validation
        this.SocialSecurityNumber = SocialSecurityNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
          //requires validation
        this.birthDate = birthDate;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
          //requires validation
        this.cubeId = cubeId;
    }

    private void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    private void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    private void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    private void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

}
