import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        int[] three = {1, 3, 5};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        int[] three = {1, 3, 5};
        for (int i = 0; i <= 2; i++) {
            if (i != 2) System.out.print(one[i] + ", ");
            else System.out.println(one[i]);
        }
        for (int i = 0; i <= 2; i++)
            if (i != 2) System.out.print(two[i] + ",  ");
            else System.out.println(two[i]);
        for (int i = 0; i < 3; i++) {
            if (i != 2) System.out.print(three[i] + ", ");
            else System.out.println(three[i]);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        int[] three = {1, 3, 5};
        for (int i = 2; i >= 0; i--) {
            if (i != 0) System.out.print(one[i] + ", ");
            else System.out.println(one[i]);
        }
        for (int i = 2; i >= 0; i--)
            if (i != 0) System.out.print(two[i] + ",  ");
            else System.out.println(two[i]);
        for (int i = 2; i >= 0; i--) {
            if (i != 0) System.out.print(three[i] + ", ");
            else System.out.println(three[i]);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;

        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i] += 1;
            }
        }
        System.out.println(Arrays.toString(one));

    }
}