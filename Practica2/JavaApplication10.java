
package javaapplication10;



public class JavaApplication10 {

    public static void main(String[] args) {
       
        // Hola mundo
        System.out.println("Hola mundo\n");
        //Declaración de variables y uso de metodos
        int a = 54;
        int b= 14;
        System.out.println("A= "+ a);
        System.out.println("B= "+b);
        int c= 14, d= 99;
        System.out.println("C = "+ c +" D= "+d);
        //IF
        if(a>b){
            System.out.println("A > B");
        }else{
            System.out.println("A < B");
        }
        //IF2 
         if(a>b)
            System.out.println("A > B");
        else
            System.out.println("A < B");
         //IF3
        if( mayorQue(a,b)){
            System.out.println("Mayor que regresa true");
        }else{
            System.out.println("Mayor que regresa false");
        }
        //IF4
        a=10; b=5;
        if(a>b)
            System.out.println("a>b");
        else if(a>=b)
            System.out.println("a>=b");
        else
            System.out.println("a<b");
        //Switch
        KeyboardInput teclado = new KeyboardInput();
        int dia=teclado.readInteger();
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("No es numero entre 1 y 7");
                break;
        }
      
    //FOR

    	int var=10;
    	int[] arr2= new int[var];
   	 for(int i=0;i< var;i++)
        	arr2[i]=i;
    	for(int i=0; i<10;i++){
       		System.out.println(arr2[i]);
        	}

    //While
    int i =0;
    
    while(i<5){
            System.out.println("H"+i);
            i++;
     }
    
    //Do-While
    i=0;
    do{
        System.out.println("Entro en el do while ");
        System.out.println(i);
        i++;
    }while(i<5);
    
    
    //Continue
    System.out.println("Dame un numero");
    int numero;
    for(int j =0; j<3; j++){
        numero= teclado.readInteger();
        if(numero == 0){
            System.out.println("Division entre 0");
            continue;
            //break rompe el buble automatico
        }
        System.out.println("100/ "+numero+ " = "+(100.0/numero));
    
    }
    
  
    }
    
    
    public static boolean mayorQue(int x, int y){
        return(x>y);
    }
}
