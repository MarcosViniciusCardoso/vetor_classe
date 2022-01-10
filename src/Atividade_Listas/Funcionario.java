package Atividade_Listas;

import java.util.List;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;

	public Funcionario() {
	};

	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void AtualizaSalario(Double aumento) {

		salario += ((salario * aumento) / 100);

	}

	public String toString() {
		return "ID:" + id + ", Nome:" + nome + ", Sal�rio: " + String.format("%.2f", salario);
	}

}
