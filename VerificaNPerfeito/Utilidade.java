
public class Utilidade
{
    
    	public boolean verificaSeNumeroPerfeito(int x) {
		boolean a = true;
		int aux=0;
		
			for (int i=1 ;i<x;i++)	{
				if (x % i==0)	{
					aux=i+aux;
				}
			}
			if (aux==x){
				a = true;
			}	
			else if(aux != x) {	
			a = false;
			}
			
			return a;
		
	}
}	

    

