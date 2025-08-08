package ngay7;

public class video30 {
    public static void main(String[] args) {
    // Product pr = new Product("phone",100,100);
    // pr.nhapthongtin("linh", 100, 100);
    // pr.xuatthongtin(pr);
    // System.out.println(pr.TaxPrice());
    Product test = new Product();
    Product pr1 = test.nhapthongtin("xanh", 0, 0);
    test.xuatthongtin(pr1);
    System.out.println("Tax = " + test.TaxPrice());
    }
}
