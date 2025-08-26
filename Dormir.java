import javax.swing.JOptionPane;

public class Dormir {
    
    public static void main(String[] args) {
        String vecDias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        float vecHoras[] = new float[7];
        
        horas(vecHoras, vecDias);
        imprimir(vecDias, vecHoras); 
    }

    public static void horas(float vecHoras[], String vecDias[]) {
        for(int i = 0; i < vecHoras.length; i++){
            vecHoras[i] = Float.parseFloat(
                JOptionPane.showInputDialog("Cuantas horas durmio el dia: " + vecDias[i] + "?")
            );
        }
    }

    public static void imprimir(String vecDias[], float vecHoras[]) {
        for (int i = 0; i < vecDias.length; i++) {  
            JOptionPane.showMessageDialog(null, vecDias[i] + ": " + vecHoras[i] + " horas");
        }
    }
}
