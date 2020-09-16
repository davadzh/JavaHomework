package com.company.HW1.Tasks;

public final class Task4 {
    public static void swapIntVars(int x, int y)
    {
        int t = x;
        x = y;
        y = t;
        System.out.println("Смена 1");
        System.out.println("x = " + x + ", y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Смена 2");
        System.out.println("x = " + x + ", y = " + y);
    }
}
