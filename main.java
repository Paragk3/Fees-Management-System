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

    
    public static void main(String args[]){
        JPanel header = new JPanel();
		JLabel headerlabel = new JLabel("FEES RECEIPT SYSTEM");
		JPanel sname = new JPanel();
		JLabel snamelabel = new JLabel("STUDENT NAME : ");
		JPanel sclass = new JPanel();
		JLabel sclasslabel = new JLabel("ENTER CLASS : ");
		JPanel fname = new JPanel();
		JLabel fnamelabel = new JLabel("FATHER NAME : ");
		JPanel fmobile = new JPanel();
		JLabel fmobilelabel = new JLabel("FATHER MOB : ");
		JPanel mname = new JPanel();
		JLabel mnamelabel = new JLabel("MOTHER NAME : ");
		JPanel mmobile = new JPanel();
		JLabel mmobilelabel = new JLabel("MOTHER MOB : ");
		JPanel saddress = new JPanel();
		JLabel saddresslabel = new JLabel("ENTER ADDRESS : ");
		JPanel smobile = new JPanel();
		JLabel smobilelabel = new JLabel("STUDENT MOB : ");
		JPanel doj = new JPanel();
		JLabel dojlabel = new JLabel("DATE OF JOINING : ");
		JPanel amount = new JPanel();
		JLabel amountlabel = new JLabel("FEE AMOUNT : ");
	
		
		addnewframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addnewframe.setBounds(0,0,1375,725);
		addnewframe.setVisible(true);
		
		
		Container cntr = addnewframe.getContentPane();
		cntr.setLayout(null);
		cntr.setBackground(Color.CYAN);
		cntr.add(header);
		header.setLayout(null);
		header.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		header.setBounds(300,0,750,100);
		header.add(headerlabel);
		headerlabel.setBounds(75,0,625,150);

        Font f = new Font("Baskerville Old Face",Font.BOLD,50);
		headerlabel.setFont(f);
		Font f2 = new Font("Baskerville Old Face",Font.BOLD,20);
		snamelabel.setFont(f2);
		sclasslabel.setFont(f2);
		fnamelabel.setFont(f2);
		fmobilelabel.setFont(f2);
		mnamelabel.setFont(f2);
		mmobilelabel.setFont(f2);
		saddresslabel.setFont(f2);
		smobilelabel.setFont(f2);
		dojlabel.setFont(f2);
		amountlabel.setFont(f2);
		generatereceipt.setFont(f2);
		reset.setFont(f2);
		printreceipt.setFont(f2);

        Font f3 = new Font("Baskerville Old Face",Font.BOLD,15);
		snametext.setFont(f3);
		sclasstext.setFont(f3);
		fnametext.setFont(f3);
		fmobiletext.setFont(f3);
		mnametext.setFont(f3);
		mmobiletext.setFont(f3);
		saddresstext.setFont(f3);
		smobiletext.setFont(f3);
		dojtext.setFont(f3);
		amounttext.setFont(f3);
		receiptarea.setFont(f3);
        


    }

}