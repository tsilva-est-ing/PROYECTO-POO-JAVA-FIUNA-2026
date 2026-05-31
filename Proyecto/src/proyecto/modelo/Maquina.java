/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author USER
 */
public abstract class Maquina implements Mantenible {
    private String idMaquina;
    private String marca;
    private double horasUso;
    private double consumoWatts;

    public Maquina(String idMaquina, String marca, double horasUso, double consumoWatts) {
        this.idMaquina = idMaquina;
        this.marca = marca;
        this.horasUso = horasUso;
        this.consumoWatts = consumoWatts;
    }

    public String getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(String idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(double horasUso) {
        this.horasUso = horasUso;
    }

    public double getConsumoWatts() {
        return consumoWatts;
    }

    public void setConsumoWatts(double consumoWatts) {
        this.consumoWatts = consumoWatts;
    }
    
    public abstract double calcularTiempoEstimado(double cantidad);
    
}
