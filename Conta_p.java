package Entidades;

public class Conta_p extends Conta{

	public Conta_p(String nome, int numero, double saldo) {
		super(nome, numero, saldo);
	}

	@Override
	public String toString() {
		return "\nConta_p" + mostrar();
	}

	
}
