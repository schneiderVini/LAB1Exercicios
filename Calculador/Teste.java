public class Teste{
     public static void main(String[] args){
       Teclado sc = new Teclado();
       
       double n1 = sc.leDouble();
       double n2 = sc.leDouble();
       double n3 = sc.leDouble();
       
       Calculador c1 = new Calculador(n1, n2, n3);
       
       
       System.out.println(c1.calculaSoma());
       
       System.out.println(c1.calculaMedia());
       
       
       
       
       
       
         
         
     }
 
}