public class Main {
    public static void main(String[] args) {
      ArticuloLibreria articulo = new ArticuloLibreria("Cuaderno", 5000, 20);
      articulo.aplicarAumento(10);
      articulo.vender(3);
      System.out.println("balance final");
      System.out.println("-----------");
      articulo.mostrarInformacion();
    }
}