package Banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Conta conta ;
		
		System.out.print("Entre com o numero da conta com 4 digitos : ");
		int numeroConta = sc.nextInt();
		System.out.print("Entre com seu nome : ");
		sc.nextLine();
		String name =sc.nextLine();
		System.out.println("Deseja realizar um deposito inicial (SIM/NÃO) ?");
		char response = sc.next().charAt(0);
		if (response == 's') {
			System.out.print(" Entre com o valor Inicial :");
				double depositoInicial = sc.nextDouble();
				conta = new Conta(numeroConta,name,depositoInicial);
		}else {
			
			conta = new Conta(numeroConta,name);
		}
		System.out.println();
		System.out.println("=============== Dados da Conta ===============");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor de deposito : ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Valor atualizado a Conta :");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Valor atualizado a Conta :");
		System.out.println(conta);
		
		
		sc.close();
	}

}
