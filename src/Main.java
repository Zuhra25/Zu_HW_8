public class Main {
    public static void main(String[] args) {
        //task1();
        task2();
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
            if (i != 2)
                System.out.print(one[i] + ", ");
            else
                System.out.println(one[i]);
        }
        for (int i = 0; i <= 2; i++)
            if (i != 2)
                System.out.print(two[i] + ",  ");
            else
                System.out.println(two[i]);
        for (int i = 0; i < 3; i++) {
            if (i != 2)
                System.out.print(one[i] + ", ");
            else
                System.out.println(one[i]);
        }
    }
}