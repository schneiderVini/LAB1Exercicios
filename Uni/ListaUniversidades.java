
public class ListaUniversidades
{
    private Universidade[] universidades;
	
	
	
	public ListaUniversidades(int x) {
		Universidade[] a =  new Universidade[x];
		this.universidades = a;
	}
	
	public int tamanho() {
		int qntocupada = 0;
		for(int i = 0; i < universidades.length; i ++) {
			if(universidades[i] != null) {
				qntocupada++;
			}
		}
		return qntocupada;
	}
	public int disponiveis() {
		int qntdisponivel = 0;
		for(int i = 0; i < universidades.length; i ++) {
			if(universidades[i] == null) {
				qntdisponivel++;
			}
		}
		return qntdisponivel;
	}
		public boolean cheio() {
		int x = 0;
		for (int i=0; i < universidades.length; i++) {
			if(universidades[i] != null) {
				x++;
			}	
		}
		if(x == universidades.length) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean vazio() {
		int x = 0;
		for (int i=0; i < universidades.length; i++) {
			if(universidades[i] == null) {
				x++;
			}	
		}
		if(x == universidades.length) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean insereUniversidade(Universidade a) {
		boolean result =  false;
		for(int i=0;i<universidades.length; i++) {
			if(universidades[i] == null) {
				universidades[i] = a;
				result = true;
				break;
			}
			else if(a == null || universidades[i] != null ) {
				result = false;
			}
		}
		
		return result;
	}
	public Universidade obterUniversidadePeloNome(String nome) {
		Universidade[] a = new Universidade[universidades.length];
		for(int i =0; i < universidades.length; i++) {
			if(universidades[i].getNome() == nome) {
				a[i] = universidades[i];
				return a[i];
			}
			
		}
		return null;
		
	}
	
	
	
	
    
}
