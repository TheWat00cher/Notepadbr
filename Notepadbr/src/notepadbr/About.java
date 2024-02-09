
package notepadbr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    
    About()
    {
        setBounds(400 , 200 , 600 , 600);
        setLayout(null);
        
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("notepadbr/icons/images.jpg"));
        Image i2 = ic.getImage().getScaledInstance(300 , 400 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(150 , 40 , 300 , 150);
        add(headerIcon);
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("notepadbr/icons/photo.jpg"));
        Image i5 = i4.getImage().getScaledInstance(300 , 400 , Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel Icon = new JLabel(i6);
        Icon.setBounds(50 , 230 , 200 , 300);
        add(Icon);
        
        JLabel text = new JLabel("<html>This is a Sample Project Made by BHAWESH KUMAR JHA <br> with the help of SHYANIL MISHRA and CODE FOR INTEVIEW <br> THANKS FOR HELP :)</html>");
        text.setFont(new Font("SAN_SERIF" , Font.BOLD , 15));
        text.setBounds(300 , 150 , 200 , 300);
        add(text);
        
        JButton b1 = new JButton("OK");
        b1.setBounds(350 , 450 , 120 , 25);
        b1.addActionListener(this);
        add(b1);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        this.setVisible(false);
    }
    
    public static void main(String[] args)
    {
        new About();
    }
    
}
