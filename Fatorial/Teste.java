
public class Teste
{
    public static void main(String[] args) {
    Teclado t = new Teclado();
    int a = t.leInt();
    
    Fatorial f = new Fatorial();
    
    long total = f.calcular(a);
    
  System.out.println(total);
}
   
    
}
