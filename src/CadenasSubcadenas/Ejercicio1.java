package CadenasSubcadenas;
public class Ejercicio1 {
    
// Declarar un código que me devuelva los espacios en blanco de una cadena de texto. 
    
    /*Echo en clase: 
    String nombres="Juan Maria Pedro Luis";
        int cont=0;
        for(int i=0; i<nombres.length(); i++){
            if((nombres.charAt(i).equals(""))==true){
              cont ++;  
            } 
          }   
         System.out.println("El numero de espacios en blanco es: "+cont);
        }*/
   
/*Corrección: 
    El error se encuentra en la línea la condición if, em método charAt devuelve solo un caracter
    no una cadena de texto, por lo que no se puede utilizar 'equals', ya que este nos retorna
    siempre cadenas de texto.*/
  
    public static void main(String[] args) {
      
    String nombres = "Juan Maria Pedro Luis";
    int cont = 0;
    
    for (int i = 0; i < nombres.length(); i++) {
        if (nombres.charAt(i) == ' ') {
            cont++;
        }
    }
    
    System.out.println("El número de espacios en blanco es: " + cont);
    }
}