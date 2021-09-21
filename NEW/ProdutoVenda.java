public class ProdutoVenda{
    private double valorUnitario;
    private int quantidade;
    
    
    public ProdutoVenda(double valorUnitario, int quantidade) {
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }
    
    public double calculaTotal() {
        return valorUnitario * quantidade;
    }
    
}