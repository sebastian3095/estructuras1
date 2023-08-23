/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author sebas
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante arrayE[] = new Estudiante[2];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<arrayE.length;i++){
            
            System.out.println("Ingrese el nombre del estudiante "+(i+1));
            String nombre=sc.next();
            
            System.out.println("Ingrese la edad del estudiante "+(i+1));
            int edad=sc.nextInt();
            
            System.out.println("Ingrese el numero de identificacion del estudiante "+(i+1));
            int nId=sc.nextInt();
            
            Estudiante estudiante = new Estudiante(nombre,edad,nId);
            
            String arrayM[]= estudiante.getMaterias();
            
            System.out.println("Ingrese nota de "+arrayM[0]);
            double nota1= sc.nextDouble();
            
            System.out.println("Ingrese nota de "+arrayM[1]);
            double nota2= sc.nextDouble();
            
            System.out.println("Ingrese nota de "+arrayM[2]);
            double nota3= sc.nextDouble();
            System.out.println("---------------------------------------");
            
            estudiante.setNotas(nota1, nota2, nota3);
            
            arrayE[i]=estudiante;
            
        }
        
        
        for(int i=0; i<arrayE.length; i++){
            System.out.println("---------------------------------------------");
            System.out.println(arrayE[i]);
            System.out.println("---------------------------------------------");
        }
        
        Arrays.sort(arrayE);
        
        System.out.println("ORGANIZADO POR EDAD");
        for(int i=0; i<arrayE.length; i++){
            System.out.println("---------------------------------------------");
            System.out.println(arrayE[i]);
            System.out.println("---------------------------------------------");
        }
        
        
        Estudiante[] promedio=Estudiante.estudiantePromedio(arrayE);
        
        System.out.println("ORGANIZADO POR PROMEDIO");
        for(int i=0; i<arrayE.length; i++){
            System.out.println("---------------------------------------------");
            System.out.println(promedio[i]);
            System.out.println("---------------------------------------------");
        }
          
        
        
        
    }
    
}
