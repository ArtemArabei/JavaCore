package Lection_4.Cycles.Arrays;

public class Loops {

    public int getSqr(int n) {
        int sqr = 0;
        for (int i = 1; i <= n; i++) {
            sqr = sqr + n;
        }
        return sqr;
    }

    public int getArraySum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public int getMaxSumArray(int[] a, int[] b, int[] c) {
        int result = 0;
        int intermediateResult = 0;
        int sumA = getArraySum(a);
        System.out.println("Сумма элементов массива A равна: " + sumA);
        int sumB = getArraySum(b);
        System.out.println("Сумма элементов массива B равна: " + sumB);
        int sumC = getArraySum(c);
        System.out.println("Сумма элементов массива C равна: " + sumC);
        int maxSum = -1;
        int sums[] = {sumA, sumB, sumC};
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] > maxSum) {
                maxSum = sums[i];
            }
        }
        if (sumA == maxSum)
            intermediateResult = intermediateResult + 1;
        if (sumB == maxSum)
            intermediateResult = intermediateResult + 5;
        if (sumC == maxSum)
            intermediateResult = intermediateResult + 9;
        switch (intermediateResult) {
            case 1:
                result = 1;
                break;
            case 5:
                result = 2;
                break;
            case 9:
                result = 3;
                break;
            case 6:
                result = 4;
                break;
            case 10:
                result = 5;
                break;
            case 14:
                result = 6;
                break;
            case 15:
                result = 7;
                break;
        }
        return result;
    }
}
