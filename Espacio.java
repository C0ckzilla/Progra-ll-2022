import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Espacio extends JPanel implements ActionListener {
    Graphics g;
    ArrayList<Particula> particulas = new ArrayList<Particula>();
    public Espacio(){
        setPreferredSize(new Dimension(400,300) );
        for (int  i=0; i<100; i++){
            double x, y;
            x = Math.random()*399;
            y = Math.random()*299;
            particulas.add(new Particula((int) x, (int) y));
        }
        Timer timer = new Timer (100,this);
        timer.start();
    }    
    public void paintComponent(Graphics g){
        this.g=g;
        for (Particula p:particulas){
            g.setColor(p.getColor());
            g.fillOval(p.getX(), p.getY(),2,2);
            System.out.println(p.getX());
        }
    }
     public static void main(String[] args) {
        JFrame window = new JFrame("Particula");
        window.setVisible(true);
        window.setSize(new Dimension(400, 300));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        Espacio espacio = new Espacio();
        window.add(espacio);
        window.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for (Particula p:particulas){
            p.move();
        }
        repaint();
    }
    
}
