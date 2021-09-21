
public class Aplicacao
{
   	public static void main(String[] args) {
		Teclado t = new Teclado();
		
		int x = t.leInt();
		int y = t.leInt();
		
		
		for(int i = x; i < y; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		if(y % 2 != 0) {
			System.out.println(y);
		}
	

	}
    
    
    
}
