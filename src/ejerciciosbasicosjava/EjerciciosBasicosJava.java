
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
   
    public int multa(int velocidad, boolean birthday){
        if(birthday){//si es mi cumple el policeman me quita 5 de velocidad
        velocidad+=5;
        }
        if(velocidad <=60){
        return 0;
        }
         if(velocidad >60 && velocidad <=80){
        return 1;
        }
         
      return 2;
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
 System.out.print(ejercicios.multa(65,false));
  System.out.print(ejercicios.multa(65,true));
    }
    
}
