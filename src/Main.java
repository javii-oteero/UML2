public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(1, 0, 0);
        Punto punto2 = new Punto(0, 1, 1);
        Punto punto3 = new Punto(2, 0, 2);
        Punto [] puntos = new Punto[3];
        puntos[0] = punto1;
        puntos[1] = punto2;
        puntos[2] = punto3;
        Linea [] lineas = new Linea[2];

        Linea linea1 = new Linea(1, punto1, punto2);
        Area area1 = new Area(1, punto1, punto2, punto3);

        Linea linea2 = new Linea(2, puntos);
        lineas[0] = linea1;
        lineas[1] = linea2;
        Area area2 = new Area(2, lineas);
    }
}
