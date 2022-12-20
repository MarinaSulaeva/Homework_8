import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание №1");
        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    }

    public static void task2() {
        System.out.println("Задание №2");
        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

    public static void task3() {
        System.out.println("Задание №3");
        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int index = arr1.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(arr1[index]);
                break;
            }
            System.out.print(arr1[index] + ", ");
        }
        System.out.println();
        for (int index = arr2.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(arr2[index]);
                break;
            }
            System.out.print(arr2[index] + ", ");
        }
        System.out.println();
        for (int index = arr3.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(arr3[index]);
                break;
            }
            System.out.print(arr3[index] + ", ");
        }
        System.out.println();

    }

    public static void task4() {
        System.out.println("Задание №4");
        int[] arr1 = new int[]{1, 2, 3};
        for (int index = 0; index < arr1.length; index++) {
            if (arr1[index] % 2 != 0) {
                arr1[index] = arr1[index] + 1;
            }
            if (index == arr1.length - 1) {
                System.out.print(arr1[index]);
                break;
            }
            System.out.print(arr1[index] + ", ");
        }
    }
}