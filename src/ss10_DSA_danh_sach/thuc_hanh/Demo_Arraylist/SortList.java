package ss10_DSA_danh_sach.thuc_hanh.Demo_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(9);

        System.out.println("Danh sách các phần tử: " + list);
        System.out.println();

        Collections.sort(list);
        System.out.println("Danh sách sau khi sắp xếp theo thứ tự tăng dần: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Danh sách sau khi sắp xếp theo thứ tự giảm dần: " + list);
    }
}
