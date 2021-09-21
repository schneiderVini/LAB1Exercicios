
public class Fibonacci{
   public int[] obterSequencia(int x) {
		int[] a;
		a = new int[x];
		if(x > 1) {
			a[0] = 0;
			a[1] = 1;
			for (int i = 2; i < a.length; i++) {
				a[i] = a[i - 1] + a[i - 2];
			}
			
		}	
		return a;
		
	}
    
}
