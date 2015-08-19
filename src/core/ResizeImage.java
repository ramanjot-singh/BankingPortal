/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author HOME
 */
public class ResizeImage {

    public static ImageIcon scaleTo(File file, Dimension size) throws IOException {
        Image image = ImageIO.read(file);
        image = image.getScaledInstance(size.width, size.height, Image.SCALE_SMOOTH);

        return new ImageIcon(image);

    }
}
