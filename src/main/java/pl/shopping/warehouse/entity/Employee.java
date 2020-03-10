package pl.shopping.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeID;
    private String surname;
    private String password;

    public Employee() {
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public Employee setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Employee setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Employee setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", username='" + surname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

