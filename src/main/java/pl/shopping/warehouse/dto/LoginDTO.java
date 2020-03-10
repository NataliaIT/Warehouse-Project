package pl.shopping.warehouse.dto;

public class LoginDTO {

    private Integer employeeID;
    private String password;

    public LoginDTO() {
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public LoginDTO setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginDTO setPassword(String password) {
        this.password = password;
        return this;
    }
}

