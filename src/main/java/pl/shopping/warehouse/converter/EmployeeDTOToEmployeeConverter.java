package pl.shopping.warehouse.converter;


import pl.shopping.warehouse.dto.EmployeeDTO;
import pl.shopping.warehouse.entity.Employee;

public class EmployeeDTOToEmployeeConverter {

    public static Employee convert(EmployeeDTO employeeDTO){
        Employee employee =new Employee();
        employee.setEmployeeID(employeeDTO.getEmployeeID());
        employee.setSurname(employeeDTO.getSurname());
        return employee;
    }
}
