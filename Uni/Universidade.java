
public class Universidade
{
    	private String nome;
	private String estado;
	private double valorMensalidade;
	
	
	public Universidade(String nome, String estado, double valorMensalidade) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.valorMensalidade = valorMensalidade;
	}
	
	public Universidade() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	
	
	
	
    
    
}
