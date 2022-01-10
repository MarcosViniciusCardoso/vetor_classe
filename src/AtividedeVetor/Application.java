package AtividedeVetor;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos quartos serão alugados? ");
		int x = sc.nextInt();
		Hotel vect[] = new Hotel[x];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do hospede: ");
			String nome = sc.nextLine();

			System.out.print("Digite o E-mail do hospede: ");
			String email = sc.nextLine();
			System.out.print("Digite o quarto: ");
			int quarto = sc.nextInt();

			vect[quarto] = new Hotel(nome, email);
		}
		System.out.println();

		System.out.println("Quartos");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

	}

}
