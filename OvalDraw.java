/************************************************
*Name: Matthew Pivoney
*
*
*
*************************************************/

import javax.swing.JFrame;

import javax.swing.JPanel;


import java.awt.Graphics;
import java.awt.Container;
import java.awt.Color;


class Oval extends JPanel {
    Oval() {

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
       // g.filRect(1,1,200,200); hw
        int panelWidth = getWidth();
        int panelHeight= getHeight();
        
        Color rectColor = new Color(255,0,0);
        g.setColor(rectColor);
        g.fillRect(0,0,panelWidth,panelHeight);
        Color myColor = new Color(255,255,0);
        g.setColor(myColor);
        g.fillOval(0,0,panelWidth,panelHeight);

        
    }
}

class OvalFrame extends JFrame {
    OvalFrame() {
        setTitle("OvalDrawJFrameCalledOvalFrame");
        setBounds(300,300,400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  setVisible(true); set visible dangerous, dont work on mac unless in main
        Oval myOval = new Oval();
        Container contentPane = getContentPane();
        contentPane.add(myOval);

    }
}

public class OvalDraw {

    public static void main(String[] args) {
        System.out.println("OvalDraw....");

        OvalFrame myFrame = new OvalFrame();
        myFrame.setVisible(true);


    }

}
