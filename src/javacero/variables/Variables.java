package javacero.variables;

/**
 * Las variables son un espacio en memoria donde se puede almacenar información.
 * Dependiendo del tipo que sea la variable, podremos guardar un tipo de
 * información u otro. Java es fuertemente tipado, eso significa que nos obliga
 * a poner el tipo de dato al crear una variable, hay otros lenguajes que no
 * haría falta.
 *
 * Para crear una variable, tendremos que indicar:
 *
 * tipoDato nombreVariable; 
 * (Importante terminar cada instrucción con un ; de
 * otro modo daría error.)
 *
 * Tenemos dos formas de introducir valor en una varible, es decir, tenemos dos
 * formas para decir qué guardará la variable.
 *
 * La primera: 
 * tipoDato nombreVariable; 
 * nombreVariables = dato;
 *
 * La segunda: 
 * tipoDato nombreVarible = dato;
 *
 * Al introducir valor en una variable se dice que estamos inicializando esa
 * variable.
 *
 * Veamos los ejemplos con los distintos tipos de datos.
 *
 * @author David Salazar
 */
public class Variables {

    public static void main(String[] args) {

        //Variables numéricas
        byte numerobyte = 1;
        short numeroshort = 2;
        int numeroint = 10;
        long numerolong = 40;

        // No debemos preocuparnos ahora por este código,
        // solo se utiliza para que imprima por consola los tipos
        // de datos utilizados.
        System.out.println(((Object) numerobyte).getClass());    // class java.lang.Byte
        System.out.println(((Object) numeroshort).getClass());   // class java.lang.Short
        System.out.println(((Object) numeroint).getClass());     // class java.lang.Integer
        System.out.println(((Object) numerolong).getClass());    // class java.lang.Long

        //imprimir por consola los valores
        System.out.println(numerobyte);
        System.out.println(numeroshort);
        System.out.println(numeroint);
        System.out.println(numerolong);

        System.out.println("------------------------");

        //Variables char
        char charvariable = 'c';

        System.out.println(((Object) charvariable).getClass());    // class java.lang.Character

        //imprimir por consola el valor
        System.out.println(charvariable);

        System.out.println("------------------------");

        //Variables numéricas con decimales
        double chardouble = 2234.13252;
        float floatvariable = 5123.1234234f;

        System.out.println(((Object) chardouble).getClass());       // class java.lang.Double
        System.out.println(((Object) floatvariable).getClass());    // class java.lang.Float

        //imprimir por consola el valor
        System.out.println(chardouble);
        System.out.println(floatvariable);
        
        System.out.println("------------------------");

        //Variables booleanas
        boolean booleanvariable = false;

        System.out.println(((Object) booleanvariable).getClass());    // class java.lang.Boolean
       
        //imprimir por consola el valor
        System.out.println(booleanvariable);
        
         System.out.println("------------------------");
         
        //Las variables, como su nombre indica, pueden cambiar de valor 
        //durante la ejecución del programa, veamos un ejemplo:
        
        boolean booleanCambioValor = false;
        
        System.out.println(booleanCambioValor);                         // false
        
        booleanCambioValor = true;
        
        System.out.println(booleanCambioValor);                         // true
     

    }
}
