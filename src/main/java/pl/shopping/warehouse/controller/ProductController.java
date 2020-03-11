//package pl.shopping.warehouse.controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import pl.shopping.warehouse.dto.ProductDTO;
//import pl.shopping.warehouse.entity.Employee;
//import pl.shopping.warehouse.entity.Product;
//import pl.shopping.warehouse.repository.EmployeeRepository;
//import pl.shopping.warehouse.repository.ProductRepository;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("/products")
//public class ProductController {
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Autowired
//    private EmployeeController employeeController;
//
//
//    /*JSON:
//    {
//    "name": "Szafa",
//    "categoryID": "L5765765",
//    "dateOfPurchase": "13-11-2020",
//    "purchasePrice": 155,
//    "contractor":"Szafex spzoo",
//    "trackingNumber": "X4564564654",
//    "countryOfPosting":"Francja",
//    "deliveryCourrier": "UPS",
//    "statusInWarehouse":"na magazynie"
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<?> add(@RequestBody ProductDTO productDTO) {
//        Product createdProduct = new Product();
//        createdProduct.setPurchasePrice(productDTO.getPurchasePrice());
//        createdProduct.setDateOfPurchase(productDTO.getDateOfPurchase());
//        createdProduct.setDeliveryCourrier(productDTO.getDeliveryCourrier());
//        createdProduct.setName(productDTO.getName());
//        createdProduct.setTrackingNumber(productDTO.getTrackingNumber());
//        createdProduct.setStatusInWarehouse(productDTO.getStatusInWarehouse());
//        createdProduct.setCountryOfPosting(productDTO.getCountryOfPosting());
//        createdProduct.setContractor(productDTO.getContractor());
//        createdProduct.setCategoryID(productDTO.getCategoryID());
//
//        Product saved = productRepository.save(createdProduct);
//        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
//    }
//*/
//    @PostMapping("/add")
//    public String add(@ModelAttribute Product product) {
//
//
//
////        Optional<Employee> optionalEmployee = employeeRepository.findByUsernameAndPassword(String username, String password);
//
// //       if (optionalEmployee.isPresent()) {
////            Employee employeeGet = optionalEmployee.get();
////            product.setUserId(employeeGet.getId());
////            workCard.setDate_and_Time(LocalDateTime.now());
////
////            WorkCardDTO workCardDTOToSave = WorkCardMapper.mapToWorkCardDTO(workCard);
////            WorkCard workCardToSave = WorkCardMapper.mapToWorkCard(workCardDTOToSave);
////
////            workCardRepository.save(workCardToSave);
//
//            return "warehouse";
////        else {
////            return "index";
////        }
//    }
//
//
//    @GetMapping("/list")
//    public ResponseEntity<?> getList(){
//        List<Product> products = productRepository.findAll();
//        return ResponseEntity.status(HttpStatus.OK).body(products);
//    }
//
//
//
//    @GetMapping("/getProduct")
//    public Map<Integer, ProductDTO> getProduct() {
//        Map<Integer, ProductDTO> productList = new HashMap<>();
//
//        //      List<ProductDTO> findListEmployee = productRepository.findAll().stream()
//        //              .collect(Collectors.toList());
////
////
////        int count = 1;
////        for (int i = findListEmployee.size() - 1; i >= 0; i--) {
////            reversList.put(count, findListEmployee.get(i));
////            count++;
//               }
//        return productList;
//    }
//}
//
