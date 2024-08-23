package Entidades;

public class Conta_c extends Conta{

	private double limite;

	public Conta_c(String nome, int numero, double saldo, double limite) {
		super(nome, numero, saldo);
		this.limite = limite;
	}
	@Override
	public String toString() {
		return "Conta_c" + mostrar() + "\nLimite = " + limite + " \n";
	}
	
	
}
