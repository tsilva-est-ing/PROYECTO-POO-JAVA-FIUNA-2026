/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author USER
 */
public class Impresora3D extends Maquina{
    private double temperaturaExtrusor;
    private double volumenMaximo;

    public Impresora3D(double temperaturaExtrusor, double volumenMaximo, String idMaquina, String marca, double horasUso, double consumoWatts) {
        super(idMaquina, marca, horasUso, consumoWatts);
        this.temperaturaExtrusor = temperaturaExtrusor;
        this.volumenMaximo = volumenMaximo;
    }
    @Override
    public double calcularTiempoEstimado() {
        //Supongamos que tarda 1.5 minutos por cada cm3 de volumen máximo configurado
        return this.volumenMaximo * 1.5; 
    }
    @Override
    public void registrarMantenimiento() {
        System.out.println("Mantenimiento de Impresora 3D: Limpieza de boquilla y lubricación de ejes X, Y, Z.");
    }
    @Override
    public String verificarEstado() {
        if (this.getHorasUso() > 500) {
            return "Requiere cambio de boquilla (extrusor).";
        } else {
            return "Estado óptimo para imprimir.";
        }
    }

    public double getTemperaturaExtrusor() {
        return temperaturaExtrusor;
    }

    public void setTemperaturaExtrusor(double temperaturaExtrusor) {
        this.temperaturaExtrusor = temperaturaExtrusor;
    }

    public double getVolumenMaximo() {
        return volumenMaximo;
    }

    public void setVolumenMaximo(double volumenMaximo) {
        this.volumenMaximo = volumenMaximo;
    }
    
    
}
