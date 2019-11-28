
package ejerciciosbasicosjava;

/**
 *
 * @author Pablo Martin
 */
public class EjerciciosBasicosJava {

    public boolean fiestaAardillas (int numeroBellotas, boolean findeSemana){
    if (numeroBellotas >= 40 && numeroBellotas <= 60){
    return true;
    }
    if(findeSemana){
    return true;
    }
     return false;
    }
   
    public boolean multa(int velocidad, boolean multaca){
        int sinMulta = 0;
        int multaPequeña = 1;
        int multaGrande = 2;
        if(multaca){
        return true;}
    if(sinMulta<=60){
    return true;
    }
    return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
       System.out.println(ejercicios.fiestaAardillas(30, false));
              System.out.println(ejercicios.fiestaAardillas(50, false));
       System.out.print(ejercicios.fiestaAardillas(70, true));
       System.out.print(ejercicios.multa(60,false));

    }
    
}
