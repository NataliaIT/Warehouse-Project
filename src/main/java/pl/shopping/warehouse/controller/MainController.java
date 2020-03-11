package pl.shopping.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.shopping.warehouse.dto.LoginDTO;
import pl.shopping.warehouse.dto.ProductDTO;
import pl.shopping.warehouse.dto.RegisterDTO;
import pl.shopping.warehouse.entity.Employee;
import pl.shopping.warehouse.entity.Product;
import pl.shopping.warehouse.repository.EmployeeRepository;
import pl.shopping.warehouse.repository.ProductRepository;
import pl.shopping.warehouse.security.WebSecurityConfig;

@Controller
public class MainController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ProductRepository productRepository;



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

    @GetMapping("/warehouse")
    public String warehouse() {
        return "warehouse";
    }


    @GetMapping("/invalid")
    public String invalid() {
        return "invalidLogin";
    }
//
//
    @PostMapping("/products/add")
    public String add(@ModelAttribute ProductDTO productDTO){
        ProductDTO createdProductDTO = new ProductDTO();
        Product createdProduct = new Product();
        createdProduct.setPurchasePrice(productDTO.getPurchasePrice());
        createdProduct.setDateOfPurchase(productDTO.getDateOfPurchase());
        createdProduct.setDeliveryCourrier(productDTO.getDeliveryCourrier());
        createdProduct.setName(productDTO.getName());
        createdProduct.setTrackingNumber(productDTO.getTrackingNumber());
        createdProduct.setStatusInWarehouse(productDTO.getStatusInWarehouse());
        createdProduct.setCountryOfPosting(productDTO.getCountryOfPosting());
        createdProduct.setContractor(productDTO.getContractor());
        createdProduct.setCategoryID(productDTO.getCategoryID());
        productRepository.save(createdProduct);

        return "warehouse";
    }


}
