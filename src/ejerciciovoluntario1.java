public class ejerciciovoluntario1 {
    public static void main(String[] args) {
        int[] fila1= {1, 0, 0};
        int[] fila2 = {0, 1, 0};
        int[] fila3 = {0, 0, 1};

        int[][] matriz = { fila1, fila2, fila3 };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
