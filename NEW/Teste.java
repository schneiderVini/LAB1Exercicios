
public class Teste{
public static void main(String[] args) {
    Teclado sc = new Teclado();
    
    double vu = sc.leDouble();
    int qu = sc.leInt();
    
    ProdutoVenda pv = new ProdutoVenda(vu, qu);
    
    System.out.println(pv.calculaTotal());
    
    
    
}
}
