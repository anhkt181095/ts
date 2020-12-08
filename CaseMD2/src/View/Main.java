package View;

import NhanVien.ChuyenVien;
import NhanVien.CongNhan;
import NhanVien.People;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int luongTtrungBinh = 0, tongLuong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số chuyên viên trong công ty:");
        int soThanhVien = sc.nextInt();
        People[] peoples = new ChuyenVien[soThanhVien];

//        System.out.println("nhập thông tin cho chuyên viên:");
        for (int i = 0;i < soThanhVien; i++){
            System.out.println("nhập thông tin chuyên viên thứ" +(i+1) +":");
            System.out.println("chọn loại cấp bậc");
            int choose = sc.nextInt();

            if (choose == 1){
                peoples[i] = new ChuyenVien();
            }else if (choose == 2){
                peoples[i] = new CongNhan();
            }

            peoples[i].nhap();
            peoples[i].tinhLuong();
        }
        System.out.println("Thông tin của các thành viên trong công ty:");
        for (int i = 0; i < soThanhVien; i++ ){
            System.out.println(peoples[i].toString());
        }

    }
}
