
public class Conta
{
 	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	public Conta() {
		
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
	    this.saldo = saldo;
	   }
	public double deposita(double valor) {
		saldo += valor;
		return saldo;
	}
	public double saca(double valor) {
		saldo-= valor;
		return saldo;
	}
   
    
}
