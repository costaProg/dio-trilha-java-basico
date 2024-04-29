package Main;
import java.util.Locale;
import java.util.Scanner;
import ContaBanco.*;

public class ContaTerminal {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);
						
		System.out.println("Olá usuário, seja bem vindo ao nosso sistema de gerenciamento de conta!\n"
				+ "Por favor, informe seu nome: ");
		String nome = scan.nextLine();
				
		System.out.println("Senhor(a) "+ nome +" iremos iniciar o processo de criação de conta.\n"
				+ "Informe o número da sua agência: ");
		String agencia = scan.nextLine();
				
		System.out.println("Informe o número da sua conta: ");
		int numero = scan.nextInt();
		
		System.out.println("Informe o saldo atual de sua conta: ");
		double saldo = scan.nextDouble();
		
		ContaBanco conta = new ContaBanco(numero, agencia, nome, saldo);
		
		System.out.println("Olá " + conta.getNome() +" , obrigado por criar uma conta em nosso banco, "
				+ "sua agência é "+ conta.getAgencia() +", "
				+ "conta " + conta.getNumero() +" e seu saldo "+ conta.getSaldo() +" já está disponível para saque.");
	
		scan.close();
	}
}
