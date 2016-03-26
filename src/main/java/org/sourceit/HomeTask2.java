package org.sourceit;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(decimalToHex(490));
    }
    /**
     * Конвертирует десятичное число в бинарную форму
     *
     * @param numb может быть только позитивным
     * @return бинарная форма числа
     */
    public static long decimalToBinary(int numb) {
        int b=1;
        long result=0;
        int d=0;
        int y=0;
        for(int i=1;i<=numb;i*=2) {
            d++;
            if ((i <= numb) && (i * 2 > numb)) {
                result += 1 * Math.pow(10, --d);
                y = i;
                numb -= i;
            }
        }
        while(y!=0){
            y/=2;
            d--;
            if((y<=numb)&&(y*2>numb)){
                result+=1*Math.pow(10,d);
                numb-=y;
            }
        }
        return result;
    }

    /**
     * Конвертирует десятичное число в октальную форму
     *
     * @param number может быть только позитивным
     * @return октальная форма числа
     */
    public static long decimalToOctal(int number) {
        int result=0;
        int k=1;
        while(number>8){
            result+=((number%8)*k);
            number/=8;
            k*=10;
        }
        result+=number*k;

        return result;

    }

    /**
     * Конвертирует десятичное число в хексовою форму
     *
     * @param number может быть только позитивным
     * @return хексовая форма числа
     */
    public static long decimalToHex(int number) {
        int result=0;
        int k=1;
        int f=0;
        while(number>16){
            f=((number%16));
            result+=f*k;
            number/=16;
            k*=100;
        }
        f=((number%16));
        result += f * k;
        return result;
    }

    /**
     * Конвертирует бинарную форму в десятичное число
     *
     * @param binary бинарная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int binaryToDecimal(long binary) {
        int result=0;
        for(int i=0;binary>0;i++){
            int f=(int)binary%10;
            if(f==1){
                result+=Math.pow(2,i);
            }
            binary/=10;
        }
        return result;

    }

    /**
     * Конвертирует октальную форму в десятичное число
     *
     * @param octal октальная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int octalToDecimal(long octal) {
        int result=0;
        for(int i=0;octal>0;i++) {
            int f = (int) octal % 10;
            result += Math.pow(8, i)* f;
            octal /= 10;
        }
        return result;
    }

    /**
     * Конвертирует хексовую форму в десятичное число
     *
     * @param hex хексовая форма, может быть только позитивным
     * @return десятичное число
     */
    public static int hexToDecimal(long hex) {
        int result=0;
        for(int i=0;hex>0;i++) {
            int f = (int) hex % 10;
            result += Math.pow(16, i)* f;
            hex /= 10;
        }
        return result;
    }

    /**
     * Генерируют двумерный массив, со случайными числами.
     *
     * @param rows
     * @param columns
     * @return двумерный массив
     */
    public static int[][] generateTwoDimensionArray(int rows, int columns) {
        int a[][] = new int[rows][columns];
        Random r=new Random();
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=r.nextInt();
            }
        }
        return a;
    }

    /**
     * Определить и вывести на экран индекс строки с
     * наибольшим по модулю произведением элементов.
     * Если таких строк несколько, то вывести индекс
     * первой встретившейся из них.
     *
     * @param input двумерный массив
     * @return индекс строки
     */
    public static int findMaxProduct(int[][] input) {
        int a[]=new int[input.length];
        for(int i=0;i<input.length;i++){
            a[i]=1;
            for(int j=0;j <input[i].length;j++){
                a[i]*=input[i][j];
                if(a[i]<0){
                    a[i]*=-1;
                }
            }
            System.out.println(a[i]);
        }
        int max=a[0];
        int h=0;
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
                h=i;
            }
        }
        return h;

    }

    /**
     * Выводит все простые числа из интервала от 2 до n.
     *
     * @param n
     * @return массив простых чисел.
     */
    public static int[] getSimple(int n) {
        int f=0;
        for (int i=2;i<n;i++){
            int t=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    t++;
                }
            }
            if(t<=1){
                f++;
            }
        }
        int a[]=new int[f];
        f=0;
        for (int i=2;i<n;i++) {
            int t = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    t++;
                }
            }
            if (t <= 1) {
                a[f++] = i;
            }
        }
        return a;
    }

    // Рекурсивные методы. Реализовать их нужно с помощью рекурсии.

    /**
     * Вычисляет сумму чисел от 1 до n включительно.
     *
     * @param n предел
     * @return сумма
     */
    public static long sum(int n) {
        long result;
        if (n==1) {
            return 1;
        }else if(n<=0){
            return 0;
        }
        result = sum(n-1)+(n);
        return result;

    }

    /**
     * Метод вычисляет, результат умножения.
     *
     * @param first
     * @param second
     * @return
     */
    public static int product(int first, int second) {
        if((first<0)&&(second<0)){
            first*=-1;
            second*=-1;
        }
        if((second<0)&&(first>0)){
            second*=-1;
            first*=-1;
        }
        int result=0;
        if (second <= 0) {
            return 0;
        }
          return first+product(first,second-1);

    }
}
