/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int []numCedulas={111,222,333,44};
        double[][]ventas={{385.00,315.42,597.39,398.30,347.72},{959.87,997.91,434.45,821.62,781.64}
                        ,{354.79,554.56,427.54,860.18,620.57},{625.04,758.91,421.23,500.16,616.82}};
      int opcion=0;
      int cedula;  
        int indice=0;
        Scanner lector=new Scanner(System.in);
        while((opcion=Menu())!=5){

            
             switch(opcion){
        
            case 1:
                System.out.println("Ingrese el numero de cedula del vendedor a buscar");
                cedula=lector.nextInt();
                indice= RetornaIndice(cedula,numCedulas);
       if(indice!=-1 ){
           
           System.out.println("Imprimiendo ventas del vendedor cedula "+cedula);
           
        ConsultarVentasVendedor(indice,ventas);
        }
       else{        System.out.println("No se encontro la cedula solicitada");}
       break;
       
            case  2:
                
          
                 
                   System.out.println("Ingrese el dia de la semana a buscar");
                char dia=lector.next().charAt(0);
                opcion=RetornaDia(dia);
                if(opcion!=-1){
                ConsultarVentasDia(opcion,ventas);
                
                
                }  
          break;
            case 3:
                
                
                System.out.println("Cedula del Vendedor");
                
                cedula=lector.nextInt();
                
                System.out.println("Dia a agregarle Ventas");
                dia=lector.next().charAt(0);
                
                
                System.out.println("Monto de ventas a ingresar");
                double monto=lector.nextDouble();
                
                indice= RetornaIndice(cedula,numCedulas);
                  opcion=RetornaDia(dia);
                AgregarVentasVendedor(indice,opcion,monto,numCedulas,ventas);
                
                break;
            case 4:
                ImprimeVentas(ventas);
            default:{
              System.out.println("Opcion invalida");
              
              
              }
        }
       
       
        }
        
        
    }
    
    public static int Menu(){
    
    Scanner lector= new Scanner(System.in);
    
    String menu="[1]  Consultar ventas de un vendedor\n"
               +"[2]  Consultar ventas de un dia\n"
               +"[3]  Agregar ventas a un vendedor\n"
               +"[4]  Imprimir Ventas\n"
              + "[5]  Salir";
    
    System.out.println(menu);
    int opc=lector.nextInt(); 
 return opc;
    
    
    }
    
    public static int RetornaIndice(int id,int cedulas[]){
    
    for(int i=0;i<cedulas.length;i++){
    
    if(id==cedulas[i])return i;
    
    
    }
    
    return -1;
    
    }
    public static int RetornaDia(char caracter){
    switch (caracter){
        case 'L':return 0;
        case 'l':return 0;
        //retorna el martes 
       
         case 'K':return 1;
        case 'k':return 1;
        
        case 'M':return 2;
        case 'm':return 2;
        
        case 'J':return 3;
        case 'j':return 3;
        
        
        case 'V':return 4;
        case 'v':return 4;
        
        default:{
        
        return -1;
        
        }
        
        
        
    
    }
   
    
    
    }
   public static void ConsultarVentasVendedor(int id,double Ventas[][]){
   
   
   for(int j=0;j<Ventas.length;j++)
   System.out.print(Ventas[id][j]+"  -   ");
   
   
   
    System.out.println();
   
   }
  
   public static void ConsultarVentasDia(int dia,double Ventas[][]){
   System.out.println("Las ventas de cada vendedor por dia  "+dia );
   
  for(int i=0;i<Ventas.length;i++){
  System.out.println(Ventas[i][dia]);
   
   
   
   }
   
   
   
   
   
   }
    public static void  AgregarVentasVendedor(int indice,int dia,double monto,int cedulas[],double ventas[][]){
    
        
        System.out.println();
         System.out.println("Agregando ventas al vendedor\n");
    for(int j=0;j<cedulas.length;j++){
    
    if(j==indice){
    
    ventas[j][dia]+=monto;
    break;
    
    
    
    
    }
    
    
    }
    
    
    }
    public static void ImprimeVentas(double ventas[][]){
    
    
    for(int j=0;j<4;j++){
    
    
    for(int i=0;i<5;i++){
    
    System.out.print(ventas[j][i]+"  ");
    
   
    
    
    }
       
     System.out.println();
    
    
    
    }
    
    System.out.println();
    
    
    
    }
    
}
