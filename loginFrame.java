/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package src;
import src.registerakun;

/**
 *
 * @author hilal
 * @server adiyaksa
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class loginFrame extends JFrame implements ActionListener{
    Container container =getContentPane();
    JLabel text= new JLabel("LOGIN SISWA");
    JButton login = new JButton("Login");
    JButton registerButton = new JButton("Register");
    JLabel user= new JLabel("Username: ");
    JLabel pass=new JLabel("Password: ");
    JPasswordField password = new JPasswordField();
    JTextField username= new JTextField();
    JCheckBox checkbox=new JCheckBox("Show Password");
    
    loginFrame(){
        setLayoutManager();
        setLocationAndSize();
        initComponents();
        actionEvents();
    }
    public void setLayoutManager(){
        container.setLayout(null);
    }
    public void setLocationAndSize(){
    user.setBounds(50,150,100,30);
    username.setBounds(150,150,150,30);
    pass.setBounds(50,220,100,30);
    password.setBounds(150,220,150,30);
    login.setBounds(50,300,100,30);
    // Mengimprove code button agar tidak menyatu
    registerButton.setBounds(170,300,100,30);
    checkbox.setBounds(150,260,150,30);
    }
    public void initComponents(){
   container.add(username);
    container.add(user);
    container.add(pass);
    container.add(password);
    container.add(login);
    container.add(registerButton);
    container.add(checkbox);
    }
    public void actionEvents(){
    login.addActionListener(this);
    registerButton.addActionListener(this);
    checkbox.addActionListener(this);
    addWindowListener(new exitclass());
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==login){
           String textNama,textPassword;
           textNama=username.getText();
                   textPassword=password.getText();
            if(textNama.equalsIgnoreCase("Hilal")&&textPassword.equalsIgnoreCase("Hilal")){
                JOptionPane.showMessageDialog(this,"LOGIN SUKSES");
                this.dispose();
                menu menu = new menu();
                 menu.menu();
            }
            else {
             JOptionPane.showMessageDialog(this,"USERNAME/PASSWORD Yang anda masukkan salah");   
            }
        }
        // Reset menjadi tombol register
        if(e.getSource()==registerButton){
          this.dispose();
          System.out.println("Passed Register Button");
          registerakun kontol = new registerakun();
          kontol.registerakun();
                  }
        if(e.getSource()==checkbox){ 
            if(checkbox.isSelected()){
                password.setEchoChar((char)0);
            }
            else {
                password.setEchoChar('*');
            }
        }
    }
    private class exitclass extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e){
            int confirmed=JOptionPane.showConfirmDialog(null,"Are you sure on exit","EXIT",JOptionPane.YES_NO_OPTION);
            if(confirmed==JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }
    }
}