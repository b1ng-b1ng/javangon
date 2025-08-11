import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// kiem tra gmail hop le;
public class regex {
    public static void main(String[] args) {
              
       System.out.println("Run video !");
     Scanner nhap = new Scanner(System.in);
     int lc;
     Pattern hihi = Pattern.compile("^[a-z0-9][a-z0-9A-Z\\.+_%]{1,}@[a-z0-9]{2,6}\\.com$");
     do{
        System.out.printf("nhap email: ");
        String txt = nhap.nextLine();
        Matcher haha = hihi.matcher(txt);
        System.out.println("ket qua kiem tra -" + haha.matches());
        System.out.println("Muon thoat thi nhap 0");
        lc = nhap.nextInt();
         nhap.nextLine();
     }while(lc != 0);
       nhap.close();
    }
}
