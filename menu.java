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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class menu extends JFrame implements ActionListener{
   Container container = getContentPane();
   JButton menu1=new JButton("CEK PROFIL");
   JButton menu2=new JButton("BANGUN DATAR");
   JLabel text= new JLabel("MENU APLIKASI");
   JButton exit=new JButton("EXIT");
   JButton menu3=new JButton("INPUT DATA SISWA");
    public void menu(){
        LayoutManager();
        LocationAndSize();        
        components();
        actionevents();
    }
    public void LayoutManager(){
        setResizable(true);
        setVisible(true);
        setTitle("TES");
        setBounds(10,10,400,200);
    container.setLayout(null);
    }
    public void components(){
    container.add(menu1);
    container.add(menu2);
    container.add(menu3);
    container.add(exit);
    container.add(text);
    }
    public void LocationAndSize(){
    menu1.setBounds(40,40,150,50);
    menu2.setBounds(190,40,150,50);
    exit.setBounds(190,80,150,50);
    text.setBounds(125,0,150,50);
    menu3.setBounds(40,80,150,50);
    }
    public void actionevents(){
    menu1.addActionListener(this);
    menu2.addActionListener(this);
    menu3.addActionListener(this);
    exit.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==menu1){
            JOptionPane.showMessageDialog(this,"TES1");
            }
        if(e.getSource()==menu2){
            JOptionPane.showMessageDialog(this,"TES");
        }
        if(e.getSource()==menu3){
            JOptionPane.showMessageDialog(this, "PROJECT");
        }
        if(e.getSource()==exit){
           int keluar=JOptionPane.showConfirmDialog(this,"yakin ingin keluar?","Are you sure on exit",JOptionPane.YES_NO_OPTION);
            if(keluar==JOptionPane.YES_OPTION){
                System.exit(0);
            }  
        }
    }
}


