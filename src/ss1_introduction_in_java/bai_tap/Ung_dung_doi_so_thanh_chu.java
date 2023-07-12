package ss1_introduction_in_java.bai_tap;

import java.util.Scanner;

public class Ung_dung_doi_so_thanh_chu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhập vào số để đọc");
            number = Integer.parseInt(sc.nextLine());
            if (number > 999){
                System.out.print("Số không được lớn hơn 999");
            }
        }while (number > 999);
        String lessTen = one(number);
        String lessTwenty = two(number);
        String twenty = two1(number);
        String lessHundred = onehundred(number);
        if (number < 10 && number >= 0){
            System.out.println(lessTen);
        } else if (number < 20 && number >=10) {
            System.out.println(lessTwenty);
        } else if (number < 100 && number <= 20) {
            System.out.println(twenty);
        }else {
            int tens = (number %100) / 100;
            int ones = (number % 100) %100;
        }
    }
}
