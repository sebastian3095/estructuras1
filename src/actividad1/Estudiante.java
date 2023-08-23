/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author sebas
 */
public class Estudiante implements Comparable<Estudiante> {
    
    private String nombre;
    private int nIdentificacion, edad;
    private String[] materias=new String[3];
    private double[] notas;
    private double promedio;
    
    public static void estudiantePromedio(Estudiante[] a){
        
        Estudiante[]b = new Estudiante[a.length];
        Estudiante mayor = new Estudiante();
        mayor.setPromedio(0);
        int pos=0;
        
        for(int i=0;i<b.length;i++){
            
            for(int j=0; j<a.length;j++){
                if(mayor.getPromedio()<a[j].getPromedio()){
                    mayor=a[j];
                    pos=j;
                }
            }
            
            b[i]=a[pos];
            a[pos].setPromedio(0);
            mayor.setPromedio(0);
        }
        
        a=b;
        
        
    }
    
    public Estudiante(String nombre, int edad, int nIdentificacion){
        
        this.nombre=nombre;
        this.edad=edad;
        this.nIdentificacion=nIdentificacion;
        
        materias[0]="Matematicas";
        materias[1]="Ciencias";
        materias[2]="Ingles";
        
    }
    
    public Estudiante(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnIdentificacion() {
        return nIdentificacion;
    }

    public void setnIdentificacion(int nIdentificacion) {
        this.nIdentificacion = nIdentificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setNotas(double nMate, double nCiencias, double nIngles){
        
        double notas[] = {nMate, nCiencias, nIngles};
        this.notas=notas;
        
        this.calcularP();
        
    }
    
    public double calcularP(){
        
        for(int i=0; i<notas.length;i++){
            promedio+=notas[i];
        }
        
        promedio= promedio/3;
        
        return promedio;
        
    }
    
    public double getPromedio(){
        return promedio;
    }
    
    public void setPromedio(double promedio){
        this.promedio=promedio;
    }
    
    public String[] dd(){
        String[] nn =new String[3];
        
        for(int i =0; i<materias.length;i++){
            nn[i]=materias[i]+": "+notas[i];
        }
        
        return nn;
    }
    
    public String[] getMaterias(){
        return materias;
    }
    
    @Override
    public int compareTo(Estudiante o){
        
        if(this.getEdad()>o.getEdad()){
            return 1;
        }else if(this.getEdad()<o.getEdad()){
            return -1;
        }else{
            return 0;
        }
        
    }

    @Override
    public String toString() {
        return "Estudiante: "+nIdentificacion+"\n"
                + "Nombre: "+nombre+"\n"
                + "Edad: "+edad+"\n"
                + materias[0]+" "+notas[0]+"\n"
                + materias[1]+" "+notas[1]+"\n"
                + materias[2]+" "+notas[2]+"\n"
                + "Promedio: "+promedio;
    }
    
    
}
