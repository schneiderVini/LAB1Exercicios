
public class Aplicacao
{
    public static void main(String[] args) {
		Teclado t = new Teclado();
		int r = 0;
		int almeida = 0;
		int nogueira = 0;
		int random = 0;
		
		while(r != 111) {
			 r = t.leInt();
			if(r == 75 && r != 111) {
				almeida++;
			}
			else if(r==85 && r != 111) {
				nogueira++;
			}
			else if (r != 75 && r != 85 && r != 111) {
				random++;
			}
				
			}
		System.out.println("Votos Almeida: " + almeida);
		System.out.println("Votos Nogueira: " + nogueira);
		System.out.println("Votos nulos " + random);
		
		}
    
}
