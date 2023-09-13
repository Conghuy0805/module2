package Compareto;

public class Main {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien(1,"Nguyễn Văn A","C03",8);
        SinhVien sinhVien2 = new SinhVien(2,"Nguyễn Văn B","C04",10);
        SinhVien sinhVien3 = new SinhVien(3,"Nguyễn Văn","C04",7);
        System.out.println(sinhVien1.compareTo(sinhVien2));
        System.out.println(sinhVien1.compareTo(sinhVien3));

    }
}
