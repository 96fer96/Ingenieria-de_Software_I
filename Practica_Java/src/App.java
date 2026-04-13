import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Persona juan = new Persona(true, "Juancito");
        juan.movimiento();
        Ave paloma = new Ave("palomita", "Maria");
        paloma.getEspecie();
        paloma.volar();

        //Polimorfismo
        List<Mamifero> mamiferos = new ArrayList<>();
        mamiferos.add(new Persona(true, "Fernando"));
        mamiferos.add(new Ave("calandria", "Juanita"));

        for (Mamifero m : mamiferos) {
            m.movimiento();
        }
    }
}
