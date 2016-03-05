package ar.com.matiasmantinan.mathUtils;

import java.util.ArrayList;
import java.util.Iterator;

public class CalculadoraMMC
{
  public static double[] Calcular(ArrayList absorvancia, ArrayList concentracion)
  {
    double[] valores = new double[2];
    double sum_y = 0.0D;
    double sum_x = 0.0D;
    double sum_xy = 0.0D;
    double sum_x2 = 0.0D;
    boolean seguir = true;
    int n = 0;
    double y = 0.0D;
    double x = 0.0D;
    for (int i = 0; i < 40; i++)
    {
      absorvancia.add(null);
      absorvancia.add(null);
    }
    Iterator itAbsorvancia = absorvancia.iterator();
    Iterator itConcentracion = concentracion.iterator();
    while (seguir) {
      if ((itAbsorvancia.hasNext()) && (itConcentracion.hasNext()))
      {
        try
        {
          y = ((Double)itAbsorvancia.next()).doubleValue();
          x = ((Double)itConcentracion.next()).doubleValue();
          n++;
        }
        catch (Exception e) {}
        sum_y += y;
        sum_x += x;
        sum_xy += y * x;
        sum_x2 += Math.pow(x, 2.0D);
        y = 0.0D;
        x = 0.0D;
      }
      else
      {
        seguir = false;
      }
    }
    double b = (sum_x * sum_xy - sum_y * sum_x2) / (Math.pow(sum_x, 2.0D) - n * sum_x2);
    double a = (sum_xy * n - sum_x * sum_y) / (sum_x2 * n - Math.pow(sum_x, 2.0D));
    valores[0] = a;
    valores[1] = b;
    
    return valores;
  }
}
