import javax.swing.JFrame;
import java.awt.event.*;;
import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;
public class GuessingNumber{
public static void main(String[] args)
{
abc obj=new abc();
}
}
class abc extends JFrame
{
ButtonListener buttonListener;
ButtonListener2 buttonListener2;
ButtonListener3 buttonListener3;
JLabel l1,l2,l3,l4,l5;
JTextField t1,score,totalguess;
JButton b,b1,b2;
int count=0;
int rand=(int) (Math.random()*100);
public abc()
{
JLabel label = new JLabel(); //JLabel Creation
label.setIcon(new ImageIcon("k.jpg")); 
Dimension size = label.getPreferredSize(); 
label.setBounds(30, 30, size.width, size.height); 
add(label); 
getContentPane().setBackground(Color.PINK);
setLayout(null);
l1 = new JLabel("Guess the Number ?");
l1.setForeground(Color.RED);
l1.setFont(new Font("times new roman",Font.BOLD,30));
l1.setSize(300,35);
l1.setLocation(130,70);
add(l1);
l2=new JLabel("Enter a number between 1-100");
l2.setFont(new Font("Comic Sans MS",Font.PLAIN,24));
l2.setSize(500,20);
l2.setLocation(100,120);
add(l2);
t1=new JTextField(30);
t1.setSize(65,30);
t1.setLocation(180,150);
add(t1);
l3=new JLabel("Try and guess it!!!");
l3.setFont(new Font("Comic Sans MS",Font.PLAIN,22));
l3.setSize(300,30);
l3.setLocation(130,190);
add(l3);
setSize(600,600);
b=new JButton("check");
b.setSize(70,50);
b.setLocation(180,230);
b.setBackground(Color.LIGHT_GRAY);
buttonListener = new ButtonListener();
b.addActionListener(buttonListener);
add(b);
JButton b1=new JButton("stop");
b1.setSize(70,50);
b1.setLocation(110,290);
b1.setBackground(Color.LIGHT_GRAY);
buttonListener2 = new ButtonListener2();
b1.addActionListener(buttonListener2);
add(b1);
JButton b2=new JButton("play again");
b2.setSize(100,50);
b2.setLocation(250,290);
b2.setBackground(Color.LIGHT_GRAY);
buttonListener3 = new ButtonListener3();
b2.addActionListener(buttonListener3);
add(b2);
score=new JTextField(10);
score.setSize(65,30);
score.setLocation(240,350);
add(score);
l4=new JLabel("score");
l4.setFont(new Font("Comic Sans MS",Font.PLAIN,22));
l4.setSize(300,30);
l4.setLocation(180,350);
add(l4);
l4=new JLabel("totalguess");
l4.setFont(new Font("Comic Sans MS",Font.PLAIN,22));
l4.setSize(300,30);
l4.setLocation(180,390);
add(l4);
totalguess=new JTextField(10);
totalguess.setSize(65,30);
totalguess.setLocation(290,390);
add(totalguess);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
private class ButtonListener implements ActionListener
{
int goodscore=100;
public void actionPerformed(ActionEvent e)
{
int a = Integer.parseInt(t1.getText());
count=count+1;
if(a<rand)
{
 l3.setText(a+" is low");
}
else if(a>rand)
{
 l3.setText(a+" is high");
}
else
{
l3.setText("Congratulations!You guessed correct!!");
if(count<goodscore)
{
goodscore=count;
score.setText(goodscore+"");
}
else {
score.setText("" +goodscore);
}
t1.setEditable(false);
}
t1.requestFocus();
t1.selectAll();
totalguess.setText(count+"");
}
}
private class ButtonListener2 implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
totalguess.setText("");
l3.setText("The correct answer is "+rand+"!!");
t1.setText("");
t1.setEditable(false);
}
}
private class ButtonListener3 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            rand=(int) (Math.random()*100);
            t1.setText("");
            totalguess.setText("");
            l3.setText("Try and guess it !");
            totalguess.setText("");
            count=0;
            t1.setEditable(true);
            t1.requestFocus();
        }
    }
    
}