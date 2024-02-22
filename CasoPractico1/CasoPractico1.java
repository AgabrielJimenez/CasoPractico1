/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casopractico1;

/**
 *
 * @author SIMAN
 */
import javax.swing.JOptionPane;

public class CasoPractico1 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese el número de cursos del 1 al 3:");
        int numCursos = Integer.parseInt(input);

        double totalTax = 0;
        for (int i = 1; i <= numCursos; i++) {
            String nombreCursos = JOptionPane.showInputDialog("Ingrese el nombre del curso o cursos  (Historia de la quimica, Teoria de la quimica, Quimica Aplicada):");
            input = JOptionPane.showInputDialog("Ingrese el precio del curso si son dos debe sumer el monto y poner el total (Historia=25000, Teoria=30000, QuimicaA=50000):");
            double precioCursos = Double.parseDouble(input);

            double tax = precioCursos * 0.02;
            totalTax += tax;

            JOptionPane.showMessageDialog(null, "Pago de impuestos (2%): " + String.format("%.2f", tax)
                    + "\nPrecio del curso: " + String.format("%.2f", precioCursos) + "\n-------------------");
        }

        JOptionPane.showMessageDialog(null, "Se le deberá pagar a hacienda un total de:"
                + String.format("%.2f", totalTax) + ".");
    }
}
