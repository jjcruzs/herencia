package herencia;


public class Hija extends Padre {
    
    String varHija = "Hija";
    
    public void metodoHija(){
        metodoPadre();
        System.out.println(varHija);
    }
    
}
