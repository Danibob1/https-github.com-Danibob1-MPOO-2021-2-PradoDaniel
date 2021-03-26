
package practica3_mpoo;

import java.text.SimpleDateFormat;
import java.util.ArrayList; //Import API
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;

/**
 *
 * @author daniel
 */
public class Practica3_MPOO {

    public static void main(String[] args) {
        System.out.println("arreglos");//Tipos de nombrabiento de arreglos
        int []nums;
        int[] nums1;
        int [] nums2;
        int nums3[];
        int[] num4 = {1,2,3,4,5};
        System.out.println("\n");//Salto de linea
        System.out.println("FOR"); //fore+tab
             //Empieza en 0 a 4 el fore
        for (int i = 0; i < num4.length; i+=2) { //Ventaja podemos cambiar el paso 
            int j = num4[i];
            System.out.println(j);
        }
        System.out.println("\n");//Salto de linea
        System.out.println("FOR-Each"); //fore+tab
        for (int i : num4) {            //Desventaja no puedo hacer incrementos o decrementos
            System.out.println(i);
        }
        System.out.println("\n");//Salto de linea
        System.out.println("Concatenar");
        String s = new String("Hola mundo"); //St+tab
        String s1 = "Hola mundo 2";
        System.out.println(s);
        System.out.println(s1); //mbos hacen la misma impresion pero se recomienda la segunda opcion
        String nombre= "Daniel";
        String apellido= "Prado";
        String nombreCompleto= nombre+" "+apellido;   //Notación Camello nombreCompleto
        System.out.println(nombreCompleto);
        System.out.println("\n");//Salto de linea
        System.out.println("Operador Punto");
        System.out.println("Arreglo con elmentos "+num4.length);//El punto sirve para ver mas opciones del arreglo
        //length atributo de numeros
        System.out.println("Elementos de datos: "+nombre.length());
        //length tiene datos de manera de cadena
        System.out.println(nombre.toUpperCase());
        //toUpperCase convierte la cadena en  Mayusculas
        System.out.println("\n");//Salto de linea
        System.out.println("Wreapper y autoboxing");
        Integer k= new Integer(50);
        Integer l=22;
        int r=k; //Diferencia en los tipos de conversion el wrapper sirve envolver y hacer operaciones pero tarda en compilidar
        String s3=k.toString();
        System.out.println(s3);//Manera correcta
        String s4 = r+""; //Manera chacka
        System.out.println(s4);
        System.out.println("\n");//Salto de linea
        System.out.println("Colecciones");
        System.out.println("arrayList");//Es una lista ordenada respetando el orden, puede meterse duplicados
        ArrayList<Integer> miArrayList= new ArrayList<Integer>(); //importar la clase
        miArrayList.add(66); //Para añadir objetos el arreglo agregar add
        miArrayList.add(9);
        System.out.println(miArrayList.size());// size es el tamaño del arreglo
        System.out.println(miArrayList.get(1));// get muestre la posicion
        miArrayList.add(0,20);//Agrega el elemento 20 en la posicion 0
        System.out.println("\n");//Salto de linea
        for (Integer e : miArrayList) {
            System.out.println(e);//Imprime el arreglo
        }
        System.out.println("\n");//Salto de linea
        miArrayList.add(2,77);//Agrega el elemento 20 en la posicion 2
        for (Integer e : miArrayList) {
            System.out.println(e);
        }
        System.out.println("\n");//Salto de linea
        System.out.println("HashTable");//Mapa guarda una llave y un valor 
        Hashtable<String,Integer> miTabla= new Hashtable<String,Integer>(); //Nombredeldato_nombredela variable igualarlo con new y nombredeldato();
        miTabla.put("uno", 1);// Pone el string y el dato
        miTabla.put("Daniel", 555555555);//.put indica que agrega elementos
        miTabla.put("Jen",33333333);
        System.out.println("Elementos de tabla: "+miTabla.size() );
        for (Integer valor : miTabla.values()) {//.values extrae todos los datos
            System.out.println(valor);
        }
        for (String llave : miTabla.keySet()) {//Extrae todas las cadenas
            System.out.println(llave); //set no duplica y lo pone en desorden
        }
        System.out.println("\n");//Salto de linea
        System.out.println("Enumeracion");
        String llave; //En ambos se declaran el dato y nombre de la variable
        Integer valor;
        Enumeration <String> llaves = miTabla.keys(); //importat la clase y guarda cadena
        while (llaves.hasMoreElements()) {//Pregunta si tienen mas elementos
            llave= llaves.nextElement();// Igualamos el singular al plural de llave temporal y lo paso a cada elmento
            valor=miTabla.get(llave); //Igualamos al valor integer con el dato de la tabla y adentro se pone la llava temporal
            System.out.println("Llave: "+llave+"Valor: "+valor);
        }//Recordar que el set no mantiene un orden especifico como el arreglo
        System.out.println("\n");//Salto de linea
        System.out.println("Utilerias");
        System.out.println("Math");//Se declara la calseMath del API
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80,100));
        System.out.println("Date");
        Date hoy= new Date();//Se declara la clase Fecha del API
        System.out.println(hoy);
        System.out.println("Calendario");//Se declara la clase Calendario del API
        Calendar calendarioHoy= Calendar.getInstance();
        System.out.println(calendarioHoy);
        System.out.println("Calendario Chido");//Se declara la clase Fecha del API
        SimpleDateFormat formatoFecha= new SimpleDateFormat("dd-MM-yyyy");
        //System.out.println(formatoFecha); imprime refencia sin fecha
        System.out.println(formatoFecha.format(hoy));//Imprime la fecha de la variable hoy
        
        String fechaActual= calendarioHoy.get(Calendar.DAY_OF_MONTH)+ " de ";
        fechaActual+= (calendarioHoy.get(Calendar.MONTH)+1)+ " de "; //Se desfasa con n-1
        fechaActual+= calendarioHoy.get(Calendar.YEAR);
        System.out.println(fechaActual);
    }
}