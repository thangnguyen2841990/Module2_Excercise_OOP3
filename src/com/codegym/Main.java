package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        CardManagement cardManagement = new CardManagement();
        System.out.println("----Nhập thông tin sinh viên mượn sách----");
        System.out.println("Nhập vị trí thêm thẻ mượn: ");
        int index = scanner.nextInt();
        if (index - 1 < 0 || index - 1 > cardManagement.cards.length) {
            System.out.println("Vị trí không xác định");
        } else {
            Card newCard = inputPerson();
            cardManagement.addNewCard(index, newCard);
            cardManagement.displayAllCard();
        }

    }

    public static Card inputPerson() {
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

        return new Card(number1,toDate,formDate,codeOfBook,new Student(name,number,bỉthDay,className));
    }

    }

