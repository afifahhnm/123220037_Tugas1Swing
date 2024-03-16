/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasSwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class halamanLogin extends JFrame implements ActionListener{
    JLabel intro = new JLabel(" Selamat Datang! ");
    JLabel tulis = new JLabel(" Silahkan masuk untuk melanjutkan. ");      
    JTextField UserName = new JTextField();
    JTextField Password = new JTextField();
    JLabel labelUserName = new JLabel(" Username ");
    JLabel labelPassword = new JLabel(" Password ");
    JLabel labeljeniskelamin = new JLabel(" Jenis Kelamin ");
    JRadioButton pilihLaki = new JRadioButton(" Laki-laki ");
    JRadioButton pilihPerempuan = new JRadioButton(" Perempuan ");
    JButton tombolLogin = new JButton(" Login ");

 halamanLogin() {
     
        setTitle(" Login Page ");
        setSize(720, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
         
        add(intro);
        add(tulis);
        add(UserName);
        add(Password);
        add(labelUserName);
        add(labelPassword);
        add(labeljeniskelamin);
        add(pilihLaki);
        add(pilihPerempuan);
        add(tombolLogin);
        
        intro.setFont(new Font("Arial", Font.BOLD, 24));
        tulis.setFont(new Font("Arial", Font.BOLD, 15));
        
        labelUserName.setFont(new Font("Arial", Font.BOLD, 14));
        labelPassword.setFont(new Font("Arial", Font.BOLD, 14));
        labeljeniskelamin.setFont(new Font("Arial", Font.BOLD, 14));
           
        pilihLaki.setFont(new Font("Arial", Font.BOLD, 14));
        pilihPerempuan.setFont(new Font("Arial", Font.BOLD, 14));
        tombolLogin.setFont(new Font("Arial", Font.BOLD, 14));
    
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(pilihLaki);
        pilihJenisKelamin.add(pilihPerempuan);

        intro.setBounds(26, 30, 500, 30);
        tulis.setBounds(30, 60, 600, 24);
        UserName.setBounds(30, 130, 600, 32);
        Password.setBounds(30, 210, 600, 32);
        
        labelUserName.setBounds(28, 100, 100, 32);
        labelPassword.setBounds(28, 180, 100, 32);
        labeljeniskelamin.setBounds(30, 250, 200, 32);
        
        pilihLaki.setBounds(30, 275, 160, 32);
        pilihPerempuan.setBounds(340, 275, 160, 32);
        
        tombolLogin.setBounds(30, 320, 600, 32);
        tombolLogin.setBackground(Color.WHITE);
        
        tombolLogin.addActionListener(this);
         
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String username = UserName.getText();
            String password = Password.getText();
      
            String jenisKelamin = pilihLaki.isSelected() ? "l" : "p";
            
          
            if (username.isEmpty()) {
                throw new Exception(" Username masih kosong! ");
            }
            else if (password.isEmpty()) {
                throw new Exception(" Password masih kosong! ");
            }
            
            new halamanUtama(username, jenisKelamin);
            this.dispose();
            
        } catch (Exception error) {
           
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    } 
}
 



