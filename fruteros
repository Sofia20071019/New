import javax.swing.JOptionPane;

public class fruteros {

    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas frutas son?: "));

        String vecFrutas[] = new String[cantidad];
        float vecCantidad[] = new float[cantidad];

        mostrar(vecFrutas, vecCantidad);
    }

    public static void mostrar(String vecFrutas[], float vecCantidad[]) {
        for (int i = 0; i < vecFrutas.length; i++) {
            vecFrutas[i] = JOptionPane.showInputDialog("Digite el nombre de la fruta " + (i + 1));
            vecCantidad[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite los kilogramos de " + vecFrutas[i]));
        }

        String salida = "Lista de frutas:\n";
        for (int i = 0; i < vecFrutas.length; i++) {
            salida += vecFrutas[i] + " - " + vecCantidad[i] + " kg\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
