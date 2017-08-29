/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
public class Metodo_endsWith {
    
    public static void main(String[] args) {
        String cadena = "Buenas Tardes Profe";
        
        boolean b1 = cadena.endsWith("fe");
        boolean b2 = cadena.endsWith("ofes");
        System.out.println(b1);
        System.out.println(b2);
        
        
        System.out.println(cadena.toLowerCase());//cambia las letras mayusculas en minusculas
        //System.out.println(cadena.startsWith("b"));
        System.out.println(cadena.startsWith("B"));// muestra con boolean(true or false) si empieza con la letra
        
        System.out.println(cadena.equals("Buena tarde Profe"));//compara la cadena y muetra si es true or false
        
        System.out.println(cadena.toUpperCase());// cambia la cedena a mayusculas
        System.out.println(cadena.replace("a","e")); // reemplaza un letra o palabra por otra
        System.out.println(cadena.endsWith("ofe"));
        System.out.println(cadena.indexOf("Tardes"));//retorna -1 cuando no encuentra la palabra, muetra la posicion de la primera letra de la palabra, no distingue mayus o minus
        System.out.println(cadena.charAt(2));
        System.out.println(cadena.length());
    }
    
}
