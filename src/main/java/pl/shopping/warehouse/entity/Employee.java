package pl.shopping.warehouse.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Collections;

@Entity
public class Employee implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String employeeID;
    private String surname;
    private String password;
    private Boolean active;
    private String role;

    public Employee() {
        this.active = true;
        this.role = "ROLE_USER";
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public Employee setEmployeeID(String employeeID) {
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(final Boolean active) {
        this.active = active;
        }

    public String getRole() {
        return role;
    }

    public Employee setRole(String role) {
        this.role = role;
        return this;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //simplegrantedauthority sprawdza czy pole 'role' nie jest puste i wyrzuca błąd
        return Collections.singletonList(new SimpleGrantedAuthority(this.role));
    }

    @Override
    public String getUsername() {
        return this.employeeID;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", role='" + role + '\'' +
                '}';
    }
}

