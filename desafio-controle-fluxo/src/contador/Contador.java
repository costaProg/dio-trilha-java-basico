package contador;
import exception.*;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Abaixo informe dois parâmetros inteiros.");
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = scan.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = scan.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
		scan.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois)
			throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for(int i = 0; i < contagem; i ++) {
			parametroUm ++;
			parametroDois ++;
			System.out.println("Interação "+ (i+1));
			System.out.println("Parâmetro um incrementado: " + parametroUm + "\nParâmetro dois incrementado: "+parametroDois+"\n");
		}
	}
}