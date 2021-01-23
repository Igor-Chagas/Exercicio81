package program;

import java.util.Scanner;

import entites.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		ContaBancaria cb = new ContaBancaria();
		
		System.out.print("Enter account number: ");
		int numConta = sc.nextInt();
		cb.setNumConta(numConta);
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeTit = sc.nextLine();
		cb.setNomeTit(nomeTit);
						
		System.out.print("Is there an initial deposit (y/n)? ");
		char x = sc.next().charAt(0);
		if (x == 'y') {
		System.out.print("Enter initial deposit value: ");
		double depIni = sc.nextDouble();
		cb.setDepIni(depIni);
		}
		else {
			cb.setDepIni(0);
		}
		System.out.println();
		System.out.println();
		System.out.println("Acccount data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n",cb.getNumConta(), cb.getNomeTit(),cb.balance());
		
		System.out.println();
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depVal = sc.nextDouble();
		cb.deposit(depVal);
		System.out.println("Updated account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n",cb.getNumConta(), cb.getNomeTit(),cb.deposit(depVal));
		
		System.out.println();
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saqVal = sc.nextDouble();
		cb.withdraw(saqVal);
		System.out.println("Updated account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n",cb.getNumConta(), cb.getNomeTit(),cb.withdraw(saqVal));
		
		
		sc.close();
	}

}
