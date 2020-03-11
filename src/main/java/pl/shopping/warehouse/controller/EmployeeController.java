package pl.shopping.warehouse.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.shopping.warehouse.converter.EmployeeDTOToEmployeeConverter;
import pl.shopping.warehouse.converter.EmployeeToEmployeeDTOConverter;
import pl.shopping.warehouse.dto.EmployeeDTO;
import pl.shopping.warehouse.dto.LoginDTO;
import pl.shopping.warehouse.entity.Employee;
import pl.shopping.warehouse.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/getList")
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(employees);
    }

//    @PostMapping("/create")
//    public ResponseEntity<EmployeeDTO> createEmployeeAccount(@RequestBody EmployeeDTO employeeDTO) {
//        Employee employeeToSave = EmployeeDTOToEmployeeConverter.convert(employeeDTO);
//        Employee savedEmployee = employeeRepository.save(employeeToSave);
//        EmployeeDTO convertedEmployeeDTO = EmployeeToEmployeeDTOConverter.convert(savedEmployee);
//        return ResponseEntity.status(HttpStatus.CREATED).body(convertedEmployeeDTO);
//    }

    //    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO) {
//        Optional<Employee> optionalUser =
//                employeeRepository.findByEmployeeIDAndPassword(loginDTO.getEmployeeID(), loginDTO.getPassword());
//
//        if (optionalUser.isPresent()) {
//
//            EmployeeDTO userDTO = EmployeeToEmployeeDTOConverter.convert(optionalUser.get());
////
////            return ResponseEntity.status(HttpStatus.OK).body(userDTO);
////        }
////        else {
////            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nie znaleziono użytkownika");
////        }
//////    }
//    @PostMapping("/login")
//    public String login(@ModelAttribute LoginDTO loginDTO) {
//        Optional<Employee> optionalEmployee =
//                employeeRepository.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
//
//        EmployeeDTO userDTO = EmployeeToEmployeeDTOConverter.convert(optionalEmployee.get());
//        if (optionalEmployee.isPresent()) return "warehouse";
//        else {
//            return "invalidLogin";
//        }
//    }


}
