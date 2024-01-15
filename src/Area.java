public class Area {
    private int id;
    private Punto p1;
    private Punto p2;
    private Punto p3;
    private Linea l1;
    private Linea l2;

    public Area(int id, Punto p1, Punto p2, Punto p3) {
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Area(int id, Linea l1, Linea l2) {
        this.id = id;
        this.l1 = l1;
        this.l2 = l2;
    }
}
