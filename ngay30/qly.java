package ngay30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class qly {
    private List<Nhanvien> dsNhanvien;
    public qly(){
        dsNhanvien = new ArrayList<>();
    }
    public void docFile() throws IOException{
        File file = new File("C:\\java-code-new-2025\\n" + //
                        "gay30\\n" + //
                        "hanvien.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        fr.close();
        br.close();
    }
}