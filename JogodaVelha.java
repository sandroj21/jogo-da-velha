import java.net.SocketTimeoutException;
import java.util.Scanner;

public class JogodaVelha {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int linha = 0;
		int coluna = 0;
		boolean continua = true;

		System.out.println("Jogo da Velha");
		System.out.println("Jogador 1 começa com o número 1");
		System.out.println("Jogador 2 começa com o número 2");
		System.out.println("Só é permitido atribuir o valor 0 a 2 de linhas e colunas");
		imprimir(matriz);
		
		while (continua == true) {
			jogador1(leitor, matriz);
			imprimir(matriz);
			
			if (vencedorjogador1(leitor, matriz)) {
					break;
			}
			jogador2(leitor, matriz);
			imprimir(matriz);
			
			if (vencedorjogador2(leitor, matriz)) {
					break;
			} 
		} 
				
			}
		
	

	public static void imprimir(int[][] tabuleiro) {
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("|" + tabuleiro[l][c] + "|");

			}
			System.out.println();
		}
	}

	public static void jogador1(Scanner leitor, int[][] matriz) {
		System.out.println("Vez do Jogador1!");
		System.out.print("Escolha a linha que deseja jogar: ");
		int linha = leitor.nextInt();
		System.out.print("Escolha a coluna que deseja jogar: ");
		int coluna = leitor.nextInt();
	
		matriz[linha][coluna] = 1;
		
		while(matriz[linha][coluna] != 1) {
			System.out.println("Lugar Ocupado!");
			System.out.print("Escolha a Linha que deseja jogar: ");
			linha = leitor.nextInt();
			System.out.println("Escolha a Coluna que deseja jogar: ");
			coluna = leitor.nextInt();
		}
		}
	

	public static void jogador2(Scanner leitor, int[][] matriz) {
		System.out.println("Vez do Jogador2!");
		System.out.print("Escolha a linha que deseja jogar: ");
		int linha = leitor.nextInt();
		System.out.print("Escolha a coluna que deseja jogar: ");
		int coluna = leitor.nextInt();
		
		matriz[linha][coluna] = 2;
		
		while(matriz[linha][coluna] != 2) {
			System.out.println("Lugar Ocupado!");
			System.out.print("Escolha a Linha que deseja jogar: ");
			linha = leitor.nextInt();
			System.out.println("Escolha a Coluna que deseja jogar: ");
			coluna = leitor.nextInt();
		}
	}
	
	public static boolean vencedorjogador1(Scanner leitor, int[][] matriz) {
		if (matriz[0][0] == 1 && matriz[0][0] == matriz[1][0] && matriz[1][0] == 1 && matriz[0][0] == matriz[2][0] && matriz[2][0] == 1) {
			
			System.out.println("O vencedor foi o Jogador 1");
			System.out.println("O jogador 2 perdeu!");
			return true;
		}
		if (matriz[0][0] == 1 && matriz[0][0] == matriz[0][1] && matriz[0][1] == 1 && matriz[0][0] == matriz[0][2] && matriz[0][2] == 1) {
			System.out.println("O vencedor foi o Jogador 1");
			System.out.println("O jogador 2 perdeu!");
			return true;
		}
		if (matriz[0][0] == 1 && matriz[0][0] == matriz[1][1] && matriz[1][1] == 1 && matriz[0][0] == matriz[2][2] && matriz[2][2] == 1) {
			System.out.println("O vencedor foi o Jogador 1");
			System.out.println("O jogador 2 perdeu!");
			return true;
		}
		if (matriz[0][0] == 1 && matriz[1][0] == matriz[1][1] && matriz[1][1] == 1 && matriz[1][0] == matriz[1][2] && matriz[1][2] == 1) {
			System.out.println("O vencedor foi o Jogador 1");
			System.out.println("O jogador 2 perdeu!");
			return true;
		}
		if (matriz[0][0] == 1 && matriz[2][0] == matriz[1][1] && matriz[1][1] == 1 && matriz[2][0] == matriz[0][2] && matriz[0][2] == 1) {
			System.out.println("O vencedor foi o Jogador 1");
			System.out.println("O jogador 2 perdeu!");
			return true;
		}
		if (matriz[0][0] == 1 && matriz[2][0] == matriz[2][1] && matriz[2][1] == 1 && matriz[2][0] == matriz[2][2] && matriz[2][2] == 1) {
			System.out.println("O vencedor foi o Jogador 1");
			System.out.println("O jogador 2 perdeu!");
			return true;
		}
		if (matriz[0][0] == 1 && matriz[0][1] == matriz[1][1] && matriz[1][1] == 1 && matriz[0][1] == matriz[2][1] && matriz[2][1] == 1) {
			System.out.println("O vencedor foi o Jogador 1");
			System.out.println("O jogador 2 perdeu!");
			return true;
		}
		if (matriz[0][0] == 1 && matriz[0][1] == matriz[1][1] && matriz[1][1] == 1 && matriz[0][0] == matriz[2][2] && matriz[2][2] == 1) {
			System.out.println("O vencedor foi o Jogador 1");
			System.out.println("O jogador 2 perdeu!");
			return true;
		}
		return false;
	}

	public static boolean vencedorjogador2(Scanner leitor, int[][] matriz) {
		if (matriz[0][0] == 2 && matriz[0][0] == matriz[1][0] && matriz[1][0] == 2 && matriz[0][0] == matriz[2][0] && matriz[2][0] == 2) {
			System.out.println("O vencedor foi o Jogador 2");
			System.out.println("O jogador 1 perdeu!");
			return true;
		}
		if (matriz[0][0] == 2 && matriz[0][0] == matriz[0][1] && matriz[0][1] == 2 && matriz[0][0] == matriz[0][2] && matriz[0][2] == 2) {
			System.out.println("O vencedor foi o Jogador 2");
			System.out.println("O jogador 1 perdeu!");
			return true;
		}
		if (matriz[0][0] == 2 && matriz[0][0] == matriz[1][1] && matriz[1][1] == 2 && matriz[0][0] == matriz[2][2] && matriz[2][2] == 2) {
			System.out.println("O vencedor foi o Jogador 2");
			System.out.println("O jogador 1 perdeu!");
			return true;
		}
		if (matriz[0][0] == 2 && matriz[1][0] == matriz[1][1] && matriz[1][1] == 2 && matriz[1][0] == matriz[1][2] && matriz[1][2] == 2) {
			System.out.println("O vencedor foi o Jogador 2");
			System.out.println("O jogador 1 perdeu!");
			return true;
		}
		if (matriz[0][0] == 2 && matriz[2][0] == matriz[1][1] && matriz[1][1] == 2 && matriz[2][0] == matriz[0][2] && matriz[0][2] == 2) {
			System.out.println("O vencedor foi o Jogador 2");
			System.out.println("O jogador 1 perdeu!");
			return true;
		}
		if (matriz[0][0] == 2 && matriz[2][0] == matriz[2][1] && matriz[2][1] == 2 && matriz[2][0] == matriz[2][2] && matriz[2][2] == 2) {
			System.out.println("O vencedor foi o Jogador 2");
			System.out.println("O jogador 1 perdeu!");
			return true;
		}
		if (matriz[0][0] == 2 && matriz[0][1] == matriz[1][1] && matriz[1][1] == 2 && matriz[0][1] == matriz[2][1] && matriz[2][1] == 2) {
			System.out.println("O vencedor foi o Jogador 2");
			System.out.println("O jogador 1 perdeu!");
			return true;
		}
		if (matriz[0][0] == 2 && matriz[0][1] == matriz[1][1] && matriz[1][1] == 2 && matriz[0][0] == matriz[2][2] && matriz[2][2] == 2) {
			System.out.println("O vencedor foi o Jogador 2");
			System.out.println("O jogador 1 perdeu!");
			return true;
		}
		return false;
	}
	
	}
		

	 
	
	
	
	
