import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Task_0();
//        Task_1();
//        Task_2();
//        Task_3();
//        Task_4();
//        Task_5();
//        Task_6();
//        Task_7();
//        Task_8();
//        Task_9();
//        Task_10();
//        Task_11();
//        Task_12();
//        Task_13();
//        Task_14();
        Task_15();
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
            arr[i] = a + Math.random() * b;
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

    public static void Task_3() {
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
        sum /= n;
        System.out.println("Среднее арифметическое 1 массива = " + sum);

        for (int i = 0; i < n; i++) {
            sum_1 += arr_1[i];
        }
        sum_1 /= n;
        System.out.println("Среднее арифметическое 2 массива = " + sum_1);

        if (sum > sum_1) {
            System.out.println("Среднее арифметическое 1 массива больше");
        } else if (sum == sum_1) {
            System.out.println("Среднее арифметическое масивов равны");
        } else {
            System.out.println("Среднее арифметическое 2 массива больше");
        }

    }

    public static void Task_4() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean a = false;
        int n = 0;
        while (!a) {
            System.out.println("Введите размер массива: больше 5 и до 10 включительно");
            n = scanner.nextInt();
            if (n > 5 && n <= 10) {
                a = true;
            } else {
                System.out.println("n не удовлетворяет условие. Введите его снова");
            }
        }
        int[] arr = new int[n];
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            if (arr[i] % 2 == 0) {
                c++;
            }
        }

        System.out.println(Arrays.toString(arr));

        int[] arr_1 = new int[c];

        c = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr_1[c] = arr[i];
                c++;
            }
        }

        System.out.println(Arrays.toString(arr_1));
    }

    public static void Task_5() {
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

    public static void Task_6() {
        String[] arr = new String[]{"bfgjblg", "sadhfkhd", "ahsdiohfioew", "kgdkh", "woeuqo"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Task_7() {
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

    public static void Task_8() {
        boolean a = false;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            if (i + 1 == n - 1) {
                System.out.println(a);
                break;
            } else if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
                a = true;
            }
        }
    }

    public static void Task_9() {
        boolean w = false;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        System.out.println("Введите размерность массива");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            if (arr[i] % a == 0 && arr[i] % b != 0) {
                w = true;
            }
        }
        System.out.println(w);
    }

    public static void Task_10() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int index = 0;

        for (int i = 0; i < n; i += 2) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);
        boolean a = false;

        for (int i = 0; i < n; i += 2) {
            if (max == arr[i] && i != index) {
                a = true;
            }
        }

        if (a) {
            System.out.println("Такое значение не единственное");
        } else {
            System.out.println("Такое значение единственное");
        }
    }

    public static void Task_11() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);
        int pum = max;
        int pum_1 = 0;

        for (int i = index; i < n; i++) {
            if (i == n - 1) {
                break;
            } else {
                pum_1 = arr[i + 1];
                arr[i + 1] = pum;
                pum = pum_1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Task_12() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        int chislo = 0;
        int pum_schet = 0;
        int schet = 0;

        for (int i = 0; i < n; i++) {
            for (int g = 0; g < n; g++) {
                if (arr[i] == arr[g]) {
                    schet++;
                }
            }
            if (schet > pum_schet) {
                chislo = arr[i];
                pum_schet = schet;
            }
            schet = 0;
        }

        System.out.println(chislo);
        System.out.println(pum_schet);
    }

    public static void Task_13() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(arr));
        int K = 0;
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                break;
            } else if (arr[i + 1] > max) {
                max = arr[i + 1];
            } else {
                K++;
            }
        }

        System.out.println("Столько значений надо исключить: " + K);

        double sum = 0;
        int schet = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > -2 && arr[i] < 10) {
                sum += arr[i];
                schet++;
            }
        }
        System.out.println(sum / schet);
    }

    public static void Task_14() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        int b = 8;
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(500) + 500;
        }

        System.out.println(Arrays.toString(arr));

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 8 == 0) {
               sum+=arr[i];
            }
        }

        System.out.println(sum);

    }

    public static void Task_15(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте число a");
        int a = scanner.nextInt();
        System.out.println("Укажите размерность массива");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        int schet = 0;

        for (int i = 0; i < n; i++) {
            if( arr[i] == a){
              break;
            } else if(arr[i] % 2 == 0){
                schet++;
            }
        }

        System.out.println(schet);
    }
}