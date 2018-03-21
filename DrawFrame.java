
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zetsubou
 */
public class DrawFrame extends JFrame{

    private static final long serialVersionUID = 1L;

	public DrawFrame(){
        setTitle("Fractals");
        add(new DrawPanel());
    }
    
    public static void main(String[] args){
        JFrame frame = new DrawFrame();
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class DrawPanel extends JPanel{
    
    private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int xCenter = getWidth()/2;
        int yCenter = getHeight()/2;
        int radius = (int)(Math.min(getWidth(), getHeight())*0.4);
        int x = xCenter - radius;
        int y = yCenter - radius;
        
        g.fillArc(x, y, 2*radius, 2*radius, 0, radius);
    }
}
