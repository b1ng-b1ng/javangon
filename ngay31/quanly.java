package ngay31;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ngay29.Line;

public class quanly {
    private List<Student> ds;
    public quanly(){
        ds = new ArrayList<>();
    }
    public void addSv(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi");
        int age = sc.nextInt(); sc.nextLine();
        System.out.println("Nhap diem");
        double mark = sc.nextDouble(); sc.nextLine();
        ds.add(new Student(name, age, mark));
    }
    public void ghiFile() throws IOException{
        FileWriter fw = new FileWriter("dat.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (Student student : ds) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
    public void docFile(){
        try {
            FileReader fr = new FileReader("dat.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            
            while(true){
                if(line == null){
                    break;
                }
                line = br.readLine();
                System.out.println(line);
                
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
