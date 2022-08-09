import javax.swing.JOptionPane;
public class Ejercicio2 {

    public static void main(String[] args) {

        //Declaramos una constante
        final double IGV=0.18;

        String texto=JOptionPane.showInputDialog("Introduce el precio de un producto");
        //Pasamos el String a double
        double precio=Double.parseDouble(texto);

        //Obtenemos el precio final (precio+(precio*IGV))
        double precioFinal=precio+(precio*IGV);
        System.out.println("El IGV es : "+precio*IGV);
        System.out.println("El precio con IGV es : "+precioFinal);
    }
}