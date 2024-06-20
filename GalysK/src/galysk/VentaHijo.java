package galysk;

public class VentaHijo {

    /**
     * @return the id_venta_hijo
     */
    public int getId_venta_hijo() {
        return id_venta_hijo;
    }

    /**
     * @param id_venta_hijo the id_venta_hijo to set
     */
    public void setId_venta_hijo(int id_venta_hijo) {
        this.id_venta_hijo = id_venta_hijo;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

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
     * @return the id_producto
     */
    public int getId_producto() {
        return id_producto;
    }

    /**
     * @param id_producto the id_producto to set
     */
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
    
    private int id_venta_hijo;
    private int cantidad;
    private int id_venta_padre;
    private int id_producto;

    
    
    
}
