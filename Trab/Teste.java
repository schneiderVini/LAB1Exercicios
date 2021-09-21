


public class Teste {	
	public static void main(String[] args) {
		Teclado t = new Teclado();
		int x = t.leInt();
		
		String[] nomes = new String[x];
			
		for(int i = 0; i < x; i++) {
			nomes[i] = t.leString();
		}
		
		PesquisaArrayString p = new PesquisaArrayString(nomes);
		
		String nome = t.leString();
	
		
		System.out.println(p.contem(nome));
		System.out.println(p.ocorrencias(nome));
		System.out.println(p.indicePrimeiraOcorrencia(nome));
		System.out.println(p.indiceUltimaOcorrencia(nome));
		
		
		
		
		
			
	}

}