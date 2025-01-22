import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**Poem Project
 *@author Ronard Nyongkah
 *@version Spring 2025
 *CSci1130
*/
public class Poem extends JFrame {

    //declare variable
    private Image img;

    public static void main(String[]args){
        Poem frame = new Poem();
        frame.setSize(800, 1000);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.loadImage();
        frame.setVisible(true);
    }

    public void loadImage(){
        // this is a path into the images folder getting my image for the background image
        String path3 ="images/path.jpg";

        File file = new File(path3);
        try {
            img = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void paint(Graphics g){
        super.paint(g);
        // The Road not taken by Robert Frost 
        String line1 = "Two roads diverged in a yellow wood,\n";
        String line2 =  "And sorry I could not travel both And be one traveler,\n";
        String line3 =  "long I stood And looked down one as far as I could\n";
        String line4 =  "To where it bent in the undergrowth;\n";
        String line5 =  "Then took the other, as just as fair,\n";            
        String line6 =  "And having perhaps the better claim,\n";
        String line7 =  "Because it was grassy and wanted wear;\n";
        String line8 =  "Though as for that the passing there\n";
        String line9 =  "Had worn them really about the same,\n";
        String line10 =  "And both that morning equally lay\n";
        String line11 =  "In leaves no step had trodden black.\n";
        String line12 =  "Oh, I kept the first for another day!\n";
        String line13 =  "I doubted if I should ever come back.\n";
        String line14 =  "I shall be telling this with a sigh\n";
        String line15 =  "Somewhere ages and ages hence:\n";
        String line16 =  "Two roads diverged in a wood, and I—\n";
        String line17 =  "I took the one less traveled by,\n";
        String line18 =  "And that has made all the difference.\n";
        g.drawImage(img, 0,0, this);
        // The lines of code underneeth, render all the lines of the poem above and also change the color of the text every 6 lines
        g.setColor(Color.yellow);
        g.drawString(line1, 300, 100);
        g.drawString(line2, 300, 120);
        g.drawString(line3, 300, 140);
        g.drawString(line4, 300, 160);
        g.drawString(line5, 300, 180);
        g.drawString(line6, 300, 200);
        g.setColor(Color.pink);
        g.drawString(line7, 300, 220);
        g.drawString(line8, 300, 240);
        g.drawString(line9, 300, 260);
        g.drawString(line10, 300, 280);
        g.drawString(line11, 300, 300);
        g.drawString(line12, 300, 320);
        g.setColor(Color.green);
        g.drawString(line13, 300, 340);
        g.drawString(line14, 300, 360);
        g.drawString(line15, 300, 380);
        g.drawString(line16, 300, 400);
        g.drawString(line17, 300, 420);
        g.drawString(line18, 300, 440);
    }
}