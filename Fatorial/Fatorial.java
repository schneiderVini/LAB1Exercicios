
public class Fatorial
{
  public long calcular(int x) {
        
        long f = x;
        
       if(x == 0 || x == 1){
	 f = 1;
          
	}
	else if(x > 1) {
	while (x > 1){
	f = f *(x-1);
	x--;
          }
	}
	else if(x < 0) {
	f = -1;
	}
	return f;
    
    }   
    
    
    
}
