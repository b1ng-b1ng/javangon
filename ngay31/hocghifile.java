package ngay31;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class hocghifile {
    public static void main(String[] args) throws IOException {
        quanly qly = new quanly();
        qly.addSv();
        qly.addSv();
        qly.addSv();
        qly.ghiFile();
        qly.docFile();
}
}
