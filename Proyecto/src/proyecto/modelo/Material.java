/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author USER
 */
public class Material {
    private String nombre;
    private double costoPorUnidad;
    private double cantidadDisponible;

    public Material(String nombre, double costoPorUnidad, double cantidadDisponible) {
        this.nombre = nombre;
        this.costoPorUnidad = costoPorUnidad;
        this.cantidadDisponible = cantidadDisponible;
    }
    
    public void actualizarStock(double cantidadUsada) throws InventarioInsuficienteException{
        if (cantidadUsada <= this.cantidadDisponible) {
            this.cantidadDisponible -= cantidadUsada;
        } else {
            //Si no hay stock, lanzamos nuestra excepción personalizada
            throw new InventarioInsuficienteException("Error: No hay suficiente stock de " + this.nombre + ". Disponible: " + this.cantidadDisponible);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostoPorUnidad() {
        return costoPorUnidad;
    }

    public void setCostoPorUnidad(double costoPorUnidad) {
        this.costoPorUnidad = costoPorUnidad;
    }

    public double getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(double cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
    
}
