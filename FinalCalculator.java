import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FinalCalculator extends Frame implements ActionListener,WindowListener,KeyListener{

	Button butc,but0,but1,but2,but3,but4,but5,but6,but7,but8,but9,butm,buta,buts,butd,bute,butdot;
    TextField text1,result;
    Double sum=0.0,num=0.0;

	StringBuffer s=new StringBuffer();
	
	FinalCalculator(){
		
		but0=new Button("0");
		but1=new Button("1");
		but2=new Button("2");
		but3=new Button("3");
		but4=new Button("4");
		but5=new Button("5");
		but6=new Button("6");
		but7=new Button("7");
		but8=new Button("8");
		but9=new Button("9");
		butm=new Button("*");
		buta=new Button("+");
		buts=new Button("-");
		butd=new Button("/");
		butc=new Button("C");
		bute=new Button("=");
		butdot=new Button(".");
		text1=new TextField(20);
		result=new TextField(30);
		result.setEditable(false);
		
		add(text1);
		add(result);
		add(buta);add(buts);add(butm);add(butc);
		add(but9);add(but8);add(but7);
		add(but6);add(but5);add(but4);
		add(but3);add(but2);add(but1);
		add(butdot);add(but0);add(butd);
		add(bute);
		
		text1.addKeyListener(this);
		buta.addActionListener(this);
		bute.addActionListener(this);
		buts.addActionListener(this);
		butm.addActionListener(this);
		but9.addActionListener(this);
		but8.addActionListener(this);
		but7.addActionListener(this);
		but6.addActionListener(this);
		but5.addActionListener(this);
		but4.addActionListener(this);
		but3.addActionListener(this);
		but2.addActionListener(this);
		but1.addActionListener(this);
		but0.addActionListener(this);
		butdot.addActionListener(this);
		butd.addActionListener(this);
		butc.addActionListener(this);
		
		text1.setText("");
		
		setLayout(null);
		text1.setBounds(9,32,324,80);
		result.setBounds(9,116,324,40);
		buta.setBounds(9,160,81,70);
		buts.setBounds(90,160,81,70);
		butm.setBounds(171,160,81,70);
		butd.setBounds(252,160,81,70);
		but9.setBounds(9,230,108,70);
		but8.setBounds(117,230,108,70);
		but7.setBounds(225,230,108,70);
		but6.setBounds(9,300,108,70);
		but5.setBounds(117,300,108,70);
		but4.setBounds(225,300,108,70);
		but3.setBounds(9,370,108,70);
		but2.setBounds(117,370,108,70);
		but1.setBounds(225,370,108,70);
		but0.setBounds(117,440,108,70);
		butdot.setBounds(9,440,108,70);
		butc.setBounds(225,440,108,70);
		bute.setBounds(9,510,324,40);
		
		text1.setFont(new Font("Normal", Font.PLAIN, 20));
		result.setFont(new Font("Normal", Font.PLAIN, 17));
		but1.setFont(new Font("Normal", Font.PLAIN, 25));
		but2.setFont(new Font("Normal", Font.PLAIN, 25));
		but3.setFont(new Font("Normal", Font.PLAIN, 25));
		but4.setFont(new Font("Normal", Font.PLAIN, 25));
		but5.setFont(new Font("Normal", Font.PLAIN, 25));
		but6.setFont(new Font("Normal", Font.PLAIN, 25));
		but7.setFont(new Font("Normal", Font.PLAIN, 25));
		but8.setFont(new Font("Normal", Font.PLAIN, 25));
		but9.setFont(new Font("Normal", Font.PLAIN, 25));
		but0.setFont(new Font("Normal", Font.PLAIN, 25));
		butm.setFont(new Font("Normal", Font.PLAIN, 25));
		buts.setFont(new Font("Normal", Font.PLAIN, 25));
		buta.setFont(new Font("Normal", Font.PLAIN, 25));
		butdot.setFont(new Font("Normal", Font.PLAIN, 35));
		butd.setFont(new Font("Normal", Font.PLAIN, 25));
		bute.setFont(new Font("Normal", Font.PLAIN, 25));
		butc.setFont(new Font("Normal", Font.PLAIN, 25));
		
		text1.setText("0");
				
		setTitle("Calculator");
		setFont(new Font("NOrmal",Font.BOLD,10));
		addWindowListener(this);
		setSize(332,550);
		setBackground(Color.darkGray);
		setVisible(true);
		setResizable(false);
		
	}
	
	public static void main(String [] args) {
		new FinalCalculator();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		char c=arg0.getKeyChar();
		if(!(Character.isDigit(c)||c=='+'||c=='-'||c=='*'||c=='/'))
			arg0.consume();
			
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		
	System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource()==but9) {
			s.append("9");
			text1.setText(s.toString());
		}
		if(arg0.getSource()==but8) {
			s.append("8");
			text1.setText(s.toString());
		}
		if(arg0.getSource()==but7) {
			s.append("7");
			text1.setText(s.toString());
		}
		if(arg0.getSource()==but6) {
			s.append("6");
			text1.setText(s.toString());
		}
		if(arg0.getSource()==but5) {
			s.append("5");
			text1.setText(s.toString());
		}
		if(arg0.getSource()==but4) {
			s.append("4");
		text1.setText(s.toString());
		}
		if(arg0.getSource()==but3) {
			s.append("3");
			text1.setText(s.toString());
		}
		if(arg0.getSource()==but2) {
			s.append("2");
			text1.setText(s.toString());
		}
		if(arg0.getSource()==but1) {
			s.append("1");
			text1.setText(s.toString());
		}
		if(arg0.getSource()==but0) {
			s.append("0");
			text1.setText(s.toString());
		}
		if(arg0.getSource()==buta) {
			s.append("+");
			text1.setText(s.toString());
		}
		if(arg0.getSource()==buts) {
			s.append("-");
			text1.setText(s.toString());
		}

		if(arg0.getSource()==butm) {
			s.append("*");
			text1.setText(s.toString());
		}

		if(arg0.getSource()==butd) {
			s.append("/");
			text1.setText(s.toString());
		}

		if(arg0.getSource()==butdot) {
			s.append(".");
			text1.setText(s.toString());
		}
		
		if(arg0.getSource()==butc) {
			text1.setText("0");
			s.replace(0, s.length(), "");
		}

		if(arg0.getSource()==bute) 
		{
			String str=text1.getText();
			
			int len = str.length(),count=1,k=0,j=0;
			
			
			for(int i=0;i<len;i++) {
				if(str.charAt(i)=='+'||str.charAt(i)=='/'||str.charAt(i)=='*'||str.charAt(i)=='-')
					count++;
			}
			
			Double sum=0.0;
			Double a[]=new Double[count];
			
			for(int i=0;i<len;i++) {
				if(str.charAt(i)=='+') {
					a[k]=Double.parseDouble(str.substring(j,i));
					k++;
					j=i+1;
				}
				if(str.charAt(i)=='/') {
					a[k]=Double.parseDouble(str.substring(j,i));
					k++;
					j=i+1;
				}
				if(str.charAt(i)=='*') {
					a[k]=Double.parseDouble(str.substring(j,i));
					k++;
					j=i+1;
				}
				if(str.charAt(i)=='-') {
					a[k]=Double.parseDouble(str.substring(j,i));
					k++;
					j=i+1;
				}
			}
			
			a[k]=Double.parseDouble(str.substring(j,len));

			int m=k;
			
			while(k>=0) {
				k--;
			}
			int i;
			k=0;
			
			for(i=0;i<len ;i++) {
				if(str.charAt(i)=='+') {
					sum=sum+a[k]+a[k+1];
					a[k+1]=sum;
					sum=0.0;
					if(k==m)
						break;
					k++;
				}
				else if(str.charAt(i)=='-') {
					sum=sum+a[k]-a[k+1];
					a[k+1]=sum;
					sum=0.0;
					if(k==m)
						break;
					k++;
				}
				else if(str.charAt(i)=='*') {
					sum=sum+a[k]*a[k+1];
					a[k+1]=sum;
					sum=0.0;
					if(k==m)
						break;
					k++;
				}
				else if(str.charAt(i)=='/') {
					sum=sum+a[k]/a[k+1];
					a[k+1]=sum;
					sum=0.0;
					if(k==m)
						break;
					k++;
				}
			}
			
			sum=a[m];
			result.setText(sum.toString());
		}
		
	}
	
}
