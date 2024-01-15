public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(1, 0, 0);
        Punto punto2 = new Punto(0, 1, 1);
        Punto punto3 = new Punto(2, 0, 2);

        Linea linea1 = new Linea(1, punto1, punto2);
        Area area1 = new Area(1, punto1, punto2, punto3);
    }
}
