
package practica3_mpoo;



import java.util.ArrayList; 
import java.util.Hashtable;
import java.util.Enumeration;


import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.util.Locale;

/**
 *
 * @author daniel
 */
public class Practica3_MPOO {

    public static void main(String[] args) {
        
        System.out.println("Arreglos");
        int []nums;
        int[] nums1;
        int [] nums2;
        int nums3[];
        int[] num4 = {1,2,3,4,5};
        System.out.println("\n");//Salto de linea
        System.out.println("FORI"); 
        for (int i = 0; i < num4.length; i+=2) { 
            int j = num4[i];
            System.out.println(j);
        }
        System.out.println("\n");
        System.out.println("FOR-Each"); 
        for (int i : num4) {            
            System.out.println(i);
        }
        System.out.println("\n");//Salto de linea
        System.out.println("Concatenar");
        String s = new String("Hola mundo"); 
        String s1 = "Hola mundo 2";
        System.out.println(s);
        System.out.println(s1); 
        String nombre= "Daniel";
        String apellido= "Prado";
        String nombreCompleto= nombre+" "+apellido;   
        System.out.println(nombreCompleto);
        System.out.println("\n");
        System.out.println("Operador Punto");
        System.out.println("Arreglo con elmentos "+num4.length);
        System.out.println("Elementos de datos: "+nombre.length());
        System.out.println(nombre.toUpperCase());
        System.out.println("\n");//Salto de linea
        
        
        System.out.println("Wreapper y autoboxing");
        Integer k= new Integer(50);
        Integer l=22;
        int r=k; 
        String s3=k.toString();
        System.out.println(s3);
        
        
        String s4 = r+""; 
        System.out.println(s4);
        System.out.println("\n");//Salto de linea
        System.out.println("Colecciones");
        System.out.println("arrayList");
        ArrayList<Integer> miArrayList= new ArrayList<Integer>(); 
        miArrayList.add(66); 
        miArrayList.add(9);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(1));
        miArrayList.add(0,20);
        System.out.println("\n");
        for (Integer e : miArrayList) {
            System.out.println(e);
        }
        System.out.println("\n");
        miArrayList.add(2,77);
        for (Integer e : miArrayList) {
            System.out.println(e);
        }
        System.out.println("\n");//Salto de linea
        
        
        
        
        System.out.println("HashTable");
        Hashtable<String,Integer> miTabla= new Hashtable<String,Integer>(); 
        miTabla.put("uno", 1);
        miTabla.put("Daniel", 555555555);
        miTabla.put("Jen",33333333);
        System.out.println("Elementos de tabla: "+miTabla.size() );
        for (Integer valor : miTabla.values()) {
            System.out.println(valor);
        }
        for (String llave : miTabla.keySet()) {
            System.out.println(llave); 
        }
        System.out.println("\n");//Salto de linea
        
        System.out.println("Enumeracion");
        String llave; 
        Integer valor;
        Enumeration <String> llaves = miTabla.keys(); 
        while (llaves.hasMoreElements()) {
            llave= llaves.nextElement();
            valor=miTabla.get(llave); 
            System.out.println("Llave: "+llave+"Valor: "+valor);
        }
        System.out.println("\n");//Salto de linea
        
        
        System.out.println("Utilerias");
        
        System.out.println("Math");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80,100));
        
        System.out.println("Date");
        Date hoy= new Date();
        System.out.println(hoy);
        
        System.out.println("Calendario");
        Calendar calendarioHoy= Calendar.getInstance();
        System.out.println(calendarioHoy);
        
        System.out.println("Calendario Chido");
        
        SimpleDateFormat formatoFecha= new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(formatoFecha.format(hoy));
        
        String fechaActual= calendarioHoy.get(Calendar.DAY_OF_MONTH)+ " de ";
        fechaActual+= (calendarioHoy.get(Calendar.MONTH)+1)+ " de "; //Se desfasa con n-1
        fechaActual+= calendarioHoy.get(Calendar.YEAR);
        System.out.println(fechaActual);
    }
}
    
     
  
//Introduccion, previo, desarrollo (codigo de clase), ejercicio (propio), codigo fuente,conclusion, referencia
//Codigo fuente(Actividades de clase)