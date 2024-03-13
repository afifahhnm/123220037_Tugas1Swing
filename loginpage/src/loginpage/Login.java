/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginpage;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


class KotakFrame extends JFrame {
    JLabel intro = new JLabel(" Selamat Datang! ");
    JLabel tulis = new JLabel(" Silahkan masuk untuk melanjutkan. ");      
    JTextField userName = new JTextField();
    JTextField password = new JTextField();
    JLabel labelUserName = new JLabel(" Username ");
    JLabel labelPassword = new JLabel(" Password ");
    JLabel labeljeniskelamin = new JLabel(" Jenis Kelamin ");
    JRadioButton pilihLaki = new JRadioButton(" Laki-laki ");
    JRadioButton pilihPerempuan = new JRadioButton(" Perempuan ");
    JButton tombolLogin = new JButton(" Login ");

 KotakFrame() {
     
        setTitle(" Login Page ");
        setSize(720, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        intro.setFont(new Font("Arial", Font.PLAIN, 24));
        intro.setBounds(26, 30, 500, 30); // Menyesuaikan ukuran dan posisi
        add(intro);
        
        tulis.setFont(new Font("Arial", Font.PLAIN, 15));
        tulis.setBounds(30, 60, 600, 24);
        add(tulis);

        userName.setBounds(30, 130, 600, 32);
        add(userName);
        
        password.setBounds(30, 210, 600, 32);
        add(password);

        labelUserName.setBounds(28, 100, 100, 32);
        labelUserName.setFont(new Font("Arial", Font.PLAIN, 14));
        add(labelUserName);
        
        labelPassword.setBounds(28, 180, 100, 32);
        labelPassword.setFont(new Font("Arial", Font.PLAIN, 14));
        add(labelPassword);

        labeljeniskelamin.setBounds(30, 250, 100, 32);
        labeljeniskelamin.setFont(new Font("Arial", Font.PLAIN, 14));
        add(labeljeniskelamin);
        
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(pilihLaki);
        pilihJenisKelamin.add(pilihPerempuan);

        pilihLaki.setBounds(30, 275, 160, 32);
        pilihLaki.setFont(new Font("Arial", Font.PLAIN, 14));
        add(pilihLaki);

        pilihPerempuan.setBounds(340, 275, 160, 32);
        pilihPerempuan.setFont(new Font("Arial", Font.PLAIN, 14));
        add(pilihPerempuan);
        
        tombolLogin.setBackground(Color.WHITE);
        tombolLogin.setBounds(30, 320, 600, 32);
        tombolLogin.setFont(new Font("Arial", Font.PLAIN, 14));
        add(tombolLogin);
        
        setVisible(true);
    }
}

public class Login {
    public static void main(String[] args) {
 
        KotakFrame kotakFrame = new KotakFrame();
    }
}
