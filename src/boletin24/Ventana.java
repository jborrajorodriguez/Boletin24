package boletin24;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.Spring.max;
import javax.swing.border.EmptyBorder;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Ventana extends JFrame implements ActionListener {

    JFrame marco;
    JPanel panel;
    JTextField te;
    JButton bLimpar, bDibuxa;
    Graphics g;

    public Ventana() {
        //Inicializar componentes:
        marco = new JFrame("Boton Premer");
        panel = new JPanel();
        bLimpar = new JButton("Limpar");
        bDibuxa = new JButton("Dibuxar");

        te = new JTextField(15);

        //Caracteristicas:
        marco.setSize(400, 300);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bLimpar.addActionListener(this);
        bDibuxa.addActionListener(this);
        te.setText("0");

        //Añadir contenido:
        panel.add(bLimpar);
        panel.add(bDibuxa);
        panel.add(te);

        marco.add(panel);

        //Hacer Visible:
        marco.setVisible(true);
        marco.setLocationRelativeTo(null);
       

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        
        if (boton == bDibuxa) {
            g = panel.getGraphics();
            for(int i=1; i<=Integer.parseInt(te.getText()); i++){
                int x=(int) (Math.random()*(300-0))+0;
                int y=(int) (Math.random()*(300-0))+0;
                g.setColor(Color.red);
               
                g.fillOval(x, y+50, 20, 20);
                
            }
        }else{

            g.clearRect(0, 50, marco.getWidth(), marco.getHeight());
        }
}
           

}
