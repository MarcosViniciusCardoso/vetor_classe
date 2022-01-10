package ObjetoTipoClasse;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho do vetor: ");
		int x = sc.nextInt();
		Produto vect[] = new Produto[x];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite o nome do produto: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Digite o valor do produto:");
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome, preco);
		}
		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPreco();
		}
		double media = soma / vect.length;
		System.out.printf("Média: %.2f", media);
		sc.close();
	}
}
