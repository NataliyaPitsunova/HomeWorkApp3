import java.util.Random;

import static java.lang.Math.abs;

import java.lang.reflect.Array;
import java.util.Random;

import static java.lang.Math.abs;

public class homeWork3 {
        public static void main(String[] args) {
            arrayChange0to1();
            array1to100();
            array6();
            diagonalOne();
            arrayLenValue(5, 3);
            arrayMaxMinValue();
            /*задаем массив для передачи в метод*/
            int Mainarray[] = {1,2,3,4,5,6,7}; /*1,1,2,3,4,5,5,1*/
            System.out.println(summRightLeftSide(Mainarray));
            arrayShrShl(Mainarray, 2);
        }
        public static void arrayChange0to1() {
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                    System.out.print(arr[i] + " ");
                } else {
                    arr[i] = 0;
                    System.out.print(arr[i] + " ");}
            }
            System.out.println(" ");
            System.out.println();
        }

        public static void array1to100() {
            int[] arr = new int[100];
            for (int i = 0; i < 100; i++) {
                arr[i] = i + 1;
                System.out.println(arr[i]);
            }
            System.out.println();
        }

        public static void array6() {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] = arr[i] * 2;
                    System.out.print(arr[i] + " ");
                } else {
                    System.out.print(arr[i] + " ");
                }

            }
            System.out.println();
            System.out.println();
        }

        public static void diagonalOne() {
            int[][] table = new int[6][6];

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if ((i == j) || (i + j == 5)) {
                        table[i][j] = 1;
                    }
                    System.out.print(table[i][j] + " ");
                }
                System.out.println();
            }

        }

/*Написать метод, принимающий на вход два аргумента: len и initialValue,
 и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/

        public static void arrayLenValue(int len, int initialValue) {
            int[] array = new int[len];
            System.out.println();
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;

                System.out.print(array[i] + " ");
            }
        }

        public static void arrayMaxMinValue() {

            System.out.println();
            int[] arr = new int[6];
            for (int i = 0; i < 6; i++) {    /*рандомное заполнение массива*/
                Random rand = new Random();
                arr[i] = rand.nextInt(100);
                System.out.println();
                System.out.print(arr[i] + " ");
            }
            int Max = arr[0];
            int Min = arr[0];
            for (int i = 0; i < 6; i++) {
                if (arr[i] >= Max) {
                    Max = arr[i];
                }
                if (arr[i] <= Min) {
                    Min = arr[i];
                }
            }
            System.out.println();
            System.out.println("Максимальное число в массиве: " + Max);
            System.out.println("Минимальное число в массиве: " + Min);
        }
/* Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.*/

        public static boolean summRightLeftSide(int[] array) {
            int summ1 = 0;
            int summ2 = 0;
            for (int i = 0; i < (array.length / 2); i++) {
                summ1 += array[i];
            }
            for (int i = array.length; i > (array.length / 2); i--) {
                summ2 += array[i - 1];
            }
            if (summ1 == summ2) {
                return (summ1 == summ2);
            }
            else {
                if (summ1 < summ2) {
                    for (int j = 0; j < (array.length / 2); j++) {  //индекс которыц будет отниматьсч /прибавлться
                        summ1 += array[(array.length / 2) + j];
                        summ2 -= array[(array.length / 2) - j];
                        if (summ1 == summ2) {
                            break;
                        } else {
                            continue;
                        }
                    }
                } else {
                    for (int j = 0; j < (array.length / 2); j++) {  //коэффициент который отнимает от среднего индес
                        summ1 -= array[(array.length / 2) - j];
                        summ2 += array[(array.length / 2) + j];
                        if (summ1 == summ2) {
                            break;
                        } else {
                            continue;
                        }
                    }
                }

            }
            return (summ1==summ2);

        }

        public static void arrayShrShl(int [] array, int n) {
            System.out.println();
            int val1;
            if (n>=0){
                for (int j=0; j<n;j++){
                    for (int i = array.length - 1; i > 0; i--) {
                        if (i + 1 < array.length) {
                            val1 = array[i +1];
                            array[i +1] = array[i];
                            array[i] = val1;
                        } else {
                            val1 = array[abs(i +1- array.length)];
                            array[abs(i +1 - array.length)] = array[i];
                            array[i] = val1;
                        }}}
            }else
            {for (int j=n; j<0;j++){
                for (int i = 0; i < array.length-1; i++) {
                    if (i - 1>=0) {
                        val1 = array[i-1];
                        array[i -1] = array[i];
                        array[i] = val1;
                    } else {
                        val1 = array[abs(array.length-1)];
                        array[abs(array.length-1)] = array[i];
                        array[i] = val1;
                    }}}}
            for (int i = 0; i < array.length; i++)
            {System.out.print(array[i] + " "); }}
    }