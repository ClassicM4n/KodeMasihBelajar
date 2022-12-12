/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;


/**
 *
 * @author hilal
 * @server adiyaksa
 */
import javax.swing.*;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class registerakun extends JFrame implements ActionListener{
    Container container =getContentPane();
    JLabel text= new JLabel("REGISTER SISWA");
    JButton daftar = new JButton("Daftar");
    JButton kembali = new JButton("Kembali");
    JLabel user= new JLabel("Username: ");
    JLabel pass=new JLabel("Password: ");
    JLabel pass2=new JLabel("Konfirmasi: ");
    JPasswordField password = new JPasswordField();
    JPasswordField password2 = new JPasswordField();
    JTextField username= new JTextField();
    JCheckBox checkbox=new JCheckBox("Show Password");

    
    public void registerakun(){
        setLayoutManager();
        setLocationAndSize();
        initComponents();
        actionEvents();
    }
    public void setLayoutManager(){
        container.setLayout(null);
    }
    public void setLocationAndSize(){
    text.setBounds(75,-40, 300, 300);
    user.setBounds(50,160,100,30);
    username.setBounds(150,160,150,30);
    pass.setBounds(50,220,100,30);
    pass2.setBounds(50,280,100,30);
    password.setBounds(150,220,150,30);
    password2.setBounds(150,280,150,30);
    // Daftar
    daftar.setBounds(50,350,100,30);
    // Mengimprove code button agar tidak menyatu
    kembali.setBounds(170,350,100,30);
    text.setFont( new Font("",Font.PLAIN,22));
    text.setForeground(Color.BLUE);
    }
    public void initComponents(){
    container.add(text);
    container.add(username);
    container.add(user);
    container.add(pass);
    container.add(password);
    container.add(pass2);
    container.add(password2);
    container.add(daftar);
    container.add(kembali);
    }
    public void actionEvents(){
    daftar.addActionListener(this);
    kembali.addActionListener(this);
    checkbox.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==daftar){
           String textNama,textPassword, textPassword2;
           textNama=username.getText();
           textPassword=password.getText();
            textPassword2=password2.getText();
            // Mengkonfirmasi password
            if(textNama.equalsIgnoreCase("") || textPassword.equalsIgnoreCase("") || textPassword2.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(this,"Sebagain Input ada yang kosong !");
                }else{
                    if(textPassword.equalsIgnoreCase(textPassword2) == textPassword2.equalsIgnoreCase(textPassword2)){
                        System.out.println("Hihihahahah");
                        // if(textNama.equalsIgnoreCase("Hilal")&&textPassword.equalsIgnoreCase("Hilal")){
                        //     JOptionPane.showMessageDialog(this,"LOGIN SUKSES");
                        //     this.dispose();
                        //     menu menu = new menu();
                        //     menu.menu();
                        // }
                        // else{
                        //     JOptionPane.showMessageDialog(this,"USERNAME/PASSWORD Yang anda masukkan salah");   
                        // }
                    }else{
                        JOptionPane.showMessageDialog(this,"Konfirmasi Password anda salah !");   
                }
            }
        }
        // Reset menjadi tombol register
        if(e.getSource()==kembali){
          System.out.println("Kembali Ke Login...");
          this.dispose();
          loginFrame frame = new loginFrame();
          frame.setTitle("Login");
          frame.setVisible(true);
          frame.setBounds(0,0,370,600);
          frame.setResizable(false);
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