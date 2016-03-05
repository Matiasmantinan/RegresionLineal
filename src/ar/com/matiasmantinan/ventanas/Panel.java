package ar.com.matiasmantinan.ventanas;

import java.awt.Color;
import java.awt.Graphics;
import java.io.PrintStream;
import javax.swing.JPanel;

public class Panel
  extends JPanel
{
  private static double a = 1.0D;
  private static double b = 0.0D;
  
  public Panel()
  {
    setBackground(Color.white);
  }
  
  public void setA(double a)
  {
    a = a;
  }
  
  public void setB(double b)
  {
    b = b;
  }
  
  private boolean pintar = false;
  
  public void setPintar(boolean pintar)
  {
    this.pintar = pintar;
  }
  
  public void paint(Graphics g)
  {
    super.paint(g);
    
    graficarLineal(a, b, g, this);
  }
  
  public static void pintarEjes(JPanel panel, Graphics g)
  {
    g.setColor(Color.red);
    g.drawLine(panel.getWidth() / 2, 0, panel.getWidth() / 2, panel.getHeight());
    g.drawLine(0, panel.getHeight() / 2, panel.getWidth(), panel.getHeight() / 2);
  }
  
  public static void graficarLineal(double a, double b, Graphics g, JPanel panel)
  {
    pintarEjes(panel, g);
    Double y2 = Double.valueOf(getCoordenadaGraficay(a * panel.getWidth() + b, panel));
    Double y1 = Double.valueOf(getCoordenadaGraficay(a * -panel.getWidth() + b, panel));
    g.drawLine(0, y1.intValue(), panel.getWidth(), y2.intValue());
    
    System.out.println("hola");
    System.out.println("chau");
  }
  
  private static double getCoordenadax(double x, JPanel plano)
  {
    return x - plano.getWidth() / 2.0D;
  }
  
  private static double getCoordenaday(double y, JPanel plano)
  {
    return plano.getHeight() / 2.0D - y;
  }
  
  private static double getCoordenadaGraficax(double x, JPanel plano)
  {
    return plano.getWidth() / 2.0D + x;
  }
  
  private static double getCoordenadaGraficay(double y, JPanel plano)
  {
    return getCoordenaday(y, plano);
  }
}
