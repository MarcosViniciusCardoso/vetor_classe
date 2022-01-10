package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Marcos");
		list.add("Vinicius");
		list.add("Joao");
		list.add("Joaquim");
		list.add("Jaqueline");
		list.add("Jileno");
		list.add(2, "Matheus");

		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------");
		// Operador Lambida.
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);

		}
		System.out.println("------------------");
		System.out.println("Indice de Jaqueline:" + list.indexOf("Jaqueline"));
		System.out.println("------------------");

		// Fazer um filtro Pra buscar pessoas com a letra que quiser.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("------------------");
		// Como fazer um filtro que eu encontre o primeiro elemento que tem a letra (x).

		String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);

	}

}
