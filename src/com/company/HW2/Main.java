package com.company.HW2;
import com.company.HW2.Tasks.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //*************  МАТРИЦЫ  **************//

        Task1_Matrix.Matrix m1 = new Task1_Matrix.Matrix(new int[][]{{1,2},{3,4}});
        Task1_Matrix.Matrix m2 = new Task1_Matrix.Matrix(new int[][]{{5,6},{7,8}});

        Task1_Matrix.Matrix m3 = new Task1_Matrix.Matrix(new int[][]{{5,6,7},{2,4,8}});
        Task1_Matrix.Matrix m4 = new Task1_Matrix.Matrix(new int[][]{{1,2},{3,7},{6,0}});

        // Сложение двух матриц
        System.out.println("Сложение двух матриц");
        Task1_Matrix.Matrix.print(Task1_Matrix.Operation(m1, m2, Task1_Matrix.Matrix.Methods.Add));

        // Вычитание двух матриц
        System.out.println("Вычитание двух матриц");
        Task1_Matrix.Matrix.print(Task1_Matrix.Operation(m1, m2, Task1_Matrix.Matrix.Methods.Sub));

        // Умножение матрицы на число
        System.out.println("Умножение матрицы на число");
        Task1_Matrix.Matrix.print(Task1_Matrix.Operation(m1, 4, Task1_Matrix.Matrix.Methods.MultByNumber));

        // Умножение матриц
        System.out.println("Умножение матриц");
        Task1_Matrix.Matrix.print(Task1_Matrix.Operation(m3, m4, Task1_Matrix.Matrix.Methods.Mult));

        // Транспонирование матрицы
        System.out.println("Транспонирование матрицы");
        Task1_Matrix.Matrix.print(Task1_Matrix.Operation(m3, Task1_Matrix.Matrix.Methods.Transpos));

        // Возведение матрицы в степень
        System.out.println("Возведение матрицы в степень (где степень - целое число, больше 1)");
        Task1_Matrix.Matrix.print(Task1_Matrix.Operation(m1, 3, Task1_Matrix.Matrix.Methods.Exp));


        //***************  ВЕКТОРЫ  ***************//

        Task2_Vector3D v1 = new Task2_Vector3D(3, 5, 8);
        Task2_Vector3D v2 = new Task2_Vector3D(2, 6, 7);

        // Получение длины вектора
        System.out.println(Task2_Vector3D.getLength(v1));

        // Скалярное произведение векторов
        System.out.println(Task2_Vector3D.scalarMult(v1, v2));

        // Произведение векторов
        Task2_Vector3D.print(Task2_Vector3D.vectorMult(v1,v2));

        // Нахождение косинуса угла между векторами
        System.out.println(Task2_Vector3D.cosVectors(v1, v2));

        // Сложение и вычитание векторов
        Task2_Vector3D.print(Task2_Vector3D.verctorAddOrSub(v1,v2,Task2_Vector3D.VectorOperations.Add));
        Task2_Vector3D.print(Task2_Vector3D.verctorAddOrSub(v1,v2,Task2_Vector3D.VectorOperations.Sub));

    }
}
