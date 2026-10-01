public class Producto {    private String codigo;    private String nombre;    private String descripcion;    private int cantidad;    private double precio;
    // Constructor    public Producto(String codigo, String nombre, String descripcion, int cantidad, double precio) {        this.codigo = codigo;        this.nombre = nombre;        this.descripcion = descripcion;        this.cantidad = cantidad;        this.precio = precio;    }
    // Métodos get    public String getCodigo() {        return codigo;    }
    public String getNombre() {        return nombre;    }
    public String getDescripcion() {        return descripcion;    }
    public int getCantidad() {        return cantidad;    }
    public double getPrecio() {        return precio;    }
    // Métodos set    public void setCodigo(String codigo) {        this.codigo = codigo;    }
    public void setNombre(String nombre) {        this.nombre = nombre;    }
    public void setDescripcion(String descripcion) {        this.descripcion = descripcion;    }
    public void setCantidad(int cantidad) {        this.cantidad = cantidad;    }
    public void setPrecio(double precio) {        this.precio = precio;    }}