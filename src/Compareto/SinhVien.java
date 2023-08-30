package Compareto;

import org.jetbrains.annotations.NotNull;

public class SinhVien implements Comparable<SinhVien>{
    private int id;
    private String name;
    private String classes;
    private double diemTB;

    public SinhVien(int id, String name, String classes, double diemTB) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.diemTB = diemTB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return 0;
    }
}
