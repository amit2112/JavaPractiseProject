package TestWork;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MirrorImage {
   public static void main(String args[])throws IOException {
      //Reading the image
      File file= new File("C:\\Users\\k-ami\\Desktop\\Images\\pic1.jpg");
      BufferedImage img = ImageIO.read(file);
      //Getting the height and with of the read image.
      int height = img.getHeight();
      int width = img.getWidth();
      //Creating Buffered Image to store the output
      //TYPE_INT_ARGB
      BufferedImage res = new BufferedImage(width, height, BufferedImage.SCALE_DEFAULT);
      for(int j = 0; j < height; j++){
         for(int i = 0, w = width - 1; i < width; i++, w--){
            int p = img.getRGB(i, j);
            //set mirror image pixel value - both left and right
            res.setRGB(w, j, p);
         }
      }
      //Saving the modified image
      file = new File("C:\\Users\\k-ami\\Desktop\\Images\\picRotated.jpg");
      ImageIO.write(res, "jpg", file);
      System.out.println("Done...");
   }
}