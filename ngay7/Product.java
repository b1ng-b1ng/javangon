package ngay7;
// source Action + generate getters and setter - tạo nhanh các hàm getX;
public class Product {
    private String name;
    private double price;
    private double tax;
    public Product(){}
    public Product(String name, double price , double tax){
        this.name = name;
        this.price = price;
        this.tax = tax;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public void xuatthongtin(Product pr){
        System.out.printf("name = %s tax= %.2f price = %.2f \n",pr.getName(),pr.getTax(),pr.getPrice());
    }
    public Product nhapthongtin(String name, double price , double tax){
        Product pr = new Product(name,price,tax);
        return pr; 
    }
    public double TaxPrice(){
        return tax * price ;
    }
}
