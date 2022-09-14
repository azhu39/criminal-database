/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW3;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author andrew.abel
 */
public class ImagePanel extends JPanel {

    private final Image myImage;
    private final int myX, myY;
    private final int myWidth, myHeight;
    private final Person id;
    
    public ImagePanel(Person dispID,
                        int myX, 
                        int myY, 
                        int myWidth, 
                        int myHeight) {
        
        // Constructor for image panel
        
        // Complete this method
    	this.id=dispID;
        this.myX=myX;
        this.myY=myY;
        this.myWidth=myWidth;
        this.myHeight=myHeight;
        this.myImage=dispID.getPhoto();
        //setBackground(new Color(245,213,162));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
  
        // Draw the wanted poster
        
        // Complete this method
        Graphics2D g2 = (Graphics2D) g; 
        Rectangle.Float rect = new Rectangle.Float(0, 0, 400, 600);
        GradientPaint paintAsBackground = new GradientPaint(225,0,new Color(178,121,121),225,750,new Color(245,213,162),false);
        g2.setPaint(paintAsBackground);
        g2.fill(rect);
        //
        int x=0,y=0;
        String print="";
        
        // WANTED
        g.setColor(Color.BLACK);
        Font wantedFont = new Font("Broadway", Font.BOLD, 82);
        g.setFont(wantedFont);
        //g.drawString("WANTED", 30,80);
        print="WANTED!";
        FontMetrics fmw = g.getFontMetrics();
        x = (450 - fmw.stringWidth(print)) / 2;
        y = (fmw.getAscent() + (140 - (fmw.getAscent() + fmw.getDescent())) / 2);
        g.drawString(print, x, y);
        //Frame of DEAD OR ALIVE
        g.fillRoundRect(0, 120, 450, 95,75,75);
        //DEAD OR ALIVE
        g.setColor(new Color(245,213,162));
        Font dolFont = new Font("Broadway", Font.BOLD, 35);
        g.setFont(dolFont);
        
        print="DEAD OR ALIVE";
        FontMetrics fm = g.getFontMetrics();
        x = (450 - fm.stringWidth(print)) / 2;
        y = (fm.getAscent() + (300 - (fm.getAscent() + fm.getDescent())) / 2);
        g.drawString(print, x, y);
        //center test
        //Crime
        Font crimeFont = new Font("Broadway", Font.BOLD, 18);
        g.setFont(crimeFont);
        print=this.id.getCrimes();
        FontMetrics fm2 = g.getFontMetrics();
        x = (450 - fm2.stringWidth(print)) / 2;
        y = (fm2.getAscent() + (400 - (fm2.getAscent() + fm2.getDescent())) / 2);
        g.drawString(print, x, y);
        // Frame of the profile picture
        g.setColor(new Color(156,109,109));
        g.fillRoundRect(90, 225, 270, 280,15,15);
        g2.setStroke(new BasicStroke(5.0f));
        g.drawLine(15,225,75,285);//1
        g.drawLine(15,250,75,310);//2
        g.drawLine(15,275,75,335);//3
        g.fillRoundRect(20, 350, 20, 20,15,15);
        g.drawLine(75,385,15,445);//01
        g.drawLine(75,410,15,470);//02
        g.drawLine(75,435,15,495);//03
        g.drawLine(435,225,375,285);//1
        g.drawLine(435,250,375,310);//2
        g.drawLine(435,275,375,335);//3
        g.fillRoundRect(410, 350, 20, 20,15,15);
        g.drawLine(375,385,435,445);//91
        g.drawLine(375,410,435,470);//92
        g.drawLine(375,435,435,495);//93
        g.setColor(new Color(236,218,218));
        g.fillRoundRect(113, 245, 224, 240,15,15);
        //Picture
        g.drawImage(this.myImage, 120, 260, 210, 210, this);
        // firstName "nickName" familyName
        
        
        g.setColor(Color.BLACK);
        Font infoFont = new Font("Broadway", Font.BOLD, 20);
        g.setFont(infoFont);
        //g.drawString("-> "+this.id.getFirstName()+" \""+this.id.getNickname()+"\" "+this.id.getFamilyName()+" <-", 40,525);
        print="-> "+this.id.getFirstName()+" \""+this.id.getNickname()+"\" "+this.id.getFamilyName()+" <-";
        FontMetrics fm3 = g.getFontMetrics();
        x = (450 - fm3.stringWidth(print)) / 2;
        y = (fm3.getAscent() + (1050 - (fm3.getAscent() + fm3.getDescent())) / 2);
        g.drawString(print, x, y);
        
        // 28 Years old, Chinese      
        //g.drawString("-> "+this.id.getAgeinYears()+" Years Old, "+this.id.getNationality()+" <-", 40,563);
        print="-> "+this.id.getAgeinYears()+" Years Old, "+this.id.getNationality()+" <-";
        FontMetrics fm4 = g.getFontMetrics();
        x = (450 - fm4.stringWidth(print)) / 2;
        y = (fm4.getAscent() + (1126 - (fm4.getAscent() + fm4.getDescent())) / 2);
        g.drawString(print, x, y);
        
        // REWARD
        //g.drawString("-> REWARD <-", 150,600);
        print="-> REWARD <-";
        FontMetrics fmr = g.getFontMetrics();
        x = (450 - fmr.stringWidth(print)) / 2;
        y = (fmr.getAscent() + (1200 - (fmr.getAscent() + fmr.getDescent())) / 2);
        g.drawString(print, x, y);
        // -> $6666666 <-        
        Font rewardFont = new Font("Broadway", Font.BOLD, 50);
        g.setFont(rewardFont);
        //g.drawString("-> $ "+this.id.getReward()+" <-", 80,675);
        print="-> $ "+this.id.getReward()+" <-";
        FontMetrics fm5 = g.getFontMetrics();
        x = (450 - fm5.stringWidth(print)) / 2;
        y = (fm5.getAscent() + (1350 - (fm5.getAscent() + fm5.getDescent())) / 2);
        g.drawString(print, x, y);
        
        
        
        int depth = 630;
        int dif=myHeight-depth;
        while(depth!=750)
        {
        	g.drawLine(0,depth,dif,depth+dif);//1
        	g.drawLine(450,depth,450-dif,depth+dif);//1
        	depth++;
        }
    }
    
    // Getters, do not need to change
     @Override
    public int getX() {
        return myX;
    }

    @Override
    public int getY() {
        return myY;
    }

    @Override
    public int getWidth() {
        return myWidth;
    }

    @Override
    public int getHeight() {
        return myHeight;

    }
}
