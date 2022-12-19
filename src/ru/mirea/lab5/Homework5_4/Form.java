package ru.mirea.lab5.Homework5_4;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Form extends JComponent {

    public int  i=1;

    public void paint(Graphics g) {

        if (i==22)
            i=1;
        var image = new ImageIcon("C:\\Users\\demek\\IdeaProjects\\untitled1\\src\\duck\\"+Integer.toString(i)+ ".jpg").getImage();
        g.drawImage(image,0,0,null);


        i++;
        try {
            TimeUnit.MILLISECONDS.sleep(80);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        repaint();

    }

}
