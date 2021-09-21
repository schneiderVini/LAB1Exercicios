public class Aplicacao {
	public static void main(String[] args) {
		Teclado t = new Teclado();
		
		int x = t.leInt();
		double[] a = new double[x];
		double[] b = new double[x];
		for(int i = 0; i < x; i++) {
			double r = t.leDouble();
			if(r >= 0.0) {
			a[i] = r;
			}
			else if(r < 0.0) {
				b[i] = r;
			}
		
		}
		
		for(int i = 0; i < b.length; i++) {
			//if(b[i] != 0) {
				System.out.println(b[i]);
			//}
		}
		
		for(int i = 0; i < a.length; i++) {
			//if(a[i] != 0) {
				System.out.println(a[i]);
			//}
		}
		
		
	

	}
}
	
	
	