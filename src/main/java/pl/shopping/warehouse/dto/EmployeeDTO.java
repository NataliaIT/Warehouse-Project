package pl.shopping.warehouse.dto;

public class EmployeeDTO {

    private String employeeID;
    private String surname;
    private String password;

    public EmployeeDTO() {
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public EmployeeDTO setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public EmployeeDTO setSurname(String surname) {
        this.surname = surname;
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
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

