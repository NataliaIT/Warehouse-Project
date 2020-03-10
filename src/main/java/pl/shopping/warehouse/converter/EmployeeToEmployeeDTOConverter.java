package pl.shopping.warehouse.converter;

import pl.shopping.warehouse.dto.EmployeeDTO;
import pl.shopping.warehouse.entity.Employee;

public class EmployeeToEmployeeDTOConverter {
    public static EmployeeDTO convert(Employee employee) {

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeID(employee.getEmployeeID());
        employeeDTO.setSurname(employee.getSurname());
        return employeeDTO;
    }
}
