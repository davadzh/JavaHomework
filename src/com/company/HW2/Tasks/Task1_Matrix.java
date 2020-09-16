package com.company.HW2.Tasks;

public final class Task1_Matrix {
    public static class Matrix
    {
        public int[][] _matrix;
        public Matrix(int[][] matrix)
        {
            _matrix = matrix;
        }

        public enum Methods {
            Add,
            Sub,
            Mult,
            MultByNumber,
            Transpos,
            Exp
        }

        public static void print(Matrix m)
        {
            for (int i = 0; i < m._matrix.length; i++) {
                for (int j = 0; j < m._matrix[i].length; j++) {
                    System.out.print(m._matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    public static Matrix Operation(Matrix m1, Matrix m2, Matrix.Methods methodName) throws Exception {
        Matrix matrix_out = new Matrix(new int[m1._matrix.length][m2._matrix[0].length]);

        for (int i = 0; i < m1._matrix.length; i++) {
            for (int j = 0; j < m2._matrix[0].length; j++) {

                switch (methodName) {
                    case Add:
                        matrix_out._matrix[i][j] = m1._matrix[i][j] + m2._matrix[i][j];
                        break;
                    case Sub:
                        matrix_out._matrix[i][j] = m1._matrix[i][j] - m2._matrix[i][j];
                        break;
                    case Mult:
                        for (int k = 0; k < m1._matrix[i].length; k++)
                            matrix_out._matrix[i][j] += m1._matrix[i][k] * m2._matrix[k][j];
                        break;
                    default:
                        throw new Exception("Метод " + methodName + " не допустим в данном контексте.");
                }

            }
        }

        return matrix_out;
    }


    public static Matrix Operation(Matrix m, int number, Matrix.Methods methodName) throws Exception
    {
        Matrix matrix_out = new Matrix(new int[m._matrix.length][m._matrix[0].length]);

        for (int i = 0; i < m._matrix.length; i++) {
            for (int j = 0; j < m._matrix[i].length; j++) {

                switch (methodName) {
                    case MultByNumber:
                        matrix_out._matrix[i][j] = m._matrix[i][j] * number;
                        break;
                    case Exp:
                        matrix_out = m;
                        for (int n = 2; n <= number; n++)
                            matrix_out = Operation(m, matrix_out, Matrix.Methods.Mult);
                        return matrix_out;
                    default:
                        throw new Exception("Метод " + methodName + " не допустим в данном контексте.");
                }

            }
        }

        return matrix_out;
    }

    public static Matrix Operation(Matrix m, Matrix.Methods methodName) throws Exception {
        Matrix matrix_out = new Matrix(new int[m._matrix[0].length][m._matrix.length]);

        for (int i = 0; i < m._matrix.length; i++) {
            for (int j = 0; j < m._matrix[i].length; j++) {

                switch (methodName) {
                    case Transpos -> matrix_out._matrix[j][i] = m._matrix[i][j];
                    default -> throw new Exception("Метод " + methodName + " не допустим в данном контексте.");
                }

            }
        }

        return matrix_out;
    }

}


