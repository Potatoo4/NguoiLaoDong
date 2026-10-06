import java.util.Scanner;

public class NguoiLaoDong {

    protected String hoTen;
    protected int tuoi;
    protected double luongCoBan;

    public NguoiLaoDong() {
    }

    public NguoiLaoDong(String hoTen, int tuoi, double luongCoBan) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luongCoBan = luongCoBan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void Nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        setHoTen(sc.nextLine());

        System.out.print("Nhap tuoi: ");
        setTuoi(sc.nextInt());
        sc.nextLine();

        System.out.print("Nhap luong co ban: ");
        setLuongCoBan(sc.nextDouble());
        sc.nextLine();
    }

    public void Hien() {
        System.out.println("Ho ten: " + getHoTen()
                + " | Tuoi: " + getTuoi()
                + " | Luong CB: " + getLuongCoBan());
    }

}