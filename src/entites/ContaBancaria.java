package entites;

public class ContaBancaria {

	private int numConta;
	public String nomeTit;
	private double depIni;
	private double y;
	
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public void setNomeTit(String nomeTit) {
		this.nomeTit = nomeTit;
	}
	
	public void setDepIni(double depIni) {
		this.depIni = depIni;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public String getNomeTit() {
		return nomeTit;
	}
	
	public double balance() {
		return depIni += 0;
	}
	
	public double deposit(double depVal) {
		y = depIni + depVal;
		return y;
	}
	
	public double withdraw (double saqVal) {
		return y - saqVal - 5.00;
	}
	
	
	
}
