package galysk;


public class Pasteles {

    /**
     * @return the precio_venta
     */
    public float getPrecio_venta() {
        return precio_venta;
    }

    /**
     * @param precio_venta the precio_venta to set
     */
    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    /**
     * @return the id_pastel
     */
    public int getId_pastel() {
        return id_pastel;
    }

    /**
     * @param id_pastel the id_pastel to set
     */
    public void setId_pastel(int id_pastel) {
        this.id_pastel = id_pastel;
    }

    /**
     * @return the nombre_pastel
     */
    public String getNombre_pastel() {
        return nombre_pastel;
    }

    /**
     * @param nombre_pastel the nombre_pastel to set
     */
    public void setNombre_pastel(String nombre_pastel) {
        this.nombre_pastel = nombre_pastel;
    }

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * @return the relleno
     */
    public String getRelleno() {
        return relleno;
    }

    /**
     * @param relleno the relleno to set
     */
    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return the id_inventario
     */
    public int getId_inventario() {
        return id_inventario;
    }

    /**
     * @param id_inventario the id_inventario to set
     */
    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    private int id_pastel;
    private String nombre_pastel;
    private String peso;
    private String relleno;
    private String sabor;
    private float precio_venta;
    private int id_inventario;
    private int id_cliente;


    
}
