import java.util.Random;
import javax.swing.JOptionPane;

public class Cafeteria {
    
    public static void main(String[] args) {
        String vecFrase[] = {
            "No cuentes los días, haz que los días cuenten.",
            "Sé el cambio que quieres ver en el mundo.",
            "Ha llegado el momento de vivir la vida que imaginaste.",
            "En la vida hay algo peor que el fracaso, no haberlo intentado.",
            "Cuando haya una voz en tu cabeza que te diga que no puedes pintar, pinta tanto como puedas y verás cómo se callará.",
            "No bajes la meta, aumenta el esfuerzo.",
            "La energía y la persistencia conquistan todas las cosas.",
            "Lo que importa no es lo que te ocurre, sino cómo reaccionas a ello."
        };

        String nombre = nombre();      
        imprimir(vecFrase, nombre); 
    }

    public static String nombre() {
        return JOptionPane.showInputDialog("Ingrese su nombre: ");
    }

    public static void imprimir(String vecFrase[], String nombre) {
        Random rand = new Random();
        int indice = rand.nextInt(vecFrase.length); 
        JOptionPane.showMessageDialog(null, nombre + ": " + vecFrase[indice]);
    }
} 
