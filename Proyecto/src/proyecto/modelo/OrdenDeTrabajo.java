/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author USER
 */
public class OrdenDeTrabajo {
    private int numeroOrden;
    private Maquina maquinaAsignada;
    private Material materialUsado; 
    private double costoTotal;
    private double tiempoEstimado;

    
// CORREGIDO: Solo recibe los 3 parámetros que realmente le envías desde la VentanaPrincipal
    public OrdenDeTrabajo(int numeroOrden, Maquina maquinaAsignada, Material materialUsado) {
        this.numeroOrden = numeroOrden;
        this.maquinaAsignada = maquinaAsignada;
        this.materialUsado = materialUsado;
        
        // Inicializamos en 0.0, ya que el método calcularCostoTotal() se encargará de actualizarlos
        this.costoTotal = 0.0;
        this.tiempoEstimado = 0.0;
    }
    
  public double calcularCostoTotal(double cantidadMaterialUsado){
        this.costoTotal = cantidadMaterialUsado * materialUsado.getCostoPorUnidad();
        //Le pasamos la cantidad del usuario a la máquina
        this.tiempoEstimado = maquinaAsignada.calcularTiempoEstimado(cantidadMaterialUsado);
        //Sumamos un costo fijo por hora de uso de la máquina
        double horasEstimadas = this.tiempoEstimado / 60.0;
        double costoEnergetico = horasEstimadas * maquinaAsignada.getConsumoWatts() * 0.5; // Supongamos $0.5 el watt
        this.costoTotal += costoEnergetico;     
        return this.costoTotal;
    }
  
    public String generarResumen() {
        return "Orden #" + numeroOrden + " | Máquina: " + maquinaAsignada.getMarca() + 
               " | Material: " + materialUsado.getNombre() + 
               " | Tiempo: " + this.tiempoEstimado + " min | Costo Total: $" + String.format("%.2f", costoTotal);//Para imprimir con 2 decimales
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public Maquina getMaquinaAsignada() {
        return maquinaAsignada;
    }

    public void setMaquinaAsignada(Maquina maquinaAsignada) {
        this.maquinaAsignada = maquinaAsignada;
    }

    public Material getMaterialUsado() {
        return materialUsado;
    }

    public void setMaterialUsado(Material materialUsado) {
        this.materialUsado = materialUsado;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public double getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(double tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
    
    
}
