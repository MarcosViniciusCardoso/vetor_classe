import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho do vetor: ");
		int x = sc.nextInt();
		double vect[] = new double[x];

		for (int i = 0; i < x; i++) {
			System.out.print("Digite o tamanho da " + i + "° Pessoa: ");
			vect[i] = sc.nextDouble();

		}
		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}

		double media = soma / x;

		System.out.printf("Média: %.2f%n", media);
		sc.close();
	}
	
}
