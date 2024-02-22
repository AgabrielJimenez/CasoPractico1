/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casocolegiado1;

/**
 *
 * @author SIMAN
 */

public class CasoColegiado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion = new Cancion(1, "Titulo de la cancion", "Autor de la cancion", 180, 2020);
        
        cancion.mostrarDetallesCancion();
        
        cancion.setTitulo("Nuevo titulo de la cancion");
        
        cancion.mostrarDetallesCancion();
    }
}
