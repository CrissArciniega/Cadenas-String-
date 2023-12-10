package CadenasSubcadenas;
public class Ejercicio3 {
    
/*- Realizar cada vez que se encuentre un espacio en blanco se separe las cadenas en subcadenas.
  - Contar cuantas palabras forman la oración.
  - Remplazar las letras "o" por "$" y las letras "a" por "@".
  - Usar una segunda cadena donde se escribirá la misma oración pero al revés.*/
    
   public static void main(String[] args) {
    String cadena = "El dia de ayer Margarita, Julia y Jorge salieron de excursion";
    int contVocales = 0;
    int contPalabras = 0;
    String vocales = "aeiouAEIOU"; // Todas las vocales en una cadena

    /*Instanciamos un nuevo objeto que será almacenado en un nueva clase 'StringBuilder()'para manipular
    mejor la cadena de texto.*/
StringBuilder cadenaModificada = new StringBuilder();
StringBuilder cadenaReversa = new StringBuilder();

    
for (int i = 0; i < cadena.length(); i++) { // Bucle de la cadena 
    
    /*Declaramos una nueva variable 'Char' para que nos ayude a representar el caracter actual en el bucle
    el cual se va a ir actualizando en lo que dure la ejecusión del programa.*/
    char Char = cadena.charAt(i);

    // Contar vocales y realizar reemplazos
    if (vocales.indexOf(Char) != -1) {
    //!= -1: utilizamos para encontrar la subcadena o caracter, si no la encontramos nos retorna un -1.
        contVocales++;

        // Reemplazar caracteres 'o' por '$' y 'a' por '@'
        switch (Char) {
            case 'o':
                cadenaModificada.append('$'); //agregamos el caracter a remplazar
                break;
            case 'a':
                cadenaModificada.append('@'); //agregamos el caracter a remplazar
                break;
            default:
                cadenaModificada.append(Char); 
                break;
        }
    } else {
        cadenaModificada.append(Char);
    }

    // Contar palabras separadas por espacios
    if (Char == ' ') {
        contPalabras++;
    }

    // Construir cadena al revés
    cadenaReversa.insert(0, Char);
}

// Para contar la última palabra, ya que no termina con un espacio
contPalabras++;

// Imprimir resultados
System.out.println("El número de vocales es: " + contVocales);
System.out.println("El número de palabras es: " + contPalabras);
System.out.println("Cadena modificada: " + cadenaModificada.toString());
System.out.println("Cadena al revés: " + cadenaReversa.toString());

 }
    
}

/*GLOSARIO: 
Clase StringBuilder(): manipula cadena de textos que se están concatenando o modificando.

.append(): podemos agragar caracteres, cadenas y datos de tipo primitivo que se encuentren almacenados 
           en la clase StringBuilder().

.insert(): podemos insertar caracteres, cadenas, datos primitivos y objetos de una posición específica
           que se enucentre almacenada en la clase StringBuilder().*/