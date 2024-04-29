package ContaBanco;

public class ContaBanco {
	private int numero;
	private String agencia;
	private String nome;
	private double saldo;
	
	public ContaBanco() {
		
	}
	
	public ContaBanco(int numero, String agencia, String nome, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	
}
