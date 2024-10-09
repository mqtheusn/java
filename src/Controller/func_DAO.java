package Controller;

import static View.calc_GUI.img_img;
import javax.swing.JOptionPane;

public class func_DAO {
    
    public static String valor1 = null;
    public static String valor2 = null;
    public static double res = 0;
    
    public static void soma(){

       double x = Double.parseDouble(View.calc_GUI.valor1_txt.getText());
       double y = Double.parseDouble(View.calc_GUI.valor2_txt.getText());
       JOptionPane.showMessageDialog(null,"O resultado é \n"+res);
        res = y + x;
        
       
        
        
        
}
     public static void menos(){

       double x = Double.parseDouble(View.calc_GUI.valor1_txt.getText());
       double y = Double.parseDouble(View.calc_GUI.valor2_txt.getText());
        
       JOptionPane.showMessageDialog(null,"O resultado é \n"+res);
       res = y - x;
       
       
}
     
     public static void multiplicar(){

       double x = Double.parseDouble(View.calc_GUI.valor1_txt.getText());
       double y = Double.parseDouble(View.calc_GUI.valor2_txt.getText());
        
       JOptionPane.showMessageDialog(null,"O resultado é \n"+res);
       res = x*y;
       
        
     
     
     
}
      public static void dividir(){

       double x = Double.parseDouble(View.calc_GUI.valor1_txt.getText());
       double y = Double.parseDouble(View.calc_GUI.valor2_txt.getText());
          
       res = x/y;
       
        JOptionPane.showMessageDialog(null,"O resultado é \n"+res);
     
     
     
}
      
      public static void imagem(){
        img_img.setVisible(true);
      }
      
      public static void resposta(){
       //res = setVisible(true)  não consegui terminar o negocio de colcocar a respota
      }
}