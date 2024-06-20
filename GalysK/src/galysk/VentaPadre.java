
package galysk;


public class VentaPadre {

    private int id_venta_padre;
    private float total;
    private String fecha;

    /**
     * @return the id_venta_padre
     */
    public int getId_venta_padre() {
        return id_venta_padre;
    }

    /**
     * @param id_venta_padre the id_venta_padre to set
     */
    public void setId_venta_padre(int id_venta_padre) {
        this.id_venta_padre = id_venta_padre;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
