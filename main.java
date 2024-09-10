import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

class feesReceipt{

    static JFrame addnewframe = new JFrame();
	static JTextField amounttext = new JTextField();
	static JTextField snametext = new JTextField();
	static JTextField sclasstext = new JTextField();
	static JTextField fnametext = new JTextField();
	static JTextField fmobiletext = new JTextField();
	static JTextField mnametext = new JTextField();
	static JTextField mmobiletext = new JTextField();
	static JTextField saddresstext = new JTextField();
	static JTextField smobiletext = new JTextField();
	static JTextField dojtext = new JTextField();
	static JTextArea receiptarea = new JTextArea();
	static JButton reset = new JButton("RESET");
	static JButton generatereceipt = new JButton("GENERATE RECEIPT");
	static JButton printreceipt = new JButton("PRINT RECEIPT");
	static int num =0;

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        feesReceipt.num = num;
    }

    public static void main(String args[]){
        addnewframe.setSize(800, 800);
        addnewframe.setLayout(null);
        addnewframe.setVisible(true);
        addnewframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addnewframe.setTitle("Fees Receipt");
        addnewframe.add(amounttext);
        addnewframe.add(snametext);
        addnewframe.add(sclasstext);
        addnewframe.add(fnametext);
        addnewframe.add(fmobiletext);
        addnewframe.add(mnametext);
        addnewframe.add(mmobiletext);
        addnewframe.add(saddresstext);
        addnewframe.add(smobiletext);
        addnewframe.add(dojtext);
        addnewframe.add(receiptarea);
        addnewframe.add(reset);
        addnewframe.add(generatereceipt);
        addnewframe.add(printreceipt);
        addnewframe.add(new JLabel("Amount:"));
        addnewframe.add(new JLabel("Student Name:"));
        addnewframe.add(new JLabel("Class:"));
        addnewframe.add(new JLabel("Father's Name:"));
        addnewframe.add(new JLabel("Father's Mobile:"));
        addnewframe.add(new JLabel("Mother's Name:"));
        


    }

}