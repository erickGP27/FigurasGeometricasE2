/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;
import javax.swing.JOptionPane;
/**
 *
 * @author Erick
 */
public class Datos {
    public static double area; 
    public static double lado; 
    public static double radio; 
    public static double radio2;
    public static double base ; 
    public static double altura ; 
    public static double diametro; 
    public static double arista;
    
    public void Datos(){
        JOptionPane.showMessageDialog (null,"\t\n //Area del Circulo//");
        radio = Double.parseDouble(JOptionPane.showInputDialog("\t\nIngresa el valor del radio"));

        JOptionPane.showMessageDialog (null,"\t\n //Area del Cuadrado//");
        lado = Double.parseDouble(JOptionPane.showInputDialog("\t\nIngresa el valor del lado"));

        JOptionPane.showMessageDialog (null,"\t\n //Area del Triangulo//");
        base = Double.parseDouble(JOptionPane.showInputDialog("\t\nIngresa el valor de la base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("\t\nIngresa el valor de la altura"));
        JOptionPane.showMessageDialog (null,"\t\n //Area del Rectangulo//");
        base = Double.parseDouble(JOptionPane.showInputDialog("\t\nIngresa el valor de la base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("\t\nIngresa el valor de la altura"));
        JOptionPane.showMessageDialog (null,"\t\n //Area de la Esfera//");
        radio2 = Double.parseDouble(JOptionPane.showInputDialog("\t\nIngresa el valor del radio"));
        JOptionPane.showMessageDialog (null,"\t\n //Area del Cubo//");
        arista = Double.parseDouble(JOptionPane.showInputDialog("\t\nIngresa el valor de la arista"));
        
        
        Figurass figuras = new Figurass();
        figuras.areacirculo(radio);
        figuras.areacuadrado(lado);
        figuras.areatriangulo(base, altura);
        figuras.areaesfera(radio2);
        figuras.areacubo(arista);
        
        
    }
}
