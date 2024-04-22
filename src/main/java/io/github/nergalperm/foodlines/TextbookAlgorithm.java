package io.github.nergalperm.foodlines;

class TextbookAlgorithm {
    public static int[] solve(int n, int m, int[] lineLengths) {
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            int shortestIndex = getShortestIndex(lineLengths);
            result[i] = lineLengths[shortestIndex];
            lineLengths[shortestIndex]++;
        }
        return result;
    }

    private static int getShortestIndex(int[] lineLengths) {
        int shortestIndex = 0;
        for (int i = 1; i < lineLengths.length; i++) {
            if (lineLengths[i] < lineLengths[shortestIndex]) {
                shortestIndex = i;
            }
        }
        return shortestIndex;
    }
}
