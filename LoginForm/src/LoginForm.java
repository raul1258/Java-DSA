import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class LoginGui extends JFrame implements ActionListener
{
    JLabel user=new JLabel("Enter User Name");
    JLabel pass=new JLabel("Enter User Password");
    JTextField usertxt=new JTextField();
    JTextField passtxt=new JPasswordField();
    JButton btn=new JButton("Login");
    Container c;
    JLabel msg=new JLabel("Display Message");
    LoginGui()
    {
        c=this.getContentPane();
        c.setLayout(null);
        Font font=new Font("Arial",Font.BOLD,15);
        user.setFont(font);
        pass.setFont(font);
        user.setBounds(100,50,250,40);
        pass.setBounds(100,100,250,40);
        usertxt.setBounds(350,50,250,30);
        passtxt.setBounds(350,100,250,30);
        btn.setBounds(250,200,200,30);
        btn.addActionListener(this);
        c.add(btn);
        c.add(usertxt);
        c.add(passtxt);
        c.add(user);
        c.add(pass);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn)
        {
            String username=usertxt.getText();
            String password=passtxt.getText();

            if((username.equals("hum")) && password.equals("tum"))
            {
                c.setBackground(Color.DARK_GRAY);
                msg.setBounds(175,300,400,30);
                msg.setText("Login Completed");
                c.add(msg);
            }else
            {
                c.setBackground(Color.RED);
                msg.setBounds(175,300,400,30);
                msg.setText("Either user name OR password is incorrect");
                c.add(msg);
            }

        }
    }
}



class LoginForm {
    public static void main(String[] args) {
    LoginGui f=new LoginGui();
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setBounds(100,50,700,600);
    f.setResizable(false);
    f.setTitle("Login Form");
    }
}
