import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;

public class Main{
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    ImageIcon image = new ImageIcon("shidou.jpg");
    Image ima = image.getImage();
    Image newimg = ima.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
    image = new ImageIcon(newimg);

    label.setText("Mara pushka");
    label.setIcon(image);

    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);
    label.setForeground(Color.red);
    label.setFont(new Font("MV Boli", Font.ITALIC, 20));

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setVisible(true);

    frame.add(label);
  }
}
