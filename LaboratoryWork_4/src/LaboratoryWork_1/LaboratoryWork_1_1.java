package LaboratoryWork_1;

import java.util.Scanner;

public class LaboratoryWork_1_1 {

    static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    static int getMult(int a, int b, int c) {

        return a * b * c;
    }

    static int getDec(int a) {

        return --a;
    }

    static int getRicht(int b) {

        return b << 2;
    }

    static int getI(int a) {

        return a &= 4;
    }

    static boolean Oper1(boolean i, boolean j) {

        return i & j;
    }

    static boolean Oper2(boolean i, boolean j) {

        return i && j;
    }

    static boolean Oper3(boolean i, boolean j) {

        return i &= j;
    }

    static boolean Oper4(int a, int b) {

        return (a == b) ? true : false;
    }


    static int getSumProv1(int a, int b, int c) {

        return (a + b) + c;
    }

    static int getSumProv2(int a, int b, int c) {

        return a + (b + c);
    }

    static int getSumProv3(int a, int b, int c) {

        return (a + c) + b;
    }

    static int getSumProv4(int a, int b, int c) {

        return (b + a) + c;
    }

    static int getSumProv5(int a, int b, int c) {

        return (c + b) + a;
    }

    static boolean getSumProv(int n10, int n11, int n12, int n13, int n14) {

        return (n10 == n11 && n11 == n12 && n12 == n13 && n13 == n14) ? true : false;
    }


    static int getPrioProv1(int a, int b, int c) {

        return (a + b) * c;
    }

    static int getPrioProv2(int a, int b, int c) {

        return a + b * c;
    }

    static int getPrioProv3(int a, int b, int c) {

        return a * c + b;
    }

    static int getPrioProv4(int a, int b, int c) {

        return a * (c + b);
    }

    static int getPrioProv5(int a, int b, int c) {

        return a * b + c;
    }

    static boolean getPrioProv(int n16, int n17, int n18, int n19, int n20) {

        return (n16 != n17 && n18 != n19) ? true : false;
    }


    public static void Go() {
        // TODO Auto-generated method stub
        //Для считывания данных с консоли
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        boolean i, j;
        //Ввод данных
        System.out.println("Введите первое число");
        a = sc.nextInt();//Считываем первое число

        System.out.println("Введите второе число");
        b = sc.nextInt();//Считываем второе число

        System.out.println("Введите третье число");
        c = sc.nextInt();//Считываем третье число

        System.out.println("Введите первое логическое значение");
        i = sc.nextBoolean();//Считываем первое число

        System.out.println("Введите второе логическое значение");
        j = sc.nextBoolean();//Считываем второе число

        //Действия
        int n1 = getSum(a, b, c);
        System.out.println(n1);

        int n2 = getMult(a, b, c);
        System.out.println(n2);

        int n3 = getDec(a);
        System.out.println(n3);

        int n4 = getRicht(b);
        System.out.println(n4);

        int n5 = getI(a);
        System.out.println(n5);

        boolean n6 = Oper1(i, j);
        System.out.println(n6);

        boolean n7 = Oper2(i, j);
        System.out.println(n7);

        boolean n8 = Oper3(i, j);
        System.out.println(n8);

        boolean n9 = Oper4(a, b);
        System.out.println("выражение a >= b: " + n9);

        //Проверка ассоциативности
        int n10 = getSumProv1(a, b, c);
        int n11 = getSumProv2(a, b, c);
        int n12 = getSumProv3(a, b, c);
        int n13 = getSumProv4(a, b, c);
        int n14 = getSumProv5(a, b, c);
        boolean n15 = getSumProv(n10, n11, n12, n13, n14);
        System.out.println("Закон ассоциативности:" + n15);

        //Проверка приоритетов
        int n16 = getPrioProv1(a, b, c);
        int n17 = getPrioProv2(a, b, c);
        int n18 = getPrioProv3(a, b, c);
        int n19 = getPrioProv4(a, b, c);
        int n20 = getPrioProv5(a, b, c);
        boolean n21 = getPrioProv(n16, n17, n18, n19,n20);
        System.out.println("Соблюдение приoритетов:" + n21);

    }
}