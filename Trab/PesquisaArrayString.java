
public class PesquisaArrayString{
    private String[] nomes;
    
    
    
    public PesquisaArrayString(String[] nomes) {
        this.nomes = nomes;
        
    }
    
    
    public boolean contem(String nome) {
        boolean result = false;
        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i].equals(nome)) {
                result = true;
            }
      
         }
         return result;
  }
   public int ocorrencias(String nome) {
    	int result = 0;
    	for(int i = 0; i < nomes.length; i++) {
    		if (nomes[i].equals(nome)) {
    			result++;
    		}
    	}
    	return result;
    	
    	
    }
   public int indicePrimeiraOcorrencia(String nome) {
    	int insideName = 0;
    	
    	for(int i = 0; i < nomes.length; i++) {
    		if(nomes[i].equals(nome)) {
    			insideName = i;
    			break;
    			
    		}
    		else {
    			insideName = -1;
    
    		}
    	}
    	return insideName;
    	
    	
    }
     public int indiceUltimaOcorrencia(String nome) {
    	int insideName = 0;
    	
    	for(int i = nomes.length - 1; i >= 0; i--) {
    		if(nomes[i].equals(nome)) {
    			insideName = i;
    			break;
    		}
    		else {
    			insideName = -1;
    
    		}
    	}
    	return insideName;
    	
    }
       
      public int indiceOcorrencia(String nome, int on) {
    	int insideName = -1;
    	int times = 0;
    	for(int i = 0; i < nomes.length; i++) {
    		if(nomes[i].equals(nome)) {
    			times++;
    			if(times == on) {
    				insideName = i;
    				break;
    			}
    		}	
    	}	
    	
    	return insideName;
    }
    
    
    
	
	

    
    
  
}
