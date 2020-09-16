package com.company.HW2.Tasks;

public class Task2_Vector3D
{
    public float x, y, z;
    public Task2_Vector3D(float x, float y, float z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public enum VectorOperations
    {
        Add,
        Sub
    }


    public static void print(Task2_Vector3D vector)
    {
        System.out.println("X = " + vector.x);
        System.out.println("Y = " + vector.y);
        System.out.println("Z = " + vector.z);
    }


    public static double getLength(Task2_Vector3D vector)
    {
        return Math.sqrt(vector.x*vector.x + vector.y*vector.y + vector.z*vector.z);
    }

    public static float scalarMult(Task2_Vector3D v1, Task2_Vector3D v2)
    {
        return v1.x*v2.x + v1.y*v2.y + v1.z*v2.x;
    }


    public static Task2_Vector3D vectorMult(Task2_Vector3D v1, Task2_Vector3D v2)
    {
        return new Task2_Vector3D(
                v1.y*v2.z - v1.z*v2.y,
                v1.z*v2.x - v1.x*v2.z,
                v1.x*v2.y - v1.y*v2.x);
    }

    public static double cosVectors(Task2_Vector3D v1, Task2_Vector3D v2)
    {
        return scalarMult(v1, v2)/(getLength(v1)*getLength(v2));
    }

    public static Task2_Vector3D verctorAddOrSub(Task2_Vector3D v1, Task2_Vector3D v2, VectorOperations op) throws Exception {
        switch (op)
        {
            case Add:
                return new Task2_Vector3D(v1.x+v2.x, v1.y+v2.y, v1.z+v2.z);
            case Sub:
                return new Task2_Vector3D(v1.x-v2.x, v1.y-v2.y, v1.z-v2.z);
            default:
                throw new Exception("Ошибка при операции над векторами, проверьте данные");
        }
    }


//    public static Task2_Vector3D[] getRandomVectors(int count)
//    {
//        if(count > 0)
//        {
//            for (int i = 0; i < count; i++) {
//
//            }
//        }
//
//    }
}


