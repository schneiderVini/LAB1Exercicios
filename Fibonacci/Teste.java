
public class Teste{
    public static void main(String[] args) {
        Teclado t = new Teclado();
        int x = t.leInt();
        
        Fibonacci f = new Fibonacci();
        int[] meuArray = f.obterSequencia(x);
		
	for(int i = 0; i < meuArray.length; i++) {
		System.out.print(meuArray[i]+",");
	}
	
        
        //System.out.println(f.obterSequencia(x));
        
        
        
        
        
        
        
    }
    
}
