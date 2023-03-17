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
public class Figurass {
    double area;
    public void areacirculo (double radio) { 
    area = Math.PI*Math.pow(radio, 2);
    JOptionPane.showMessageDialog(null, "El area es:" + area);
}
    public void areacuadrado(double lado){
    area = lado *lado; 
    JOptionPane.showMessageDialog(null, "El area es:" + area);
    }
    public void areatriangulo (double base, double altura){
    area = (base* altura)/2; 
    JOptionPane.showMessageDialog(null, "El area es:" + area);
    }
    public void arearectangulo (double base, double altura) {
    area = base *altura;
    JOptionPane.showMessageDialog(null, "El area es:" + area);
    }
    public void areaesfera (double radio2){
    area = 4 * (Math.PI)*Math.pow(radio2, 2);
    JOptionPane.showMessageDialog(null, "El area es:" + area);
    }
    public void areacubo (double arista) {
    area = 6 * Math.pow(arista, 2);
    JOptionPane.showMessageDialog(null, "El area es:" + area);
    }
    
}


