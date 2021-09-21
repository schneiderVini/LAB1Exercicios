
public class ContaCorrente extends Conta
{
    private double limite;
    
    public ContaCorrente(double saldo,double limite) {
        super(saldo);
        this.limite = limite;
    }
    public ContaCorrente() {
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double saca(double valor){
		if(valor < super.getSaldo() + limite) {
			super.setSaldo(super.getSaldo -= valor);
		}
		return saldo;

	}
    
    
    
}
