package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        int size;
        System.out.println("----Nhập thông tin sinh viên mượn sách----");
        System.out.println("Nhập số lượng sinh viên mượn sách:  ");
        size = scanner.nextInt();
        TheMuon[] TheMuon = new TheMuon[size];
        for (int i = 0; i < TheMuon.length; i++) {
            System.out.println("Nhập thông tin khách hàng thứ: " + (i + 1));
            TheMuon[i] = inputPerson();
        }
        showAll(TheMuon);
    }

    public static TheMuon inputPerson() {
        scanner.nextLine();
        System.out.println("Nhập tên sinh viên");
        String name = scanner.nextLine();
        System.out.println("Nhập MSSV: ");
        String number = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String bỉthDay = scanner.nextLine();
        System.out.println("Nhập lớp đang học: ");
        String className = scanner.nextLine();
        System.out.println("Nhập số phiếu mượn: ");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày mượn: ");
        String toDate = scanner.nextLine();
        System.out.println("Nhập ngày trả: ");
        String formDate = scanner.nextLine();
        System.out.println("Nhập số hiệu sách: ");
        String codeOfBook = scanner.nextLine();

        return new TheMuon(name,number,bỉthDay,className,number1,toDate,formDate,codeOfBook);
    }

    public static void showAll(TheMuon[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
