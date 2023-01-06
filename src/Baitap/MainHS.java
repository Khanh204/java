package Baitap;
import java.util.Scanner;
public class MainHS {
public static void main(String[] args ){

    HocSinh hs1 = new HocSinh();
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập tên học sinh 1: ");
    hs1.setName(sc.nextLine());
    System.out.println("Nhập ngày sinh:");
    hs1.setBirthday(sc.nextLine());
    System.out.println("Nhập lớp: ");
    hs1.setClasss(sc.nextLine());
    System.out.println("Nhập điểm lý thuyết: ");
    hs1.setDiemlt(sc.nextFloat());
    System.out.println("Nhập điểm thực hành: ");
    hs1.setDiemth(sc.nextFloat());
    System.out.println("điểm tung bình: "+hs1.diemtb());


}
}
