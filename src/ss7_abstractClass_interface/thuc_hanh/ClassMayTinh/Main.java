package ss7_abstractClass_interface.thuc_hanh.ClassMayTinh;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test câu a: ");
        MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
        MayTinhVinacal500 mvn500 = new MayTinhVinacal500();

        System.out.println("5 + 3 = " + mfx500.cong(5, 3));
        System.out.println("4 * 5 = " + mvn500.nhan(4, 5));

        System.out.print("4 / 0 = ");
        System.out.println(mfx500.chia(4, 0));
    }
}
