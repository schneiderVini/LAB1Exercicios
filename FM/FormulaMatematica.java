
public class FormulaMatematica{
    
    public double calculaAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    public double calculaAreaQuadrado(double base) {
        return Math.pow(base, 2);
    }
    public double calculaAreaLosango(double diagonalMenor,double diagonalMaior) {
        return diagonalMenor * diagonalMaior / 2;
    }

    public double calculaAreaTrapezio(double altura, double baseMenor, double baseMaior) {
        return altura * (baseMenor + baseMaior) / 2;
    }
    public double calculaVolumeEsfera(double r) {
        return 1.33333333333 * Math.PI * Math.pow(r, 3);
    }
    
    public double calculaVolumePiramide(double base, double altura) {
        return 0.33333333333 * base * altura;
    }
    
    public double calculaVolumeCilindro(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
    public double calculaVolumeCone(double raio, double altura) {
        return 0.33333333333 * Math.PI * Math.pow(raio, 2) * altura;
    }
    public double calculaFatorX(double a, double b, double c) {
        return a + (4 * b + a) / (2 * c);
    }
    public double calculaCoeficienteQ(double x, double y, double z) {
        return Math.pow(x, 3) * ( y + 2 * z);
    }
    public double calculaFatorW(double a , double b) {
        return (Math.sqrt(2 * a) +  Math.pow(b, 5)) / (a - 4);
    }
    
    
    
    
    
}
