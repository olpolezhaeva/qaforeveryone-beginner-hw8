package com.example.task19;


import java.util.Arrays;

// Написать метод, который принимает на вход длину массива l
// и количество знаков d (однозначные, двузначные, трехзначные и тд числа),
// и генерирует массив случайных целых положительных чисел длины l,
// в котором все числа имеют количество знаков d

public class Task19 {

    public static int randomIntegerSizeN(int d) {                            // (min; 0] [1; max]
        if (d <= 0) {
            throw new RuntimeException("The size(n) is less or equal 0!");
        }

        double a = Math.random();                                             // [0,1] a << 1 0.0000001
        int rez;                                      //0.00000000000013475697 => * 100 =>  01.3475697 * 10 = 13.475697

        for (; ; ) {
            a *= 10;
            rez = (int) a; // 1
            if (rez >= Math.pow(10, d - 1) && rez <= (Math.pow(10, d) - 1))
                break;
        }
        return rez;
    }

//    private static int randomIntegerSizeNBad(int d) {
//
//        return (int) (Math.random() * (10 * d));
//    }

    public int[] createRangeOfRandomIntegerNumbers(int l, int d) {
        int[] randomIntegerNumbers = new int[l];

        for (int i = 0; i < randomIntegerNumbers.length; i++) {
            randomIntegerNumbers[i] = randomIntegerSizeN(d);
        }


        return randomIntegerNumbers;
    }


    public static void main(String[] args) {
        Task19 task19 = new Task19();
        System.out.println(Arrays.toString(task19.createRangeOfRandomIntegerNumbers(3,2)));

    }
}