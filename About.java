//package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.geom.Ellipse2D;

public class About extends JFrame {

    About() {
        // Set the size and properties of the frame
        setSize(1000, 700);
        setLocation(100, 40);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Proper exit on close
        setLayout(null);

        // Team Member 1 Image and Info
        ImageIcon member1ImageIcon = new ImageIcon("about.jpg");
        JLabel member1ImageLabel = new JLabel(new ImageIcon(getCircularImage(member1ImageIcon.getImage())));
        member1ImageLabel.setBounds(50, 100, 100, 100); // Positioning
        add(member1ImageLabel);

        JLabel member1Name = new JLabel("Abhishek Kumar");
        member1Name.setBounds(160, 100, 300, 30);
        member1Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(member1Name);

        JLabel member1Rollno = new JLabel("Roll Number: 210310100006");
        member1Rollno.setBounds(160, 130, 300, 30);
        member1Rollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(member1Rollno);

        JLabel member1Email = new JLabel("Email: akckt652@gmail.com");
        member1Email.setBounds(160, 160, 300, 30);
        member1Email.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(member1Email);

        // Team Member 2 Image and Info
        ImageIcon member2ImageIcon = new ImageIcon("path_to_member2_image.jpg");
        JLabel member2ImageLabel = new JLabel(new ImageIcon(getCircularImage(member2ImageIcon.getImage())));
        member2ImageLabel.setBounds(50, 250, 100, 100); // Positioning
        add(member2ImageLabel);

        JLabel member2Name = new JLabel("Aman Kumar Kushwaha");
        member2Name.setBounds(160, 250, 300, 30);
        member2Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(member2Name);

        JLabel member2Rollno = new JLabel("Roll Number: 2203610109001");
        member2Rollno.setBounds(160, 280, 300, 30);
        member2Rollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(member2Rollno);

        JLabel member2Email = new JLabel("Email: aman@gmail.com");
        member2Email.setBounds(160, 310, 300, 30);
        member2Email.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(member2Email);

        // Team Member 3 Image and Info
        ImageIcon member3ImageIcon = new ImageIcon("path_to_member3_image.jpg");
        JLabel member3ImageLabel = new JLabel(new ImageIcon(getCircularImage(member3ImageIcon.getImage())));
        member3ImageLabel.setBounds(50, 400, 100, 100); // Positioning
        add(member3ImageLabel);

        JLabel member3Name = new JLabel("Ravi Yadav");
        member3Name.setBounds(160, 400, 300, 30);
        member3Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(member3Name);

        JLabel member3Rollno = new JLabel("Roll Number: 210310100047");
        member3Rollno.setBounds(160, 430, 300, 30);
        member3Rollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(member3Rollno);

        JLabel member3Email = new JLabel("Email: rky10204@gmail.com");
        member3Email.setBounds(160, 460, 300, 30);
        member3Email.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(member3Email);

        // Team Member 4 Image and Info
        ImageIcon member4ImageIcon = new ImageIcon("path_to_member4_image.jpg");
        JLabel member4ImageLabel = new JLabel(new ImageIcon(getCircularImage(member4ImageIcon.getImage())));
        member4ImageLabel.setBounds(50, 550, 100, 100); // Positioning
        add(member4ImageLabel);

        JLabel member4Name = new JLabel("Adil Quraishi");
        member4Name.setBounds(160, 550, 300, 30);
        member4Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(member4Name);

        JLabel member4Rollno = new JLabel("Roll Number: 220310100009");
        member4Rollno.setBounds(160, 580, 300, 30);
        member4Rollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(member4Rollno);

        JLabel member4Email = new JLabel("Email: adilquraishi2021@gmail.com");
        member4Email.setBounds(160, 610, 300, 30);
        member4Email.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(member4Email);

        // Adding Heading
        JLabel heading = new JLabel("College Management System");
        heading.setBounds(90, 0, 750, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 50));
        add(heading);

//        // Adding additional text information
//        JLabel name = new JLabel("Developed By: Us");
//        name.setBounds(70, 220, 550, 40);
//        name.setFont(new Font("Tahoma", Font.BOLD, 30));
//        name.setForeground(Color.WHITE);
//        add(name);
//
//        JLabel contact = new JLabel("Contact: myteam03@gmail.com");
//        contact.setBounds(70, 250, 550, 40);
//        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        contact.setForeground(Color.WHITE);
//        add(contact);

        // Make the frame visible
        setVisible(true);
    }

    // Method to create circular images
    private Image getCircularImage(Image img) {
        int width = 100;  // size of the circular image
        int height = 100;

        // Create a buffered image with transparency
        BufferedImage imgBuff = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = imgBuff.createGraphics();

        // Create a circular clip and set it
        g2d.setClip(new Ellipse2D.Double(0, 0, width, height));
        g2d.drawImage(img, 0, 0, null);
        g2d.dispose();

        return imgBuff;
    }

    public static void main(String[] args) {
        new About();
    }
}
