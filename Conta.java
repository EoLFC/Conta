package Entidades;

public class Conta {

	private String nome;
	private int numero;
	private double saldo;
	
	public Conta(String nome, int numero, double saldo) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	public void sacar(double saque) {
	saldo -= saque;
	}
	public void depositar(double deposito) {
		saldo += deposito;
	}
	
	public String mostrar() {
		return "\nNome: " + nome + "\nNúmero da conta: " + numero + "\nSaldo: " + saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
}
