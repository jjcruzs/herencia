package herencia;


public class Padre extends Abuelo {
    
    String varPadre = "Padre";
    
    public void metodoPadre() {
        metodoAbuelo();
        System.out.println(varPadre);
    }
    
}
