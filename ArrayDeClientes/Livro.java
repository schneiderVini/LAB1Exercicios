
public class Livro
{
   private int id;
   private String titulo;
   private int ano;
   private String nomeAutor;
   public double preco;
   
   public Livro(int id, String titulo, int ano, String nomeAutor, double preco) {
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.nomeAutor = nomeAutor;
		this.preco = preco;
 }
 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	   
   
    
}
