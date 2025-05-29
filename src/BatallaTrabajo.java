import java.util.Scanner;

// Clase base abstracta
abstract class Personaje {
    String nombre;
    int fuerza, velocidad, resistencia;
    int esquivas = 2;
    boolean esquivando = false;

    public Personaje(String nombre, int fuerza, int velocidad, int resistencia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
    }

    public boolean estaVivo() {
        return resistencia > 0;
    }

    public void esquivar(Personaje enemigo) {
        if (esquivas <= 0) {
            System.out.println(nombre + " ya no puede esquivar más.");
            esquivando = false;
            return;
        }

        double porcentajeEsquiva =  0.5; // para poder esquivar, la velocidad debe ser al menos 50% de la del enemigo

        if ((double) velocidad / enemigo.velocidad >= porcentajeEsquiva) {
            System.out.println(nombre + " esquiva el ataque con su velocidad.");
            esquivando = true;
            esquivas--; //restarle 1 a la variable esquivas
        } else {
            System.out.println(nombre + " intenta esquivar pero falla.");
            esquivando = false;
        }
    }

    public void perdidaVida(int golpe) {
        if (esquivando) {
            System.out.println(nombre + " esquivó el daño.");
            esquivando = false;
        } else {
            resistencia -= golpe;
            if (resistencia < 0) resistencia = 0;
            System.out.println(nombre + " recibió " + golpe + " de daño. Resistencia restante: " + resistencia);
        }
    }

    public abstract void ataqueEspecial(Personaje enemigo);
    public abstract void ataqueNormal(Personaje enemigo);
}

// Clase Spider-Man
class SpiderMan extends Personaje {
    public SpiderMan() {
        super("Spider-Man", 28, 35, 90);
    }

    public void ataqueEspecial(Personaje enemigo) {
        int golpe = velocidad + 5;
        System.out.println(nombre + " lanza telaraña causando " + golpe + " de daño.");
        enemigo.perdidaVida(golpe);
    }

    public void ataqueNormal(Personaje enemigo) {
        System.out.println(nombre + " golpea a " + enemigo.nombre + " causando " + fuerza + " de daño.");
        enemigo.perdidaVida(fuerza);
    }
}

// Clase Venom
class Venom extends Personaje {
    public Venom() {
        super("Venom", 35, 20, 110);
    }

    public void ataqueEspecial(Personaje enemigo) {
        int danio = fuerza + 10;
        System.out.println(nombre + " usa corrupción simbionte causando " + danio + " de daño (no esquivable).");
        enemigo.esquivando = false; // Ignora esquive
        enemigo.perdidaVida(danio);
        this.resistencia += 10;
        System.out.println(nombre + " absorbe energía. Resistencia ahora: " + this.resistencia);
    }

    public void ataqueNormal(Personaje enemigo) {
        System.out.println(nombre + " golpea a " + enemigo.nombre + " causando " + fuerza + " de daño.");
        enemigo.perdidaVida(fuerza);
    }
}

// Clase principal
public class BatallaTrabajo {
    Scanner scanner = new Scanner(System.in);
    Personaje jugador1;
    Personaje jugador2;

    // Método 1: Preparar batalla
    public void prepararBatalla() {
        jugador1 = new SpiderMan();
        jugador2 = new Venom();
        System.out.println("¡Batalla iniciada entre " + jugador1.nombre + " y " + jugador2.nombre + "!");
    }

    // Método 2: Turno del jugador
    
    public void turnoJugador(Personaje atacante, Personaje defensor) {
        System.out.println("\nTurno de " + atacante.nombre);
        System.out.println("1. Ataque normal");
        System.out.println("2. Ataque especial");
        System.out.println("3. Esquivar el próximo ataque");

        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                atacante.ataqueNormal(defensor);
                break;
            case 2:
                atacante.ataqueEspecial(defensor);
                break;
            case 3:
                atacante.esquivar(defensor);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    // Método 3: Mostrar estado
    public void mostrarEstado() {
        System.out.println("\n--- ESTADO DE COMBATE ---");
        System.out.println(jugador1.nombre + ": " + jugador1.resistencia + " de resistencia");
        System.out.println(jugador2.nombre + ": " + jugador2.resistencia + " de resistencia");
        System.out.println("--------------------------");
    }

    // Método 4: Iniciar batalla
    public void iniciar() {
        prepararBatalla();//inicializa personajes
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            mostrarEstado();
            turnoJugador(jugador1, jugador2);
            if (!jugador2.estaVivo()) break;
            turnoJugador(jugador2, jugador1);
        }

        System.out.println("\n--- RESULTADO FINAL ---");
        if (jugador1.estaVivo()) {
            System.out.println(jugador1.nombre + " ha ganado la batalla.");
        } else {
            System.out.println(jugador2.nombre + " ha ganado la batalla.");
        }
    }

    // Main
    public static void main(String[] args) {
        BatallaTrabajo juego = new BatallaTrabajo();
        juego.iniciar();
    }
}