import javax.swing.JOptionPane;

public class Principal {
public static void main (String[] args){
    String verDias[]={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    imprimir(verDias);
}

public static void imprimir (String verDias[]) {
    int i;
    i = 0;

    for (i = 0; i < verDias.length; i++){
        JOptionPane.showMessageDialog(null, "Los días son: " + verDias[i]);
    }
}

public static void imprimirForEach(String verDias[]) {
    for(String temp: verDias){
        JOptionPane.showMessageDialog(null, temp);
    }
}
}
