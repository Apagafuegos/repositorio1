package prueba;

public class P1 {

    public static void main(String[] args) {
        String nombre1 = "blas";
        String nombre2 = "violeta";
        
        Integer x = nombre1.compareTo(nombre2);
        switch (x) {
        case 0:
            System.out.println("igual");
        case 1:
            System.out.println("mayor");
        case -1:
            System.out.println("menor");
        default:
            break;
        }
        
    }
    
}
