package Atividade_Listas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();

		System.out.println("Quantos Funcionários deseja cadastrar: ");
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			System.out.print("Digite o (ID): ");
			int id = sc.nextInt();

			while (verificar(list, id)) {
				System.out.println("ID existente !!! ");
				System.out.print("Digite novamente: ");
				id = sc.nextInt();
			}

			sc.nextLine();
			System.out.print("Digite nome completo: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Digite o Salário: ");
			double salario = sc.nextDouble();
			list.add(new Funcionario(id, nome, salario));
		}

		System.out.println("----------------------");

		System.out.print("Digite o id do funcionario: ");
		int id = sc.nextInt();
		Funcionario func = list.stream().filter(q -> q.getId() == id).findFirst().orElse(null);
		if (func == null) {
			System.out.println("Id não existe.");

		} else {
			System.out.print("Digite porcentagem de aumento:");
			Double aumento = sc.nextDouble();
			func.AtualizaSalario(aumento);
		}
		System.out.println("---------------------");
		System.out.println();
		for (Funcionario obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

	public static boolean verificar(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}
}
