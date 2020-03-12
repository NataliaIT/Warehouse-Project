package pl.shopping.warehouse.mapper;

import org.springframework.stereotype.Component;
import pl.shopping.warehouse.dto.ProductDTO;
import pl.shopping.warehouse.entity.Product;

@Component
public class ProductMapper {

    /*private Integer productID;
    private String name;
    private String categoryID;
    private String dateOfPurchase;
    private Double purchasePrice;
    private String contractor;
    private String trackingNumber;
    private String countryOfPosting;
    private String deliveryCourrier;
    private String statusInWarehouse;

     */

    public static Product mapToProduct(final ProductDTO productDTO) {
        return new Product(productDTO.getProductID(), productDTO.getName(),
                productDTO.getCategoryID(),
                productDTO.getDateOfPurchase(),
                productDTO.getPurchasePrice(),
                productDTO.getContractor(),
                productDTO.getTrackingNumber(),
                productDTO.getCountryOfPosting(),
                productDTO.getDeliveryCourrier(),
                productDTO.getStatusInWarehouse());

    }

    public static ProductDTO mapToProductDTO(final Product product) {
        return new ProductDTO(product.getProductID(), product.getName(),
                product.getCategoryID(),
                product.getDateOfPurchase(),
                product.getPurchasePrice(),
                product.getContractor(),
                product.getTrackingNumber(),
                product.getCountryOfPosting(),
                product.getDeliveryCourrier(),
                product.getStatusInWarehouse());
    }
}

