
public class Teste
{
    public static void main(String[] args) {
		Teclado t = new Teclado();
		
		int x = t.leInt();
		
		int[] a = new int[x];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = t.leInt();
		}
		
		int v = t.leInt();
		
		
		
		
		System.out.println(PesquisaArray.contem(a, v));
		System.out.println(PesquisaArray.ocorrencias(a, v));
		System.out.println(PesquisaArray.indicePrimeiraOcorrencia(a, v));
		
		
	}
    
}
