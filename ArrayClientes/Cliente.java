
public class Cliente
{
    	
		private int id;
		private String nome;
		private double saldoDevedor;
		private boolean ativo;
		
		
		public Cliente(int id, String nome, double saldoDevedor, boolean ativo) {
			super();
			this.id = id;
			this.nome = nome;
			this.saldoDevedor = saldoDevedor;
			this.ativo = ativo;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public double getSaldoDevedor() {
			return saldoDevedor;
		}


		public void setSaldoDevedor(double saldoDevedor) {
			this.saldoDevedor = saldoDevedor;
		}


		public boolean getAtivo() {
			return ativo;
		}


		public void setAtivo(boolean ativo) {
			this.ativo = ativo;
		}
		
		
		
    
}
