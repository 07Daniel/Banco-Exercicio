package Banco;

public class Conta {

	private int numeroConta;
	private String name;
	private double valor;


	public Conta(int numeroConta, String name, double depositoInicial) {

		this.numeroConta = numeroConta;
		this.name = name;
		deposito(depositoInicial);

	}

	public Conta(int numeroConta, String name) {

		this.numeroConta = numeroConta;
		this.name = name;

	}

	public void saque(double saque) {
		valor -= saque + 5 ;
	}

	public void deposito(double deposito) {
		 valor += deposito;
	}
	
	public String toString() {
		return " Conta : "
				+ numeroConta
				+", Titular :"
				+ name
				+ ", Valor: $ "
				+ String.format("%.2f", valor);
	}


	public int getNumeroConta() {
		return numeroConta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValor() {
		return valor;
	}

}
