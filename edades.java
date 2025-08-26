import javax.swing.JOptionPane;

public class edades {

    public static void main(String[] args) {

        int cant = Integer.parseInt(JOptionPane.showInputDialog("Cuantas edades desea ingresar?"));
        int verEdad[] = new int[cant];
        LeerEdades(verEdad);    
    
    }

    public static void LeerEdades(int verEdad[]) {
    
        int i;
        for(i = 0; i < verEdad.length; i++){
            do {

                verEdad[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese edad " + (i+1) + ":"));
            
            } while(verEdad[i] < 14 || verEdad[i] > 116);
        }
    }
}
