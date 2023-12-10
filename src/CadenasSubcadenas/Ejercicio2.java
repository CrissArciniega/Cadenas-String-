package CadenasSubcadenas;
public class Ejercicio2 {

/*De la siguiente cadena de texto obtener el número de vocales. La cadena es: "El día de ayer Margarita
    , Julia y Jorge salieron de excursión"*/
    
   /*Ejercicio realizado en clase:
    public static void main(String[] args) {
        String cadena="El dia de ayer Margarita, Julia y Jorge salieron de excursion";
        int cont=0;
        for(int i=0; i<cadena.length();i++){
            if(cadena.charAt(i)== 'a' ||
              (cadena.charAt(i)== 'e' ||
              (cadena.charAt(i)== 'i' ||
              (cadena.charAt(i)== 'o' ||
              (cadena.charAt(i)== 'u'))))){
              cont++;  
            }
        }
        System.out.println("El numero de vocales es: "+cont);
    }*/ 
    
    /*Corrección: 
    No nos contara todas las vocales el código realizado en clase, ya que solo nos hara válido el 
    conteo de vocales en minúscula. Podemos instanciar en una sola variable de tipo String todas las
    vocales tanto minúsculas como mayúsculas para que así no haya un mal conteo.
    
    Además tambien podemos simplificarlo y no concatenar tanto código, de la siguiente manera:*/
    public static void main(String[] args){
    String cadena="El dia de ayer Margarita, Julia y Jorge salieron de excursion";
    int cont=0;
    String vocales="aeiouAEIOU"; // Todas las vocales en una cadena

    for(int i=0; i<cadena.length(); i++){
        if (vocales.indexOf(cadena.charAt(i)) != -1){ 
  //!= -1: utilizamos para encontrar la subcadena o caracter, si no la encontramos nos retorna un -1.
            cont++;
        }
    }
    
    System.out.println("El numero de vocales es: " + cont);
}
}
/*GLOSARIO:
indexOf: nos ayuda a encontrar un caracter o subcadena en una cadena de texto más grande*/