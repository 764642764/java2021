package java2021;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class A extends JFrame {
    public A()
    {
    	this.setTitle("登录界面");
    	this.setSize(600,600);
    	this.setLocationRelativeTo(null);
    	this.setLayout(null);
    	JLabel lblname=new JLabel("用户名");
    	JTextField txtname=new JTextField(10);
    	JLabel lblpwd=new JLabel("密码");
    	JTextField txtpwd=new JTextField(10);
    	JButton btn=new JButton("登录");
    	lblname.setBounds(100,100,80,60);
    	lblpwd.setBounds(100,200,80,60);
    	txtname.setBounds(350,100,200,60);
    	txtpwd.setBounds(350,200,200,60);
    	btn.setBounds(200,300,100,60);
    	add(lblname);
    	add(lblpwd);
    	add(txtname);
    	add(txtpwd);
    	add(btn);
    	
    }
    public static void main(String[] args)
    {
    	A a=new A();
    	a.setVisible(true);
    }
}
