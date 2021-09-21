

public class ArrayPontos{
    private Ponto[] pontos;
    private int tamanho;
    
    public ArrayPontos(int x) {
        Ponto p[] = new Ponto[x]; 
        this.pontos = p;
    }
    
    public int getTamanho() {
        return tamanho;
        
     }
     public boolean inserirPonto(Ponto p) {
         boolean a = false;
	for(int i = 0; i < pontos.length; i++) {
		if(pontos[i] == null) {
			pontos[i] = p;
			tamanho+= 1;
			a = true;
			break;
		}
		else if (p == null) {
			a = false;
		}
		
                 }
	return a;
}   
	
     
        
    
}
