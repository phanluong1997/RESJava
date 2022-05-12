  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class MyFrame extends JFrame{
    JLabel label, label2;
    JPanel panel;
    JTextField text,txt6;
    JButton  btn1,btn2;
//    File f = new File("G:\\fileTest\\login");
    
   String user, pass;
   Scanner scan ;

    public MyFrame() {
       
        panel = new JPanel();
        
        
        label = new JLabel("Nhập tài khoản ");
        label.setBounds(100, 100, 100, 20);
        
        label2 = new JLabel("Nhập mật khẩu");
        label2.setBounds(100, 150, 100, 20);
        
		text = new JTextField(50);
		text.setBounds(200, 100, 200, 20);
                
               
                txt6 = new JTextField(50);
                txt6.setBounds(200, 150, 200, 20);
               
                btn1 =new JButton(" EXIT");
                btn1.setBounds(100, 200, 100, 20);
                
                btn2 =new JButton("LOGIN");
                btn2.setBounds(100, 250, 100, 20);
                
                panel.setLayout(null);
                
		panel.add(label);
                panel.add(label2);
		panel.add(text);
                 
                 panel.add(btn1);
                 panel.add(btn2);
                 
                 this.add(panel);
                
                 panel.add(txt6);
                
                 
     btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
             
                user =  text.getText();
             pass= txt6.getText();
                         if(pass.equals("123") && user.equals("luong") ){
                             System.out.println("đăng nhập thành công");
                             JOptionPane.showMessageDialog(rootPane, "Tài Khoản và Mật Khẩu đúng","Đăng Nhập Thành công", HEIGHT);
                        }
                        else{
                             System.out.println("đăng nhập thất bại");
                             JOptionPane.showMessageDialog(rootPane, "Sai tài khoản hoặc mật khẩu","Đăng nhập thất bại", HEIGHT);
                             
                        }    
                         
            }
        });
   // btn2.addNotify();
     
     btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }    
   
    
}
