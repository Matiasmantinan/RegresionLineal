package ar.com.matiasmantinan.ventanas;

import ar.com.matiasmantinan.main.Programa;
import ar.com.matiasmantinan.mathUtils.CalculadoraMMC;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal
  extends JFrame
{
  Grafica2 grafica = new Grafica2();
  private double[] valores = null;
  private JButton btnCalcular;
  private JButton btnGuardar;
  private JButton btnNuevo;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JMenu jMenu1;
  private JMenu jMenu2;
  private JMenuBar jMenuBar1;
  private JScrollPane jScrollPane1;
  private JSeparator jSeparator1;
  private JTable tblDatos;
  private JTextField txtA;
  private JTextField txtB;
  private JTextField txtR;
  private JTextField txtR2;
  
  public VentanaPrincipal()
  {
    initComponents();
  }
  
  public double[] getValores()
  {
    return this.valores;
  }
  
  private void initComponents()
  {
    this.jScrollPane1 = new JScrollPane();
    this.tblDatos = new JTable();
    this.btnCalcular = new JButton();
    this.jSeparator1 = new JSeparator();
    this.btnGuardar = new JButton();
    this.btnNuevo = new JButton();
    this.jLabel1 = new JLabel();
    this.jLabel2 = new JLabel();
    this.jLabel3 = new JLabel();
    this.jLabel4 = new JLabel();
    this.txtA = new JTextField();
    this.txtB = new JTextField();
    this.txtR = new JTextField();
    this.txtR2 = new JTextField();
    this.jMenuBar1 = new JMenuBar();
    this.jMenu1 = new JMenu();
    this.jMenu2 = new JMenu();
    
    setDefaultCloseOperation(3);
    
    this.tblDatos.setModel(new DefaultTableModel(new Object[][] { { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null } }, new String[] { "Absorvancia", "Concentracion" })
    {
      Class[] types = { Double.class, Double.class };
      
      public Class getColumnClass(int columnIndex)
      {
        return this.types[columnIndex];
      }
    });
    this.jScrollPane1.setViewportView(this.tblDatos);
    
    this.btnCalcular.setText("Calcular");
    this.btnCalcular.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        VentanaPrincipal.this.btnCalcularActionPerformed(evt);
      }
    });
    this.btnGuardar.setText("Guardar");
    
    this.btnNuevo.setText("Nuevo");
    
    this.jLabel1.setText("a:");
    
    this.jLabel2.setText("b:");
    
    this.jLabel3.setText("r:");
    
    this.jLabel4.setText("r��:");
    
    this.txtA.setEditable(false);
    this.txtA.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        VentanaPrincipal.this.txtAActionPerformed(evt);
      }
    });
    this.txtB.setEditable(false);
    
    this.txtR.setEditable(false);
    
    this.txtR2.setEditable(false);
    
    this.jMenu1.setText("File");
    this.jMenuBar1.add(this.jMenu1);
    
    this.jMenu2.setText("Edit");
    this.jMenuBar1.add(this.jMenu2);
    
    setJMenuBar(this.jMenuBar1);
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.jScrollPane1, -2, 0, 32767)
      .addComponent(this.jSeparator1)
      .addGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addComponent(this.jLabel1)
      .addComponent(this.btnCalcular)
      .addComponent(this.jLabel2)
      .addComponent(this.jLabel3)
      .addComponent(this.jLabel4))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.txtA)
      .addComponent(this.txtB)
      .addComponent(this.txtR)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.btnGuardar)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.btnNuevo)
      .addGap(0, 74, 32767))
      .addComponent(this.txtR2))))
      .addContainerGap(-1, 32767)));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jScrollPane1, -2, 300, -2)
      .addGap(18, 18, 18)
      .addComponent(this.jSeparator1, -2, 10, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.btnCalcular)
      .addComponent(this.btnGuardar)
      .addComponent(this.btnNuevo))
      .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel1)
      .addComponent(this.txtA, -2, -1, -2))
      .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel2)
      .addComponent(this.txtB, -2, -1, -2))
      .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel3)
      .addComponent(this.txtR, -2, -1, -2))
      .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel4)
      .addComponent(this.txtR2, -2, -1, -2))
      .addContainerGap(-1, 32767)));
    
    pack();
  }
  
  private void txtAActionPerformed(ActionEvent evt) {}
  
  private void btnCalcularActionPerformed(ActionEvent evt)
  {
    ArrayList<Double> absorvancia = new ArrayList();
    ArrayList<Double> concentracion = new ArrayList();
    for (int i = 0; i < 40; i++) {
      try
      {
        Double a = (Double)this.tblDatos.getValueAt(i, 0);
        absorvancia.add(a);
      }
      catch (NullPointerException e) {}
    }
    for (int i = 0; i < 40; i++) {
      try
      {
        Double a = (Double)this.tblDatos.getValueAt(i, 1);
        concentracion.add(a);
      }
      catch (NullPointerException e) {}
    }
    this.valores = CalculadoraMMC.Calcular(absorvancia, concentracion);
    this.txtA.setText(Double.toString(this.valores[0]));
    this.txtB.setText(Double.toString(this.valores[1]));
    
    Programa.empezarAPintar();
  }
}