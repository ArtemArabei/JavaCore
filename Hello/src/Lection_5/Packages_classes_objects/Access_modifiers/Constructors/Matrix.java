package Lection_5.Packages_classes_objects.Access_modifiers.Constructors;

import java.util.Random;

public class Matrix {
    int numberOfLines;
    int numberOfColumns;
    double[][] array;

    public Matrix(int numberOfLines, int numberOfColumns) {
        this.numberOfLines = numberOfLines;
        this.numberOfColumns = numberOfColumns;
        array = new double[numberOfLines][numberOfColumns];
    }

    public void generateMatrix() {
        Random rand = new Random();
                for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextDouble(10);
            }
        }
    }

    public Matrix sumMatrix(Matrix matrix2) {
        Matrix matrix3 = new Matrix(numberOfLines, numberOfColumns);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                matrix3.array[i][j] = matrix2.array[i][j] + array[i][j];
            }
        }
        return matrix3;
    }

    public Matrix multiplyMatrix(int multiplier) {
        Matrix matrix4 = new Matrix(numberOfLines, numberOfColumns);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                matrix4.array[i][j] = array[i][j] * multiplier;
            }
        }
        return matrix4;
    }

    public void printMatrix() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

/*public double[][] sumArray(double[][] array1, double[][] array2, double[][] array3) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
                System.out.print(array3[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }*/
