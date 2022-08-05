package Lection_5.Packages_classes_objects.Access_modifiers.Constructors;

public class TestMatrix {
    public static void main(String[] args) {
        int lines = 3;
        int columns = 3;
        int multiplier = 5;
        Matrix matrix1 = new Matrix(lines, columns);
        matrix1.generateMatrix();
        System.out.println("Первая матрица выглядит так:");
        matrix1.printMatrix();
        Matrix matrix2 = new Matrix(lines, columns);
        matrix2.generateMatrix();
        System.out.println("\nВторая матрица выглядит так:");
        matrix2.printMatrix();
        Matrix matrix3 = matrix1.sumMatrix(matrix2);
        System.out.println("\nТретья матрица выглядит так:");
        matrix3.printMatrix();
        Matrix matrix4 = matrix1.multiplyMatrix(multiplier);
        System.out.println("\nЧетвертая матрица выглядит так:");
        matrix4.printMatrix();
    }
}
