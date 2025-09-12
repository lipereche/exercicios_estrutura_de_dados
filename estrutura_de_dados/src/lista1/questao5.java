package lista1;

public class questao5 implements iQuestao5 {
	private String nome;
	private double saldo;
	public questao5(float depositar, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	public String getDepositar() {
		return nome;
	}
	public void setDepositar(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public void depositar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sacar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}
	
}
