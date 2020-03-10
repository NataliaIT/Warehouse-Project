package pl.shopping.warehouse.dto;

public class RegisterDTO {

    private String employeeID;
    private String password;

    public RegisterDTO() {
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public RegisterDTO setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RegisterDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "RegisterDTO{" +
                "employeeID='" + employeeID + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
