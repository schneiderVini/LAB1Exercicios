
public class Utilidade
{
    public boolean  verificaSeNumeroPrimo(int x) {
        boolean a = true;
        int primo = 0;
        for (int i=0; i<=x; i++) {
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
        }
        if (primo == 2) {
                return true;
            }
            else{
                return false;
            }
      }
    
}
