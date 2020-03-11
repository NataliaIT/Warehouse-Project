package pl.shopping.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import pl.shopping.warehouse.entity.Employee;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>

{

    Optional<Employee> findByUsernameAndPassword (String username, String password);
    UserDetails getUserByUsername(String username);
}