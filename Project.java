////package university.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Project extends JFrame implements ActionListener {
//
//        Project() {
//                setSize(1540, 850);
//
//                ImageIcon i1 = new ImageIcon("icon/third.jpg");
//                Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
//                ImageIcon i3 = new ImageIcon(i2);
//                JLabel image = new JLabel(i3);
//                add(image);
//
//                JMenuBar mb = new JMenuBar();
//
//                // New Information
//                JMenu newInformation = new JMenu("New Information");
//                newInformation.setForeground(Color.black);
//                mb.add(newInformation);
//
//                JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
//                facultyInfo.setBackground(Color.WHITE);
//                facultyInfo.addActionListener(this);
//                newInformation.add(facultyInfo);
//
//                JMenuItem studentInfo = new JMenuItem("New Student Information");
//                studentInfo.setBackground(Color.WHITE);
//                studentInfo.addActionListener(this);
//                newInformation.add(studentInfo);
//
//                // Details
//                JMenu details = new JMenu("View Details");
//                details.setForeground(Color.black);
//                mb.add(details);
//
//                JMenuItem facultydetails = new JMenuItem("View Faculty Details");
//                facultydetails.setBackground(Color.WHITE);
//                facultydetails.addActionListener(this);
//                details.add(facultydetails);
//
//                JMenuItem studentdetails = new JMenuItem("View Student Details");
//                studentdetails.setBackground(Color.WHITE);
//                studentdetails.addActionListener(this);
//                details.add(studentdetails);
//
//                // Leave
//                JMenu leave = new JMenu("Apply Leave");
//                leave.setForeground(Color.black);
//                mb.add(leave);
//
//                JMenuItem facultyleave = new JMenuItem("Faculty Leave");
//                facultyleave.setBackground(Color.WHITE);
//                facultyleave.addActionListener(this);
//                leave.add(facultyleave);
//
//                JMenuItem studentleave = new JMenuItem("Student Leave");
//                studentleave.setBackground(Color.WHITE);
//                studentleave.addActionListener(this);
//                leave.add(studentleave);
//
//                // Leave Details
//                JMenu leaveDetails = new JMenu("Leave Details");
//                leaveDetails.setForeground(Color.black);
//                mb.add(leaveDetails);
//
//                JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
//                facultyleavedetails.setBackground(Color.WHITE);
//                facultyleavedetails.addActionListener(this);
//                leaveDetails.add(facultyleavedetails);
//
//                JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
//                studentleavedetails.setBackground(Color.WHITE);
//                studentleavedetails.addActionListener(this);
//                leaveDetails.add(studentleavedetails);
//
//                // Exams
//                JMenu exam = new JMenu("Examination");
//                exam.setForeground(Color.black);
//                mb.add(exam);
//
//                JMenuItem examinationdetails = new JMenuItem("Examination Results");
//                examinationdetails.setBackground(Color.WHITE);
//                examinationdetails.addActionListener(this);
//                exam.add(examinationdetails);
//
//                JMenuItem entermarks = new JMenuItem("Enter Marks");
//                entermarks.setBackground(Color.WHITE);
//                entermarks.addActionListener(this);
//                exam.add(entermarks);
//
//                // UpdateInfo
//                JMenu updateInfo = new JMenu("Update Details");
//                updateInfo.setForeground(Color.black);
//                mb.add(updateInfo);
//
//                JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
//                updatefacultyinfo.setBackground(Color.WHITE);
//                updatefacultyinfo.addActionListener(this);
//                updateInfo.add(updatefacultyinfo);
//
//                JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
//                updatestudentinfo.setBackground(Color.WHITE);
//                updatestudentinfo.addActionListener(this);
//                updateInfo.add(updatestudentinfo);
//
//                // fee
//                JMenu fee = new JMenu("Fee Details");
//                fee.setForeground(Color.black);
//                mb.add(fee);
//
//                JMenuItem feestructure = new JMenuItem("Fee Structure");
//                feestructure.setBackground(Color.WHITE);
//                feestructure.addActionListener(this);
//                fee.add(feestructure);
//
//                JMenuItem feeform = new JMenuItem("Student Fee Form");
//                feeform.setBackground(Color.WHITE);
//                feeform.addActionListener(this);
//                fee.add(feeform);
//
//                // Utility
//                JMenu utility = new JMenu("Utility");
//                utility.setForeground(Color.black);
//                mb.add(utility);
//
////                JMenuItem notepad = new JMenuItem("Notepad");
////                notepad.setBackground(Color.WHITE);
////                notepad.addActionListener(this);
////                utility.add(notepad);
//
//                JMenuItem calc = new JMenuItem("Calculator");
//                calc.setBackground(Color.WHITE);
//                calc.addActionListener(this);
//                utility.add(calc);
//
//                // about
//                JMenu about = new JMenu("About");
//                about.setForeground(Color.black);
//                mb.add(about);
//
//                JMenuItem ab = new JMenuItem("About");
//                ab.setBackground(Color.WHITE);
//                ab.addActionListener(this);
//                about.add(ab);
//
//                // exit
//                JMenu exit = new JMenu("Exit");
//                exit.setForeground(Color.black);
//                mb.add(exit);
//
//                JMenuItem ex = new JMenuItem("Exit");
//                ex.setBackground(Color.WHITE);
//                ex.addActionListener(this);
//                exit.add(ex);
//
//                setJMenuBar(mb);
//
//                setVisible(true);
//        }
//
//        public void actionPerformed(ActionEvent ae) {
//                String msg = ae.getActionCommand();
//
//                if (msg.equals("Exit")) {
//                        setVisible(false);
//                } else if (msg.equals("Calculator")) {
//                        try {
//                                Runtime.getRuntime().exec("calc.exe");
//                        } catch (Exception e) {
//
//                        }
//                } else if (msg.equals("Notepad")) {
//                        try {
//                                Runtime.getRuntime().exec("notepad.exe");
//                        } catch (Exception e) {
//
//                        }
//                } else if (msg.equals("New Faculty Information")) {
//                        new AddTeacher();
//                } else if (msg.equals("New Student Information")) {
//                        new AddStudent();
//                } else if (msg.equals("View Faculty Details")) {
//                        new TeacherDetails();
//                } else if (msg.equals("View Student Details")) {
//                        new StudentDetails();
//                } else if (msg.equals("Faculty Leave")) {
//                        new TeacherLeave();
//                } else if (msg.equals("Student Leave")) {
//                        new StudentLeave();
//                } else if (msg.equals("Faculty Leave Details")) {
//                        new TeacherLeaveDetails();
//                } else if (msg.equals("Student Leave Details")) {
//                        new StudentLeaveDetails();
//                } else if (msg.equals("Update Faculty Details")) {
//                        new UpdateTeacher();
//                } else if (msg.equals("Update Student Details")) {
//                        new UpdateStudent();
//                } else if (msg.equals("Enter Marks")) {
//                        new EnterMarks();
//                } else if (msg.equals("Examination Results")) {
//                        new ExaminationDetails();
//                } else if (msg.equals("Fee Structure")) {
//                        new FeeStructure();
//                } else if (msg.equals("About")) {
//                        new About();
//                } else if (msg.equals("Student Fee Form")) {
//                        new StudentFeeForm();
//                }
//        }
//        public static void main(String[] args) {
//                new Project();
//                System.out.println("All Good!!!");
//        }
//}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        setSize(1540, 850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set an image background
        ImageIcon i1 = new ImageIcon("icon/third.jpg");
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        // Create menu bar
        JMenuBar mb = new JMenuBar();
        mb.setBackground(new Color(50, 50, 50));  // Dark gray for the menu bar background

        // Font to use for menus and menu items
        Font font = new Font("Segoe UI", Font.BOLD, 18); // Use a modern, professional font

        // New Information Menu
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.WHITE); // White text
        newInformation.setBackground(new Color(60, 60, 60));  // Darker gray background for menus
        newInformation.setFont(font);
        newInformation.setOpaque(true);
        mb.add(newInformation);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(new Color(45, 45, 45)); // Darker background for items
        facultyInfo.setFont(font);
        facultyInfo.setForeground(Color.WHITE); // White text
        facultyInfo.addActionListener(this);
        facultyInfo.setOpaque(true);
        newInformation.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(new Color(45, 45, 45));
        studentInfo.setFont(font);
        studentInfo.setForeground(Color.WHITE);
        studentInfo.addActionListener(this);
        studentInfo.setOpaque(true);
        newInformation.add(studentInfo);

        // View Details Menu
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.WHITE);
        details.setBackground(new Color(60, 60, 60));
        details.setFont(font);
        details.setOpaque(true);
        mb.add(details);

        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(new Color(45, 45, 45));
        facultydetails.setFont(font);
        facultydetails.setForeground(Color.WHITE);
        facultydetails.addActionListener(this);
        facultydetails.setOpaque(true);
        details.add(facultydetails);

        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(new Color(45, 45, 45));
        studentdetails.setFont(font);
        studentdetails.setForeground(Color.WHITE);
        studentdetails.addActionListener(this);
        studentdetails.setOpaque(true);
        details.add(studentdetails);

        // Apply Leave Menu
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.WHITE);
        leave.setBackground(new Color(60, 60, 60));
        leave.setFont(font);
        leave.setOpaque(true);
        mb.add(leave);

        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(new Color(45, 45, 45));
        facultyleave.setFont(font);
        facultyleave.setForeground(Color.WHITE);
        facultyleave.addActionListener(this);
        facultyleave.setOpaque(true);
        leave.add(facultyleave);

        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(new Color(45, 45, 45));
        studentleave.setFont(font);
        studentleave.setForeground(Color.WHITE);
        studentleave.addActionListener(this);
        studentleave.setOpaque(true);
        leave.add(studentleave);

        // Leave Details Menu
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.WHITE);
        leaveDetails.setBackground(new Color(60, 60, 60));
        leaveDetails.setFont(font);
        leaveDetails.setOpaque(true);
        mb.add(leaveDetails);

        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(new Color(45, 45, 45));
        facultyleavedetails.setFont(font);
        facultyleavedetails.setForeground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        facultyleavedetails.setOpaque(true);
        leaveDetails.add(facultyleavedetails);

        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(new Color(45, 45, 45));
        studentleavedetails.setFont(font);
        studentleavedetails.setForeground(Color.WHITE);
        studentleavedetails.addActionListener(this);
        studentleavedetails.setOpaque(true);
        leaveDetails.add(studentleavedetails);

        // Examination Menu
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.WHITE);
        exam.setBackground(new Color(60, 60, 60));
        exam.setFont(font);
        exam.setOpaque(true);
        mb.add(exam);

        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(new Color(45, 45, 45));
        examinationdetails.setFont(font);
        examinationdetails.setForeground(Color.WHITE);
        examinationdetails.addActionListener(this);
        examinationdetails.setOpaque(true);
        exam.add(examinationdetails);

        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(new Color(45, 45, 45));
        entermarks.setFont(font);
        entermarks.setForeground(Color.WHITE);
        entermarks.addActionListener(this);
        entermarks.setOpaque(true);
        exam.add(entermarks);

        // Update Details Menu
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.WHITE);
        updateInfo.setBackground(new Color(60, 60, 60));
        updateInfo.setFont(font);
        updateInfo.setOpaque(true);
        mb.add(updateInfo);

        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(new Color(45, 45, 45));
        updatefacultyinfo.setFont(font);
        updatefacultyinfo.setForeground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updatefacultyinfo.setOpaque(true);
        updateInfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(new Color(45, 45, 45));
        updatestudentinfo.setFont(font);
        updatestudentinfo.setForeground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updatestudentinfo.setOpaque(true);
        updateInfo.add(updatestudentinfo);

        // Fee Details Menu
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.WHITE);
        fee.setBackground(new Color(60, 60, 60));
        fee.setFont(font);
        fee.setOpaque(true);
        mb.add(fee);

        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(new Color(45, 45, 45));
        feestructure.setFont(font);
        feestructure.setForeground(Color.WHITE);
        feestructure.addActionListener(this);
        feestructure.setOpaque(true);
        fee.add(feestructure);

        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(new Color(45, 45, 45));
        feeform.setFont(font);
        feeform.setForeground(Color.WHITE);
        feeform.addActionListener(this);
        feeform.setOpaque(true);
        fee.add(feeform);

        // Utility Menu
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.WHITE);
        utility.setBackground(new Color(60, 60, 60));
        utility.setFont(font);
        utility.setOpaque(true);
        mb.add(utility);

        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(new Color(45, 45, 45));
        calc.setFont(font);
        calc.setForeground(Color.WHITE);
        calc.addActionListener(this);
        calc.setOpaque(true);
        utility.add(calc);

        // About Menu
        JMenu about = new JMenu("About");
        about.setForeground(Color.WHITE);
        about.setBackground(new Color(60, 60, 60));
        about.setFont(font);
        about.setOpaque(true);
        mb.add(about);

        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(new Color(45, 45, 45));
        ab.setFont(font);
        ab.setForeground(Color.WHITE);
        ab.addActionListener(this);
        ab.setOpaque(true);
        about.add(ab);

        // Exit Menu
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.WHITE);
        exit.setBackground(new Color(60, 60, 60));
        exit.setFont(font);
        exit.setOpaque(true);
        mb.add(exit);

        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(new Color(45, 45, 45));
        ex.setFont(font);
        ex.setForeground(Color.WHITE);
        ex.addActionListener(this);
        ex.setOpaque(true);
        exit.add(ex);

        // Set the menu bar
        setJMenuBar(mb);

        // Make the frame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
            }
        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
            }
        } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        } else if (msg.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if (msg.equals("Student Leave")) {
            new StudentLeave();
        } else if (msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        } else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        } else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if (msg.equals("Examination Results")) {
            new ExaminationDetails();
        } else if (msg.equals("Fee Structure")) {
            new FeeStructure();
        } else if (msg.equals("About")) {
            new About();
        } else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm();
        }
    }

    public static void main(String[] args) {
        new Project();
        System.out.println("All Good!!!");
    }
}
