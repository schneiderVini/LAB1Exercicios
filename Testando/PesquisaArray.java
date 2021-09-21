
public class PesquisaArray
{
    public static boolean contem(int[] a, int x) {
		boolean r = false;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				r = true;
				break;
			}
			else {
				r = false;
			}
		}
		return r;
	}
	public static int ocorrencias(int[] a, int x) {
			int total = 0; 
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				total++;
			}
		}
		return total;
		
	}
	public static int indicePrimeiraOcorrencia(int[] a, int x) {
		int valor = 0;
    	
    	for(int i = 0; i < a.length; i++) {
    		if(a[i] == x) {
    			valor = i;
    			break;
    			
    		}
    		else {
    			valor = -1;
    
    		}
    	}
    	return valor;
	}
    
}
