
package boletin7.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author julianlinux
 */
public class Boletin71 {

    
    public static void main(String[] args) {
        int num1;
        
         num1=Integer.parseInt(JOptionPane.showInputDialog("Teclea el valor del numero"));
         
         if (num1 >= 0) 
             
             JOptionPane.showMessageDialog(null,"El numero es positivo"+ num1);           
        
         else 
             JOptionPane.showMessageDialog(null, "El numero es negativo"+ num1);
             
         
    
        
        
        
    }
    
}
