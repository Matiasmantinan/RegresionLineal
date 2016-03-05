package ar.com.matiasmantinan.ventanas;

import javax.swing.JFrame;

public class Grafica2
  extends JFrame
{
  private Panel panel = new Panel();
  
  public Grafica2()
  {
    setTitle("Gr��fica");
    setLocationRelativeTo(null);
    setSize(500, 500);
    setResizable(false);
    setDefaultCloseOperation(3);
    add(this.panel);
    this.panel.setSize(500, 500);
    this.panel.setVisible(true);
  }
  
  public Panel getPanel()
  {
    return this.panel;
  }
}
