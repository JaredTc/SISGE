/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisge;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Jared
 */
public class Ventana extends JFrame{
    JPanel panel;
    public Ventana(){
        setTitle("Como Hacer Graficos con Java");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        init();
    }

    private void init() {
        panel = new JPanel();
        getContentPane().add(panel);
        // Fuente de Datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(8, "Mujeres", "Lunes");
        dataset.setValue(7, "Hombres", "Lunes");
        dataset.setValue(9, "Mujeres", "Martes");
        dataset.setValue(4, "Hombres", "Martes");
        dataset.setValue(4, "Mujeres", "Miercoles");
        dataset.setValue(5, "Hombres", "Miercoles");
        dataset.setValue(8, "Mujeres", "Jueves");
        dataset.setValue(9, "Hombres", "Jueves");
        dataset.setValue(7, "Mujeres", "Viernes");
        dataset.setValue(8, "Hombres", "Viernes");
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createBarChart3D
        ("Participacion por Genero","Genero", "Dias", 
        dataset, PlotOrientation.VERTICAL, true,true, false);
        chart.setBackgroundPaint(Color.cyan);
        chart.getTitle().setPaint(Color.black); 
        CategoryPlot p = chart.getCategoryPlot(); 
        p.setRangeGridlinePaint(Color.red); 
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }
    
    public static void main(String args[]){
        new Ventana().setVisible(true);
    }
}
//public class Ventana extends JFrame{
//    JPanel panel;
//    public Ventana(){
//        setTitle("Como Hacer Graficos con Java");
//        setSize(800,600);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setVisible(true);
//        init();
//    }
//
//    private void init() {
//        panel = new JPanel();
//        getContentPane().add(panel);
//        // Fuente de Datos
//        DefaultPieDataset defaultpiedataset = new DefaultPieDataset(); 
//        defaultpiedataset.setValue("Programacion", new Double(41.200000000000003D)); 
//        defaultpiedataset.setValue("Electronica", new Double(11D)); 
//        defaultpiedataset.setValue("Hacking", new Double(19.5D)); 
//        defaultpiedataset.setValue("SEO", new Double(30.5D)); 
//        defaultpiedataset.setValue("Redes", new Double(2.0D)); 
//
//        // Creando el Grafico
//        JFreeChart chart = ChartFactory.createPieChart3D("Tematicas Blog", defaultpiedataset, true, true, false); 
//        PiePlot3D pieplot3d = (PiePlot3D)chart.getPlot(); 
//        pieplot3d.setDepthFactor(0.5); 
//        pieplot3d.setStartAngle(290D); 
//        pieplot3d.setDirection(Rotation.CLOCKWISE); 
//        pieplot3d.setForegroundAlpha(0.5F); 
//        
//        // Mostrar Grafico
//        ChartPanel chartPanel = new ChartPanel(chart);
//        panel.add(chartPanel);
//    }
//    
//    public static void main(String args[]){
//        new Ventana().setVisible(true);
//    }
//}
