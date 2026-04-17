public class ClaseAdaptadora implements Target {
    private ClaseVieja objetoClaseVieja;

    public ClaseAdaptadora(ClaseVieja objetoClaseVieja) {
        this.objetoClaseVieja = objetoClaseVieja;
    }
    public void operacion() {
        objetoClaseVieja.operacionClaseVieja();
    }
}
