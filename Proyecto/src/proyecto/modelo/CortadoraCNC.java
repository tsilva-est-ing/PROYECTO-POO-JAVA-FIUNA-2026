/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author USER
 */
public class CortadoraCNC extends Maquina{
    private int rpmCabezal;
    private double areaTrabajo;

    public CortadoraCNC(String idMaquina, String marca, double areaTrabajo, double horasUso, int rpmCabezal, double consumoWatts) {
        super(idMaquina, marca, horasUso, consumoWatts);
        this.rpmCabezal = rpmCabezal;
        this.areaTrabajo = areaTrabajo;
    }
   
   @Override
    public double calcularTiempoEstimado(double cantidad) {
        return (cantidad * 100) / this.rpmCabezal; 
    }
    @Override
    public void registrarMantenimiento() {
        System.out.println("Mantenimiento de CNC: Afilado de fresa, revisión de motor de husillo y recolección de viruta.");
    }
    
    @Override
    public String verificarEstado() {
        if (this.getHorasUso() > 1000) {
            return "Peligro: Cambio de rodamientos de motor urgente.";
        } else {
            return "Husillo y motores paso a paso en buen estado.";
        }
    }
    
}
