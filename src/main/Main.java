public class Main {

    int[][] matriz;
    int primerSumaD;

    private static void printMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
                if (j == matriz.length - 1) {
                    System.out.print("\n");
                }
            }
        }
    }

    public int sumaPrimerDiagonal(int[][] matriz) {
        int primerSumaD;
        primerSumaD = 0;
        for (int i = 0; i < matriz.length; i++) {
            primerSumaD = primerSumaD + matriz[i][i];
        }
        System.out.println(primerSumaD);
        return primerSumaD;
    }

}
