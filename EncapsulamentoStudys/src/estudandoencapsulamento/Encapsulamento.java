package estudandoencapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[][] matriz = new Object[5][10];

        // Preenchendo a matriz com valores de exemplo
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (j % 4 == 0) {
                    matriz[i][j] = i * 10 + j + 1; // Valor inteiro
                } else if (j % 4 == 1) {
                    matriz[i][j] = (char) ('A' + i); // Caractere
                } else if (j % 4 == 2) {
                    matriz[i][j] = 1.5 * (i * 10 + j + 1); // Valor de ponto flutuante
                } else {
                    matriz[i][j] = (i + j) % 2 == 0; // Valor lógico (booleano)
                }
            }
        }

        // Exibindo a matriz
        System.out.println("Matriz 5x10:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
	}

}
