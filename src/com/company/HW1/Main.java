package com.company.HW1;
import com.company.HW1.Tasks.*;

public class Main {

    public static void main(String[] args) {

        Title.print(1);
        Task1.hello();

        Title.print(2);
        Task2.getNumber(1);

        Title.print(3);
        Task3.increaseNumber(3);

        Title.print(4);
        Task4.swapIntVars(4, 6);

        Title.print(5);
        Task5.getGipotenuza(3,4);

        Title.print(6);
        Task6.getLastDigit(52341);

        Title.print(7);
        Task7.theNumberOfTens(4315);

        Title.print(8);
        Task8.getTens(24);

        Title.print(9);
        System.out.println(Task9.getDif(40));

        Title.print(10);
        System.out.println(Task10.getAverage(10, 20));

        Title.print(11);
        System.out.println(Task11.getGeometricMean(8, 5));

        Title.print(12);
        System.out.println(Task12.getDistance(1,1,5,6));
    }
}
