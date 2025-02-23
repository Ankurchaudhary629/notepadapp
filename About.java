package NotepadApp;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame{
        About(){
            setBounds(100,100,500,400);
            setTitle("About Notepad Application");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ImageIcon icon = new ImageIcon(getClass().getResource("Notepad_icon.png"));
            setIconImage(icon.getImage());

            setLayout(null);

            JLabel iconLabel=new JLabel(new ImageIcon(getClass().getResource("Notepad_icon.png")));
            iconLabel.setBounds(100,50,80,80);
            add(iconLabel);

            JLabel textLabel=new JLabel("<html>welcom to notepad<br>Notepad is a simlpe text editor for microsoft windows and a basic text editint program which enables computer users to create documents<br>All rights reserved@2025</html>");
            textLabel.setBounds(100,50,350,300);
            textLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
            add(textLabel);
        }
        public static void main(String[] args){
            new About().setVisible(true);
        }

    }



