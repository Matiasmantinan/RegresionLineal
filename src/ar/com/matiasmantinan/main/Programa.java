package ar.com.matiasmantinan.main;

import ar.com.matiasmantinan.ventanas.Grafica2;
import ar.com.matiasmantinan.ventanas.Panel;
import ar.com.matiasmantinan.ventanas.VentanaPrincipal;

public class Programa
{
  static VentanaPrincipal ventana = new VentanaPrincipal();
  static Grafica2 grafica = new Grafica2();
  
  public static void main(String[] args)
  {
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
  }
  
  public static void empezarAPintar()
  {
    grafica.setVisible(true);
    grafica.getPanel().setPintar(true);
    grafica.getPanel().setA(ventana.getValores()[0]);
    grafica.getPanel().setB(ventana.getValores()[1]);
  }
}
