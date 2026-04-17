/*El patrón Adapter:
conecta interfaces incompatibles
permite reutilizar clases existentes
agrega una clase intermedia traductora
se usa mucho para integrar código viejo con código nuevo
*/

public class App {
    public static void main(String[] args) throws Exception {
        Target obj = new ClaseAdaptadora(new ClaseVieja());
        obj.operacion();
    }
}
