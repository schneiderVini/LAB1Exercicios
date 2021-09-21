
public class ArrayUtil
{
    
    public double media(double a[]) {
        double total = 0;
        for(int i =0; i<a.length; i++) {
            total += a[i];
        }

        return total / a.length;
    }
    
    public double desvioPadrao(double[] a) {
        double total = 0;
        double media = 0;
        for(int i =0; i<a.length; i++) {
            total += a[i];
        }

        media = total / a.length;
        double soma = 0;
        for (int i = 0; i < a.length; i++) {
            soma += a[i];
        }
     
		
	for (int i = 0; i < a.length; i++) {
	    double result = a[i] - media;
	    soma = soma + result * result;
	}
	return Math.sqrt(((double) 1 /( a.length-1))* soma);
	}
        
        
        
        
        
     }
        
        
        
      
        
    
    
    
    
    
    
    

