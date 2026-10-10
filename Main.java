import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static void hienDanhSach(ArrayList<NguoiLaoDong> ds) {
        System.out.println();
        System.out.println("=== DANH SACH NGUOI LAO DONG ===");
        if (ds.isEmpty()) {
            System.out.println("(Danh sach trong)");
            return;
        }
        for (NguoiLaoDong nld : ds) {
            nld.Hien();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<NguoiLaoDong> ds = new ArrayList<>();

        System.out.println("=== CHUONG TRINH QUAN LY NGUOI LAO DONG ===");

        int chon = -1;
        do {
            System.out.println();
            System.out.println("1. Them Nhan vien");
            System.out.println("2. Hien danh sach Nhan vien");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            try {
                chon = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Lua chon khong hop le!");
                chon = -1;
                continue;
            }

            switch (chon) {
                case 1:
                    Nhanvien nv = new Nhanvien();
                    try {
                        nv.Nhap(sc);
                        ds.add(nv);
                        System.out.println("-> Da them.");
                    } catch (InputMismatchException e) {
                        sc.nextLine(); // bo phan nhap sai con lai trong bo dem
                        System.out.println("Du lieu nhap sai dinh dang, bo qua nhan vien nay!");
                    }
                    break;
                case 2:
                    hienDanhSach(ds);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }
}