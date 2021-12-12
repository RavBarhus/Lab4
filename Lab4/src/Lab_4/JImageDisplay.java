package Lab_4;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class JImageDisplay  extends JComponent {
    private BufferedImage img;

    public JImageDisplay(int height, int wight) {
        img=new BufferedImage(wight,height, BufferedImage.TYPE_INT_RGB);
        Dimension imgDim = new Dimension(wight,height);
        super.setPreferredSize(imgDim);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.drawImage(img, 0, 0, img.getWidth(), img.getHeight(), null);
    }

    public void clearImage(){
        int[] blankArray = new int[getWidth() * getHeight()];
        img.setRGB(0,0,getWidth(),getHeight(),blankArray,0,1);
    }

    public void drawPixel(int x, int y,int RGB){
        img.setRGB(x,y,RGB);
    }

}
