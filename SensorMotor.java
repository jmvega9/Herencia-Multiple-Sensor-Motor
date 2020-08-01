/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensormotor;

/**
 *
 * @author VEGA MASAPANTA JESSICA MARIBEL
 */
import java.util.Scanner;
interface SensorPresion{
    public default void Funcionar(){
        System.out.println("Funcionar Sensor de Presión");
    }
}
interface SensorTemperatura{
    public default void Funcionar(){
        System.out.println("Funcionar Sensor de Temperatura");
    }
}
public class SensorMotor implements SensorPresion, SensorTemperatura{
   /* @Override
    public void Funcionar(){
    // se puede elegir la implementacion de una interfaz
    //por ejemplo, escogemos que sea SensorPresion
    SensorPresion.super.Funcionar();
}
*/
    @Override
    public void Funcionar(){
    // se puede elegir la implementacion de una interfaz
    //por ejemplo, escogemos que sea SensorTemperatura
    SensorTemperatura.super.Funcionar();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Caratula
       System.out.println("       UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE \n");
       System.out.println("               Ingeniería  Automotriz ");
       System.out.println("           Vega Masapanta Jessica Maribel");
       System.out.println("         Programación Orientada  a Objetos ");
       System.out.println("                        7450 ");
       System.out.println("              Ing. Luis Alberto Guerra \n");
       System.out.println("           \t Herencia Múltiple \n");

        SensorMotor auto=new SensorMotor();
        auto.Funcionar();
    }

}
