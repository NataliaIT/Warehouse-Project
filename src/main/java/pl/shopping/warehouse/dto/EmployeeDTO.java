package pl.shopping.warehouse.dto;

public class EmployeeDTO {

    private Integer employeeID;
    private  String firstname;
    private String surname;
    private String username;
    private String password;

    public EmployeeDTO() {
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public EmployeeDTO setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public EmployeeDTO setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public EmployeeDTO setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public EmployeeDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public EmployeeDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeID=" + employeeID +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

