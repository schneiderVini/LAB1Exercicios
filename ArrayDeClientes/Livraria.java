
public class Livraria
{
    private Livro[] livros;
	private int quantidadeLivros;
	
	public Livraria(int quant) {
		Livro[] l = new Livro[quant];
		this.livros = l;
	}
	public int getQuantidadeLivros() {
		return quantidadeLivros;
	}
	
	public boolean adicionaLivro(Livro a) {
		boolean r = true;
		for(int i = 0; i < livros.length; i++ ) {
			if(livros[i] == null) {
				livros[i] = a;
				r = true;
				quantidadeLivros++;
				break;
			}
			else if(a == null || livros[i] != null) {
				r = false;
			}
		}
		return r;
		
	}
	public Livro buscaLivroPeloId(int id) {
		for(int i = 0; i < livros.length;i++) {
			if(livros[i].getId() == id) {
				return livros[i];
			}
		}
		return null;
}
		
	
    
}
