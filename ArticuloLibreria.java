public class ArticuloLibreria {
    private String descripcion;
    private double precioUnitario;
    private int stock;
    public ArticuloLibreria(String descripcion, double precioUnitario, int stock) {
        if(precioUnitario < 0) {
            throw new IllegalArgumentException("el precio unitario no puede ser negativo.");
        }

            if(stock < 0) {
                throw new IllegalArgumentException("el stock no puede ser negativo.");
            }
            this.descripcion = descripcion;
            this.precioUnitario = precioUnitario;
            this.stock = stock;
        }
        public void aplicarAumento(double porcentaje) {
            if(porcentaje < 0) {
                throw new IllegalArgumentException("el porcentaje no puede ser negativo.");
            }
            precioUnitario = precioUnitario + (precioUnitario * porcentaje / 100);
        }
        public void vender(int cantidad) {
            if(cantidad < 0) {
                throw new IllegalArgumentException("la cantidad no puede ser negativa.");
            }
            if(cantidad > stock) {
                throw new IllegalArgumentException("no hay suficiente stock");
            }
            stock = stock - cantidad;
        }
        public void mostrarInformacion() {
            System.out.println("articulo: " + descripcion);
            System.out.println("precio unitario: " + precioUnitario);
            System.out.println("stock disponible: " + stock);
    }
}
