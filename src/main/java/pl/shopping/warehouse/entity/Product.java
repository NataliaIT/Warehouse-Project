package pl.shopping.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productID;
    private String name;
    private String categoryID;
    private String dateOfPurchase;
    private Double purchasePrice;
    private String contractor;
    private String trackingNumber;
    private String countryOfPosting;
    private String deliveryCourrier;
    private String statusInWarehouse;

    public Product() {
    }

    public Integer getProductID() {
        return productID;
    }

    public Product setProductID(Integer productID) {
        this.productID = productID;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public Product setCategoryID(String categoryID) {
        this.categoryID = categoryID;
        return this;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public Product setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
        return this;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public Product setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }

    public String getContractor() {
        return contractor;
    }

    public Product setContractor(String contractor) {
        this.contractor = contractor;
        return this;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public Product setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    public String getCountryOfPosting() {
        return countryOfPosting;
    }

    public Product setCountryOfPosting(String countryOfPosting) {
        this.countryOfPosting = countryOfPosting;
        return this;
    }

    public String getDeliveryCourrier() {
        return deliveryCourrier;
    }

    public Product setDeliveryCourrier(String deliveryCourrier) {
        this.deliveryCourrier = deliveryCourrier;
        return this;
    }

    public String getStatusInWarehouse() {
        return statusInWarehouse;
    }

    public Product setStatusInWarehouse(String statusInWarehouse) {
        this.statusInWarehouse = statusInWarehouse;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", categoryID='" + categoryID + '\'' +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", contractor='" + contractor + '\'' +
                ", trackingNumber='" + trackingNumber + '\'' +
                ", countryOfPosting='" + countryOfPosting + '\'' +
                ", deliveryCourrier='" + deliveryCourrier + '\'' +
                ", statusInWarehouse='" + statusInWarehouse + '\'' +
                '}';
    }
}

