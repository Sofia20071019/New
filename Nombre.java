import javax.swing.JOptionPane;

public class Nombre {
    
public static void main(String[] args) {
    
  String[] nombre = new String[5];
  ingresar(nombre);

}
  
public static void ingresar(String[] nombre) {
    int i;
    i = 0;

    for (i = 0; i < nombre.length; i++){
    
        nombre[i]=JOptionPane.showInputDialog("Digito el nombre: " + i);
    
    }
}
}