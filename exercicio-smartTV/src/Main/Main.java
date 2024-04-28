package Main;
import java.util.Scanner;
import SmartTV.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SmartTV tv = new SmartTV();
		int valor = 0, op = 0;
		
		do {
			System.out.println("---------------------------------");
			System.out.println("Escolha uma opção\n[0] - Encerrar o programa\n[1] - Ligar ou desligar TV\n"
					+ "[2] - Aumentar ou diminuir volume\n[3] - Mudar de canal\n[4] - Informações da TV");
			System.out.println("---------------------------------");
			op = scan.nextInt();
			
			switch(op) {
			case 0:
				System.out.println("Até Breve!");
				break;
			case 1 :
				System.out.println("---------------------------------");
				System.out.println("Escolha uma opção\n[1] - Ligar TV\n[2] - Desligar TV \n");
				System.out.println("---------------------------------");
				valor = scan.nextInt();
				tv.ligarDesligarTV(tv, valor);
				if(tv.getLigada(tv))
					System.out.println("TV LIGADA !!!");
				else
					System.out.println("TV DESLIGADA !!!");
				break;
			case 2 :
				System.out.println("---------------------------------");
				System.out.println("Escolha uma opção\n[1] - Aumentar volume da TV\n[2] - Diminuir volume da TV \n");
				System.out.println("---------------------------------");
				valor = scan.nextInt();
				tv.aumentarDiminuirVolume(tv, valor);
				System.out.println("O volume da TV está em: " + tv.getVolume(tv));
				break;
			case 3 :
				System.out.println("---------------------------------");
				System.out.println("Deseja definir o canal desejado? \n[1] - Sim\n[2] - Não\n");
				System.out.println("---------------------------------");
				valor = scan.nextInt();
				if(valor == 1) {
					System.out.println("Digite o canal desejado");
					valor = scan.nextInt();
					tv.mudarCanal(tv, valor);
					break;	
				}
				tv.mudarCanal(tv, 1);
				break;
			case 4 :
				System.out.println("---------------------------------");
				System.out.println("Informações da TV:\nLigada: "+ tv.getLigada(tv) + 
						"\nVolume: " + tv.getVolume(tv)+"\nCanal: " + tv.getCanal(tv));
				System.out.println("---------------------------------");
				break;
			default:
				System.out.println("Opção inválida !!");
				break;
			}
			
		} while(op != 0);
		scan.close();
	}
}
