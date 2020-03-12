package pl.shopping.warehouse.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.shopping.warehouse.converter.EmployeeDTOToEmployeeConverter;
import pl.shopping.warehouse.dto.ProductDTO;
import pl.shopping.warehouse.dto.RegisterDTO;
import pl.shopping.warehouse.entity.Employee;
import pl.shopping.warehouse.entity.Product;
import pl.shopping.warehouse.mapper.ProductMapper;
import pl.shopping.warehouse.repository.EmployeeRepository;
import pl.shopping.warehouse.repository.ProductRepository;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeController employeeController;

    @Autowired
    private ProductDTO productDTO;




    /*JSON:
    {
    "name": "Szafa",
    "categoryID": "L5765765",
    "dateOfPurchase": "13-11-2020",
    "purchasePrice": 155,
    "contractor":"Szafex spzoo",
    "trackingNumber": "X4564564654",
    "countryOfPosting":"Francja",
    "deliveryCourrier": "UPS",
    "statusInWarehouse":"na magazynie"
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody ProductDTO productDTO) {
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

        Product saved = productRepository.save(createdProduct);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
*/


    @PostMapping("/add")
    public String add(@ModelAttribute ProductDTO productDTO){
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


            return "warehouse";
        }


//    @GetMapping("/getList")
//    public ResponseEntity<?> getList(){
//        List<Product> productList = productRepository.findAll();
//        return ResponseEntity.status(HttpStatus.OK).body(productList);
//    }


//    @GetMapping("/getEmployeeCard")
//    public Map<Integer, WorkCardDTO> getEmployeeCard() {
//        Map<Integer, WorkCardDTO> reversList = new HashMap<>();
//
//        List<WorkCardDTO> findListEmployee = workCardRepository.findAll().stream()
//                .filter(e -> e.getUserId().equals(employeeController.idEmployee))
//                .map(WorkCardMapper::mapToWorkCardDTO)
//                .collect(Collectors.toList());
//
//        int count = 1;
//        for (int i = findListEmployee.size() - 1; i >= 0; i--) {
//            reversList.put(count, findListEmployee.get(i));
//            count++;
//        }
//        return reversList;
//    }

    @GetMapping("/getProduct")
    public Map<Integer, ProductDTO> getProduct() {
        Map<Integer, ProductDTO> reversList = new HashMap<>();

        List<ProductDTO> findListEmployee = productRepository.findAll().stream()
                .map(ProductMapper::mapToProductDTO)
                .collect(Collectors.toList());

        int count = 1;
        for (int i = findListEmployee.size() - 1; i >= 0; i--) {
            reversList.put(count, findListEmployee.get(i));
            count++;
        }
        return reversList;
    }
}





