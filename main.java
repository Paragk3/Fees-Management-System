import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

class FeeReceipt
{
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
	
	public static void main(String[] args)
	{
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
		
		cntr.add(sname);
		sname.setLayout(null);
		sname.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		sname.setBounds(25,200-75,500,50);
		sname.add(snamelabel);
		snamelabel.setBounds(10,0,200,50);
		sname.add(snametext);
		snametext.setBounds(215,15,270,20);
		
		cntr.add(sclass);
		sclass.setLayout(null);
		sclass.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		sclass.setBounds(25,375,485+15,50);
		sclass.add(sclasslabel);
		sclasslabel.setBounds(10,0,175,50);
		sclass.add(sclasstext);
		sclasstext.setBounds(185+25,15,270,20);
		
		cntr.add(fname);
		fname.setLayout(null);
		fname.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		fname.setBounds(25,250-75,500,50);
		fname.add(fnamelabel);
		fnamelabel.setBounds(10,0,175,50);
		fname.add(fnametext);
		fnametext.setBounds(215,15,270,20);
		
		cntr.add(fmobile);
		fmobile.setLayout(null);
		fmobile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		fmobile.setBounds(25,425,485+15,50);
		fmobile.add(fmobilelabel);
		fmobilelabel.setBounds(10,0,175,50);
		fmobile.add(fmobiletext);
		fmobiletext.setBounds(185+25,15,270,20);
		
		cntr.add(mname);
		mname.setLayout(null);
		mname.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		mname.setBounds(25,300-75,500,50);
		mname.add(mnamelabel);
		mnamelabel.setBounds(10,0,185,50);
		mname.add(mnametext);
		mnametext.setBounds(215,15,270,20);
		
		cntr.add(mmobile);
		mmobile.setLayout(null);
		mmobile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		mmobile.setBounds(25,475,485+15,50);
		mmobile.add(mmobilelabel);
		mmobilelabel.setBounds(10,0,175,50);
		mmobile.add(mmobiletext);
		mmobiletext.setBounds(185+25,15,270,20);
		
		cntr.add(saddress);
		saddress.setLayout(null);
		saddress.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		saddress.setBounds(25,350-75,500,50);
		saddress.add(saddresslabel);
		saddresslabel.setBounds(10,0,195,50);
		saddress.add(saddresstext);
		saddresstext.setBounds(215,15,270,20);
		
		cntr.add(smobile);
		smobile.setLayout(null);
		smobile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		smobile.setBounds(25,525,485+15,50);
		smobile.add(smobilelabel);
		smobilelabel.setBounds(10,0,185,50);
		smobile.add(smobiletext);
		smobiletext.setBounds(185+25,15,270,20);
		
		cntr.add(doj);
		doj.setLayout(null);
		doj.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		doj.setBounds(25,400-75,500,50);
		doj.add(dojlabel);
		dojlabel.setBounds(10,0,215,50);
		doj.add(dojtext);
		dojtext.setBounds(215,15,270,20);
		
		cntr.add(amount);
		amount.setLayout(null);
		amount.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		amount.setBounds(25,575,485+15,50);
		amount.add(amountlabel);
		amountlabel.setBounds(10,0,200,50);
		amount.add(amounttext);
		amounttext.setBounds(185+25,15,270,20);
		
		cntr.add(receiptarea);
		receiptarea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		receiptarea.setBounds(550,125,800,500);
		
		cntr.add(generatereceipt);
		generatereceipt.setBounds(100,640,300,40);
		
		cntr.add(reset);
		reset.setBounds(450,640,300,40);
		
		cntr.add(printreceipt);
		printreceipt.setBounds(800,640,300,40);
		
		receiptarea.setEditable(false);
		
		reset.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent event)
				{
					reset_action(event);
				}
		});
		
		generatereceipt.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent event)
				{
					generatereceipt_action(event);
				}
		});
		
		printreceipt.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent event)
				{
					printreceipt_action(event);
				}
		});
	}
	
	public static void reset_action(ActionEvent event)
	{
		amounttext.setText("");
		snametext.setText("");
		sclasstext.setText("");
		fnametext.setText(""); 
		fmobiletext.setText(""); 
		mnametext.setText(""); 
		mmobiletext.setText(""); 
		saddresstext.setText(""); 
		smobiletext.setText(""); 
		dojtext.setText(""); 
		receiptarea.setText(""); 
	}
	
	public static void generatereceipt_action(ActionEvent event)
	{
		
		
		
		try
		{
			FileInputStream fin = new FileInputStream("receipt number.txt");
			int i = 0;
			
			
			while((i = fin.read())!= -1)
			{
				num=i;
			}
			
			fin.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		Date obj = new Date();
		
		String date = obj.toString();
		
		receiptarea.setText("\t********************\n");
		receiptarea.setText(""+receiptarea.getText()+"\t CONCEPT CLASSES\n");
		receiptarea.setText(""+receiptarea.getText()+"\t********************\n\n"+date+"   Receipt Number : "+(num+1));
		receiptarea.setText(""+receiptarea.getText()+"\n\n\nSTUDENT NAME : "+snametext.getText());
		receiptarea.setText(""+receiptarea.getText()+"\n\nFATHER NAME : "+fnametext.getText());
		receiptarea.setText(""+receiptarea.getText()+"\n\nMOTHER NAME : "+mnametext.getText());
		receiptarea.setText(""+receiptarea.getText()+"\n\nADDRESS : "+saddresstext.getText());
		receiptarea.setText(""+receiptarea.getText()+"\n\nDATE OF JOINING : "+dojtext.getText());
		receiptarea.setText(""+receiptarea.getText()+"\n\nCLASS : "+sclasstext.getText());
		receiptarea.setText(""+receiptarea.getText()+"\n\nFATHER MOBILE : "+fmobiletext.getText());
		receiptarea.setText(""+receiptarea.getText()+"\n\nMOTHER MOBILE : "+mmobiletext.getText());
		receiptarea.setText(""+receiptarea.getText()+"\n\nSTUDENT MOBILE : "+smobiletext.getText());
		receiptarea.setText(""+receiptarea.getText()+"\n\nFEE AMOUNT : "+amounttext.getText()+"\t\t    SIGNATURE");
		
		
		
	}
	
	public static void printreceipt_action(ActionEvent event)
	{
		try{
			receiptarea.print();
		}
		catch(Exception e)
		{
			
		}
		
		try
		{
			FileOutputStream fout = new FileOutputStream("receipt number.txt",true);
		
			num++;		
			fout.write(num);
			fout.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	