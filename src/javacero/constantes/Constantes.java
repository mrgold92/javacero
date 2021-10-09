package javacero.constantes;

/**
 *
 * A diferencia de las variables, las constantes no pueden cambiar su valor,
 * esto se hace para proteger algunas variables para que a lo largo de la
 * ejecución del programa, su valor no pueda cambiar.
 *
 * Por ejemplo si guardamos el IVA. Por convención el nombre de la constante se
 * escribe en MAYÚSCULA.
 *
 * @author David Salazar
 */
public class Constantes {

    public static void main(String[] args) {
        final int IVA = 21;
        System.out.println(IVA);

        IVA = 30;  // Error: cannot asign a value to final variable IVA
        System.out.println(IVA);
    }

}
