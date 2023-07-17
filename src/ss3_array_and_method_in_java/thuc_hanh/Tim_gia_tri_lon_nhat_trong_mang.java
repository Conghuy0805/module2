package ss3_array_and_method_in_java.thuc_hanh;

import java.util.Scanner;

public class Tim_gia_tri_lon_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.print("Nhập kích thước của mảng: ");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.print("Kích thước không được quá 20");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = Integer.parseInt(sc.nextLine());
            i++;
        }
        System.out.print("Danh sách phần tử: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int max = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.print("\n" + "Phần tử lớn nhất là : " + max + " ở vị trí thứ " + index);
    }
}
