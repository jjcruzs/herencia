package herencia;

public class Herencia {

    public static void main(String[] args) {
        
        Abuelo abuelo = new Abuelo();
        Padre padre = new Padre();
        Hija hija = new Hija();
        
        abuelo.metodoAbuelo();
        System.out.println("");
        
        padre.metodoPadre();
        System.out.println("");
        
        hija.metodoHija();
        System.out.println("");
        
        hija.metodoAbuelo();
        
    }

}
