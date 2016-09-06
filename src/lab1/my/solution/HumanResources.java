
package lab1.my.solution;

/**
 *
 * @author cgonz
 */
public class HumanResources {

    private Employee employee;

    public void runEmployeeThroughFirstDayProcedures(String lastName,
            String firstName, String SocialSecurityNumber, String cubeId) {
        Employee e = new Employee(lastName, firstName, SocialSecurityNumber);
        e.completeFirstDayProcedures(cubeId);
        setEmployee(e);
    }

    public String getEmployeeStatus() {
        return employee.getStatus();
    }

    public Employee getEmployee() {
        return employee;
    }

    private void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
