import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;


public class MyFrame extends JFrame{
    MyFrame(){
      this.setTitle("Marlen Crush");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(420, 420);
      this.setResizable(false);
      this.setVisible(true);

      ImageIcon image = new ImageIcon("shidou.jpg");
      this.setIconImage(image.getImage());

      this.getContentPane().setBackground(Color.black);
    }
}
