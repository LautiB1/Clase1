
package practicasadicionales;

//CLASE PRINCIPAL

import java.util.Scanner;

public class PracticasAdicionales {   //EJERCICIO 2

 //MAIN PRINCIPAL
    public static void main(String[] args) {
    
    // TipoDato nombreVariable = valor;
     
     promediar();  
  
     } //FIN DEL MAIN
    
    
    
    
    //METODO static (si no hay retorno void/en caso de que si va el tipo de datos)
    public static double promediar(){
        
       //Scanner nombre= new Scanner(sustem.in);
    Scanner capturaPantalla=new Scanner(System.in);
    System.out.println("Escriba el nombre del alumno");
    
    //Recuperar de la pantalla con el nextLine();
    String alumno1=capturaPantalla.nextLine();
    
    
    //String alumno1="Matias";    //DEFINIMOS NOMBRE DEL ALUMNO(esta comentado porque se puede ingresar cualqueir nombre)
    //PARSEAR
    System.out.println("Escriba la primer nota");      //DEFINIMOS LAS 5 VARIABLES (NOTAS) 
    String nota1=capturaPantalla.nextLine();
    double n1 = Double.parseDouble(nota1);
    
    System.out.println("Escriba la segunda nota");
    String nota2=capturaPantalla.nextLine();
    double n2 = Double.parseDouble(nota2);
    
    System.out.println("Escriba la tercer nota");
    String nota3=capturaPantalla.nextLine();
    double n3 = Double.parseDouble(nota3);
    
    System.out.println("Escriba la cuarta nota");
    String nota4=capturaPantalla.nextLine();
    double n4 = Double.parseDouble(nota4);
    
    System.out.println("Escriba la quinta nota");
    String nota5=capturaPantalla.nextLine();
    double n5 = Double.parseDouble(nota5);
    
    double resultado= n1+n2+n3+n4+n5; //DEFINIMOS EL TOTAL       
    double promedio= resultado/5;     //SACAMOS EL PROMEDIO
    
    System.out.println("El promedio de "+ alumno1 + " es de " + promedio);
        return 0;
    }
}
