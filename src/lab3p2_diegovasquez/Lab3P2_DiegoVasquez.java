/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_diegovasquez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Vasquez
 */
public class Lab3P2_DiegoVasquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Vehiculo> vehiculos = new ArrayList();
        Scanner lea = new Scanner(System.in);
        boolean seguir = true;
        while (seguir){
            System.out.println("""
                               =MENU VEHICULOS=
                               1.Agregar Automóvil
                               2.Agregar Motocicleta
                               3.Agregar Autobus
                               4.Modificar Vehículo
                               5.Eliminar Vehiculo
                               6.Mostrar Vehículos
                               7.Generar Boleta
                               8.Salir""");
            int op = lea.nextInt();
            switch(op){
                case 1:{
                    //Automivil
                    
                }//fin case
                break;
                case 2:{
                    
                }//fin case
                break;
                case 3:{
                    
                }//fin case
                break;
                case 4:{
                    
                }//fin case
                break;
                case 5:{
                    
                }//fin case
                break;
                case 6:{
                    
                }//fin case
                break;
                case 7:{
                    
                }//fin case
                break;
                case 8:{
                    
                }//fin case
                break;
                default:{
                    
                }//fin default
                break;
            }
        }//fin while
    }//fin main
    
}//fin class
