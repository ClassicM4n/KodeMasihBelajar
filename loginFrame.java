/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kegabutanminggu;

/**
 *
 * @author Toshiba
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class loginFrame extends JFrame implements ActionListener{
    Container container =getContentPane();
    JButton login = new JButton("Login");
    JButton reset = new JButton("Reset");
    JLabel user= new JLabel("Username");
    JLabel pass=new JLabel("Password");
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
    reset.setBounds(150,300,100,30);
    checkbox.setBounds(150,260,150,30);
    }
    public void initComponents(){
   container.add(username);
    container.add(user);
    container.add(pass);
    container.add(password);
    container.add(login);
    container.add(reset);
    container.add(checkbox);
    }
    public void actionEvents(){
    login.addActionListener(this);
    reset.addActionListener(this);
    checkbox.addActionListener(this);
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

            }
            else {
             JOptionPane.showMessageDialog(this,"USERNAME/PASSWORD Yang anda masukkan salah");   
            }
        }
        if(e.getSource()==reset){
            username.setText("");
            password.setText("");
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
  
    
}