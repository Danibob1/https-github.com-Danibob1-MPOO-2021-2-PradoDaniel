
package ejerciciospractica3;


import java.util.Calendar;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;



public class ejerciciosPractica3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        System.out.println("HashTable");
        
        Hashtable<Integer,String> diccionario= new Hashtable<Integer,String>();
          
        diccionario.put(1,"animal");
        diccionario.put(2,"encuentro");
        diccionario.put(3,"lagunas");
        diccionario.put(4,"entropia");
        diccionario.put(5,"bandera");
         
        Integer llave; 
        String valor;
        
        Enumeration <Integer> llaves = diccionario.keys(); 
        
        while (llaves.hasMoreElements()) {
            llave= llaves.nextElement();
            valor=diccionario.get(llave); 
            System.out.println("Llave: "+llave+" Valor: "+valor);
        }
        
        System.out.println( " \n");
        
        
        Calendar calendario= Calendar.getInstance();
        Hashtable<String,String> cumpleanos= new Hashtable<String,String>();
        calendario.set(Calendar.MONTH,1);
        calendario.set(Calendar.DAY_OF_MONTH,1);
       //n+1
        String Daniel= (calendario.get(Calendar.DAY_OF_MONTH)+15)+"-"+(calendario.get(Calendar.MONTH)+10)+"-"+calendario.get(Calendar.YEAR);
        String Jennifer=(calendario.get(Calendar.DAY_OF_MONTH)+6)+"-"+(calendario.get(Calendar.MONTH)+5)+"-"+calendario.get(Calendar.YEAR);
        String Alejandro=(calendario.get(Calendar.DAY_OF_MONTH)+10)+"-"+(calendario.get(Calendar.MONTH)+2)+"-"+calendario.get(Calendar.YEAR);
        String Dylan=(calendario.get(Calendar.DAY_OF_MONTH)+26) +"-"+(calendario.get(Calendar.MONTH)+10)+"-"+calendario.get(Calendar.YEAR);
        String Carlos=(calendario.get(Calendar.DAY_OF_MONTH)+30)+"-"+(calendario.get(Calendar.MONTH)+3)+"-"+calendario.get(Calendar.YEAR);
        
        cumpleanos.put("Daniel", Daniel);
        cumpleanos.put("Jennifer",Jennifer);
        cumpleanos.put("Alejandro",Alejandro);
        cumpleanos.put("Dylan",Dylan);
        cumpleanos.put("Carlos",Carlos);

        String valorDos;
        String date;
        Enumeration <String> llavesDos = cumpleanos.keys(); 
       
        while (llavesDos.hasMoreElements()) {
            valorDos= llavesDos.nextElement();
            date=cumpleanos.get(valorDos); 
            System.out.println("Nombre: " +valorDos+
                    " Proximos Cumpleaños (dd-MM-yyyy): "+date+".");
        }
        
         
        
    }
    
}
