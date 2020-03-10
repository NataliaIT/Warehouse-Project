package pl.shopping.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.shopping.warehouse.entity.Employee;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>

{

    Optional<Employee> findByEmployeeIDAndPassword(Integer employeeID, String password);

}