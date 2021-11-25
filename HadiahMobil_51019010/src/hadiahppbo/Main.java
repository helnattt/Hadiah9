/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hadiahppbo;
import java.awt.*;
/**
 *
 * @author helnat
 */
public class Main extends Panel {
   Font f;
    String text =" Ini adalah mobil dan nama saya Helen Natalia";
    Main(){
        
    }
    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g) {
       f=new Font("Helvetica", Font.BOLD,15);
       //mobil
        int Vx[]={200,200,500,500,650,650};
        int Vy[]={340,100,100,200,200,340};
        int np=Vx.length;
        g.setColor(Color.CYAN);
        g.fillPolygon(Vx,Vy,np);
        //teks
        g.setColor(Color.BLACK);
        g.setFont(f);
        g.drawString(text,260,420);
        //ban
        g.setColor(Color.RED);
        g.fillOval(250,300,90,100);
        g.fillOval(450,300,90,100);
    }
        
    public static void main (String[] args){
       Frame f = new Frame ("HadiahPPBO");
       Main hadiah= new Main();   
       f.add(hadiah);
       f.setSize(900,900);
       f.setVisible(true);
    }
    
}


