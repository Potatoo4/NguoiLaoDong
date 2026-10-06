import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<NguoiLaoDong> ds = new ArrayList<>();

        System.out.println("=== CHUONG TRINH QUAN LY NGUOI LAO DONG ===");

        // TODO: nhom se them QuanLy, NhanVien, GiangVien vao day

        System.out.println();
        System.out.println("=== DANH SACH NGUOI LAO DONG ===");
        for (NguoiLaoDong nld : ds) {
            nld.Hien();
        }

        sc.close();
    }
}
