package pl.shopping.warehouse.dto;


public class ProductDTO {

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

    public ProductDTO() {
    }

    public Integer getProductID() {
        return productID;
    }

    public ProductDTO setProductID(Integer productID) {
        this.productID = productID;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public ProductDTO setCategoryID(String categoryID) {
        this.categoryID = categoryID;
        return this;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public ProductDTO setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
        return this;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public ProductDTO setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }

    public String getContractor() {
        return contractor;
    }

    public ProductDTO setContractor(String contractor) {
        this.contractor = contractor;
        return this;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public ProductDTO setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    public String getCountryOfPosting() {
        return countryOfPosting;
    }

    public ProductDTO setCountryOfPosting(String countryOfPosting) {
        this.countryOfPosting = countryOfPosting;
        return this;
    }

    public String getDeliveryCourrier() {
        return deliveryCourrier;
    }

    public ProductDTO setDeliveryCourrier(String deliveryCourrier) {
        this.deliveryCourrier = deliveryCourrier;
        return this;
    }

    public String getStatusInWarehouse() {
        return statusInWarehouse;
    }

    public ProductDTO setStatusInWarehouse(String statusInWarehouse) {
        this.statusInWarehouse = statusInWarehouse;
        return this;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
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

