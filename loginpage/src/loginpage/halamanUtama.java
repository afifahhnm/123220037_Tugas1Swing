/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpage;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


class frameL extends JFrame {
    JLabel tulisan = new JLabel(" Welcome,[Mr./Mrs] [Username] ");
    JLabel tulisann = new JLabel(" Tentukan panjang, lebar, dan tinggi untuk menghitung Balok ");      
    JLabel labelPanjang = new JLabel(" Panjang ");
    JLabel labelLebar = new JLabel(" Lebar ");
    JLabel labelTinggi = new JLabel(" Tinggi ");
    JTextField panjang = new JTextField();
    JTextField lebar = new JTextField();
    JTextField tinggi = new JTextField();
    JButton Hitung = new JButton(" Hitung ");
    JButton reset = new JButton(" Reset ");
    JLabel labelHasil = new JLabel(" Hasil ");
    JLabel luasPersegi = new JLabel(" luas Persegi ");
    JLabel KelilingPersegi = new JLabel(" Keliling Persegi ");
    JLabel volumeBalok = new JLabel(" Volume Balok ");
    JLabel LuasPBalok = new JLabel(" Luas Permukaan Balok ");
    JLabel hasilLP = new JLabel(" [Hasil berupa angka] ");
    JLabel hasilKP = new JLabel(" [Hasil berupa angka] ");
    JLabel hasilVB = new JLabel(" [Hasil berupa angka] ");
    JLabel hasilLPB = new JLabel(" [Hasil berupa angka] ");

 frameL() {
     
        setTitle(" Halaman Utama ");
        setSize(720, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        tulisan.setFont(new Font("Arial", Font.PLAIN, 24));
        tulisan.setBounds(26, 30, 500, 30); // Menyesuaikan ukuran dan posisi
        add(tulisan);
        
        tulisann.setFont(new Font("Arial", Font.PLAIN, 15));
        tulisann.setBounds(30, 60, 800, 24);
        add(tulisann);
        
        panjang.setBounds(140, 100, 400, 32);
        add(panjang);
        
        lebar.setBounds(140, 160, 400, 32);
        add(lebar);
        
        tinggi.setBounds(140, 220, 400, 32);
        add(tinggi);

        labelPanjang.setBounds(28, 100, 100, 32);
        labelPanjang.setFont(new Font("Arial", Font.PLAIN, 14));
        add(labelPanjang);
        
        labelLebar.setBounds(28, 160, 100, 32);
        labelLebar.setFont(new Font("Arial", Font.PLAIN, 14));
        add(labelLebar);
        
        labelTinggi.setBounds(28, 220, 100, 32);
        labelTinggi.setFont(new Font("Arial", Font.PLAIN, 14));
        add(labelTinggi);

        Hitung.setBackground(Color.WHITE);
        Hitung.setBounds(30, 280, 600, 32);
        Hitung.setFont(new Font("Arial", Font.PLAIN, 14));
        add(Hitung);
        
        reset.setBackground(Color.WHITE);
        reset.setBounds(30, 330, 600, 32);
        reset.setFont(new Font("Arial", Font.PLAIN, 14));
        add(reset);
     
        labelHasil.setBounds(315, 380, 100, 32);
        labelHasil.setFont(new Font("Arial", Font.PLAIN, 14));
        add(labelHasil);
        
        luasPersegi.setBounds(28, 410, 400, 32);
        luasPersegi.setFont(new Font("Arial", Font.PLAIN, 14));
        add(luasPersegi);
        
        KelilingPersegi.setBounds(28, 450, 400, 32);
        KelilingPersegi.setFont(new Font("Arial", Font.PLAIN, 14));
        add(KelilingPersegi);
        
        volumeBalok.setBounds(28, 490, 400, 32);
        volumeBalok.setFont(new Font("Arial", Font.PLAIN, 14));
        add(volumeBalok);
        
        LuasPBalok.setBounds(28, 530, 400, 32);
        LuasPBalok.setFont(new Font("Arial", Font.PLAIN, 14));
        add(LuasPBalok);
        
        hasilLP.setBounds(270, 410, 300, 32);
        hasilLP.setFont(new Font("Arial", Font.PLAIN, 14));
        add(hasilLP);
        
        hasilKP.setBounds(270, 450, 300, 32);
        hasilKP.setFont(new Font("Arial", Font.PLAIN, 14));
        add(hasilKP);
        
        hasilVB.setBounds(270, 490, 300, 32);
        hasilVB.setFont(new Font("Arial", Font.PLAIN, 14));
        add(hasilVB);
        
        hasilLPB.setBounds(270, 530, 300, 32);
        hasilLPB.setFont(new Font("Arial", Font.PLAIN, 14));
        add(hasilLPB);
        
        
        setVisible(true);
    }
}

public class halamanUtama{
    public static void main(String[] args) {
 
        frameL kotakFrame = new frameL();
    }
}