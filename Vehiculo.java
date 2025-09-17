import javax.swing.JOptionPane;

public class Vehiculo {
    String marca, color, referencia, combustible, placa;
    int modelo;
    double valor;

    public Vehiculo() {}
    public Vehiculo(String marca, String color, int modelo, String referencia,
                    String combustible, String placa, double valor) {
        this.marca = marca; this.color = color; this.modelo = modelo;
        this.referencia = referencia; this.combustible = combustible;
        this.placa = placa; this.valor = valor;
    }

    public void setMarca(String marca) { this.marca = marca; }
    public void setColor(String color) { this.color = color; }
    public void setModelo(int modelo) { this.modelo = modelo; }
    public void setReferencia(String referencia) { this.referencia = referencia; }
    public void setCombustible(String combustible) { this.combustible = combustible; }
    public void setPlaca(String placa) { this.placa = placa; }
    public void setValor(double valor) { this.valor = valor; }

    public String toString() {
        return "Marca: " + marca + "\nColor: " + color + "\nModelo: " + modelo +
               "\nReferencia: " + referencia + "\nCombustible: " + combustible +
               "\nPlaca: " + placa + "\nValor: $" + valor;
    }

    public static void registrarVehiculo1() {
        Vehiculo v1 = new Vehiculo();
        v1.setMarca("Nissan"); v1.setColor("Rojo"); v1.setModelo(2007);
        v1.setReferencia("Tiida"); v1.setCombustible("Gasolina");
        v1.setPlaca("FBU771"); v1.setValor(25000000);
        JOptionPane.showMessageDialog(null, "Vehículo 1:\n" + v1);
    }

    public static void registrarVehiculo2() {
        Vehiculo v2 = new Vehiculo(
            JOptionPane.showInputDialog("Marca:"),
            JOptionPane.showInputDialog("Color:"),
            Integer.parseInt(JOptionPane.showInputDialog("Modelo:")),
            JOptionPane.showInputDialog("Referencia:"),
            JOptionPane.showInputDialog("Combustible:"),
            JOptionPane.showInputDialog("Placa:"),
            Double.parseDouble(JOptionPane.showInputDialog("Valor:"))
        );
        JOptionPane.showMessageDialog(null, "Vehículo 2:\n" + v2);
    }

    public static void registrarVehiculo3() {
        Vehiculo v3 = new Vehiculo(
            JOptionPane.showInputDialog("Marca:"),
            JOptionPane.showInputDialog("Color:"),
            Integer.parseInt(JOptionPane.showInputDialog("Modelo:")),
            JOptionPane.showInputDialog("Referencia:"),
            JOptionPane.showInputDialog("Combustible:"),
            JOptionPane.showInputDialog("Placa:"),
            Double.parseDouble(JOptionPane.showInputDialog("Valor:"))
        );
        JOptionPane.showMessageDialog(null, "Vehículo 3:\n" + v3);
    }

    public static void main(String[] args) {
        registrarVehiculo1();
        registrarVehiculo2();
        registrarVehiculo3();
    }
}
