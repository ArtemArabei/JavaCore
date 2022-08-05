package Lection_4.Cycles.Arrays;

public class Loops2 {
        public int getArraySum(int array[]) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            return sum;
        }

        public int getMaxSumArray(int[] a, int[] b, int[] c) {
            int sumA = getArraySum(a);
            System.out.println("Сумма элементов массива A равна: " + sumA);
            int sumB = getArraySum(b);
            System.out.println("Сумма элементов массива B равна: " + sumB);
            int sumC = getArraySum(c);
            System.out.println("Сумма элементов массива C равна: " + sumC);

            int maxSum = 0;
            int sums[] = {sumA, sumB, sumC};
            for (int i = 0; i < sums.length; i++) {
                if (sums[i] > maxSum) {
                    maxSum = sums[i];
                }
            }

            int result = 0;
            if (sumA == maxSum)
                result = result | 0B100;
            if (sumB == maxSum)
                result = result | 0B010;
            if (sumC == maxSum)
                result = result | 0B001;

            return result;
        }
}
