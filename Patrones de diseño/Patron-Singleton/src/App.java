public class App {
    public static void main(String[] args) throws Exception {
        //llamo al metodo estatico sobre la clase, no sobre un objeto.
        Administrador carlos = Administrador.getInstancia();
        Administrador jose = Administrador.getInstancia();

        carlos.setNombre("carlos");

        System.out.println(jose.getNombre());
    }
}


