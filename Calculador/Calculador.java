    public class Calculador{
    
        private double numero1;
        private double numero2;
        private double numero3;

    
     public Calculador(double numero1, double numero2, double numero3) {
    this.numero1 = numero1;
    this.numero2 = numero2;
    this.numero3 = numero3;
}
    
    public double calculaSoma() {
    return numero1 + numero2 + numero3;
}

    public double calculaMedia() {
    return (numero1 + numero2 + numero3) / 3;
}
    
}