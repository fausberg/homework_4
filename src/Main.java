import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task_0();
        Task_1();
        Task_2();
        Task_3();
        Task_4();
        Task_5();
        Task_6();
        Task_7();
    }

    public static void Task_0() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        boolean a = false;

        for (int it : arr) {
            if (it == n) {
                a = true;
            }
        }

        if (a == true) {
            System.out.println("Заданное число есть в массиве");
        } else {
            System.out.println("Заданного числа нет в массиве");
        }
    }

    public static void Task_1() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        boolean a = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                a = true;
                arr[i] = random.nextInt(n);
            }
        }

        System.out.println(Arrays.toString(arr));

        if (a == true) {
            System.out.println("Заданное число есть в массиве");
        } else {
            System.out.println("Заданного числа нет в массиве");
        }
    }

    public static void Task_2() {
        Scanner scanner = new Scanner(System.in);
        int b = 10;
        int a = 1;
        int n = scanner.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =a + Math.random() * b;
            arr[i] = Math.round(arr[i]);
        }

        System.out.println(Arrays.toString(arr));

        double max = arr[0];

        double min = arr[0];

        double sum = 0;

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Максимальное число = " + max);
        System.out.println("Минимальное число =" + min);
        System.out.println("Среднее арифметическое =" + sum / n);
    }

    public static void Task_3(){
        Random random = new Random();
        int n = 5;
        int[] arr = new int[n];
        int[] arr_1 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr_1[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr_1));

        double sum = 0;
        double sum_1 = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        sum /=n;
        System.out.println("Среднее арифметическое 1 массива = "+ sum);

        for (int i = 0; i < n; i++) {
            sum_1 += arr_1[i];
        }
        sum_1 /=n;
        System.out.println("Среднее арифметическое 2 массива = "+ sum_1);

        if(sum > sum_1){
            System.out.println("Среднее арифметическое 1 массива больше");
        }else if(sum == sum_1){
            System.out.println("Среднее арифметическое масивов равны");
        }else{
            System.out.println("Среднее арифметическое 2 массива больше");
        }

    }

    public static void Task_4(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean a = false;
        int n = 0;
        while(!a){
            System.out.println("Введите размер массива: больше 5 и до 10 включительно");
            n = scanner.nextInt();
            if(n > 5 && n<=10){
                a = true;
            }else {
                System.out.println("n не удовлетворяет условие. Введите его снова");
            }
        }
        int[] arr = new int[n];
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            if(arr[i] % 2 == 0){
                c++;
            }
        }

        System.out.println(Arrays.toString(arr));

        int[] arr_1 = new int[c];

        c = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr_1[c] = arr[i];
                c++;
            }
        }

        System.out.println(Arrays.toString(arr_1));
    }

    public static void Task_5(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void Task_6(){
        String[] arr = new String[]{"bfgjblg", "sadhfkhd", "ahsdiohfioew", "kgdkh", "woeuqo"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Task_7(){
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int pum = 0;
        for (int i = 0; i < 10; i++) {
            for (int g = i; g < 10; g++) {
                if (arr[g] < arr[i]) {
                    pum = arr[i];
                    arr[i] = arr[g];
                    arr[g] = pum;
                }
            }
        }

        System.out.println();

        System.out.println(Arrays.toString(arr));
    }
}