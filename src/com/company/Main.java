package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int size;
	int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử : ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Số phần tử không thể quá 20 ");
            }
        }while (size > 20);


        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Nhập phần tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i ++;
        }


        System.out.println("Danh sách phần tử :");
        for (int j = 0; j < array.length; j ++){
            System.out.println(array[j] + "\t");
        }
         int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++ ){
            if (array[j] > max){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lớn nhất trong danh sách : " + max + ", tại vị trí : " + index);

    }

}
