/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajero.automatico;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner lecturaDatos = new Scanner(System.in);
    System.out.println("Bienvenido al nuevo cliente");
    System.out.println("1 Consultar saldo");
    System.out.println("2 Depositar Dinero");
    System.out.println("3 Retirar Dinero");
    int opcion=lecturaDatos.nextInt();
    double saldo= 2000.00;
        switch (opcion) {
            case 1:
     System.out.println("Su saldo es"+saldo);
      break;
        case 2:
      System.out.println("ingrese la cantidad de su deposito: ");
      int deposito = lecturaDatos.nextInt();
      double nuevosaldo = saldo+deposito;
      System.out.println("Su nuevo saldo es : "+nuevosaldo);
       break;
        case 3:
      System.out.println("Cantidad que quiere retirar: ");
      int retiro = lecturaDatos.nextInt();
      double saldoactual= saldo-retiro;
      if (saldo>=retiro){
       System.out.println("Retiro existoso, Su nuevo saldo es : "+saldoactual);   
      }else{
       System.out.println("Su saldo es insuficiente");
       break;
      }
      break;
      
      default:
         System.out.println("Opcion no valida");
        }
        
        
    }
    
}
