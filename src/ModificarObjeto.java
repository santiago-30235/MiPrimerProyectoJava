//Crea una clase `Rectangulo` que tenga dos atributos `ancho` y `alto`. Escribe un método que acepte un objeto de tipo `Rectangulo` y modifique sus atributos. Comprueba cómo los objetos en Java se pasan por referencia.

// Clase que representa un rectángulo
class Rectangulo {
    private int ancho;
    private int alto;

    // Constructor
    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Métodos getter y setter
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    // Método para mostrar las dimensiones
    public void mostrarDimensiones() {
        System.out.println("Ancho = " + ancho + ", Alto = " + alto);
    }
}
public class ModificarObjeto {

    // Método que modifica los atributos del rectángulo
    public static void modificarRectangulo(Rectangulo r) {
        r.setAncho(20);
        r.setAlto(30);
        System.out.print("Dentro del método: ");
        r.mostrarDimensiones();
    }

    // Método principal
    public static void main(String[] args) {
        // Creamos un objeto rectángulo con dimensiones iniciales
        Rectangulo miRect = new Rectangulo(5, 10);

        System.out.print("Antes de modificar: ");
        miRect.mostrarDimensiones();

        // Llamamos al método que modifica el objeto
        modificarRectangulo(miRect);

        System.out.print("Después de modificar: ");
        miRect.mostrarDimensiones();
    }
}

