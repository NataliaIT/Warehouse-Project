package pl.shopping.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.shopping.warehouse.dto.LoginDTO;
import pl.shopping.warehouse.dto.RegisterDTO;
import pl.shopping.warehouse.entity.Employee;
import pl.shopping.warehouse.repository.EmployeeRepository;
import pl.shopping.warehouse.security.WebSecurityConfig;

@Controller
public class MainController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping("/")
    @PostMapping("/")
    public String mainPage(@RequestParam(required = false) boolean created,
                           @RequestParam(required = false) String criteria,
                           Model model) {


  //      if (criteria != null) {
         //   List<Deal> dealList = dealRepository.findByTitleContainsIgnoreCaseOrContentContainsIgnoreCase(criteria, criteria);
         //   model.addAttribute("created", created);
         //   model.addAttribute("deals", dealList);
            return "index";
//warehouse       } else {
//            List<Deal> dealList = dealRepository.findAll();
//            model.addAttribute("created", created);
//            model.addAttribute("deals", dealList);
//            return "index";
//        }
    }
//    @GetMapping("/")
//    public String mainPage(Model model){
//        return "index";
//    }

//    @GetMapping("/products")
//    public String warehouse(Model model){
//        return "warehouse";
//    }

    @GetMapping("/register")
    public String register(Model model) {

        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute RegisterDTO registerDTO) {

        Employee employee = new Employee();
        employee.setUsername(registerDTO.getUsername());
        employee.setPassword(passwordEncoder.encode(registerDTO.getPassword()));


        employeeRepository.save(employee);

        return "redirect:/";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute LoginDTO loginDTO) {


        return "redirect:/warehouse";
    }
}
