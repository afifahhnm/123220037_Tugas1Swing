/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasSwing;

import BangunDatar.Balok;
import BangunDatar.Persegi;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class halamanUtama extends JFrame implements ActionListener{
    
    JLabel tulisan = new JLabel(" Welcome,[Mr./Mrs] [Username] ");
    JLabel tulisann = new JLabel(" Tentukan panjang, lebar, dan tinggi untuk menghitung Balok ");      
    JLabel labelPanjang = new JLabel(" Panjang ");
    JLabel labelLebar = new JLabel(" Lebar ");
    JLabel labelTinggi = new JLabel(" Tinggi ");
    JLabel labelHasil = new JLabel(" Hasil ");
    JTextField Panjang = new JTextField();
    JTextField Lebar = new JTextField();
    JTextField Tinggi = new JTextField();
    JButton Hitung = new JButton(" Hitung ");
    JButton reset = new JButton(" Reset ");
    JLabel labelluasPersegi = new JLabel(" Luas Persegi ");
    JLabel labelKelilingPersegi = new JLabel(" Keliling Persegi ");
    JLabel labelVolumeBalok = new JLabel(" Volume Balok ");
    JLabel labelLuasPBalok = new JLabel(" Luas Permukaan Balok ");
    JLabel LuasPersegi = new JLabel(" [Hasil berupa angka] ");
    JLabel KelilingPersegi = new JLabel(" [Hasil berupa angka] ");
    JLabel VolumeBalok = new JLabel(" [Hasil berupa angka] ");
    JLabel PermukaanBalok = new JLabel(" [Hasil berupa angka] ");

 halamanUtama(String username, String jenisKelamin) {
       
        String panggilan = (jenisKelamin == "l") ? "Mr. " : "Mrs. ";
        
        setTitle(" Halaman Utama ");
        setSize(720, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(tulisan);
        add(tulisann);
        
        add(Panjang);
        add(Lebar);
        add(Tinggi);
        
        add(labelPanjang);
        add(labelLebar);
        add(labelTinggi);
        add(labelHasil);
        
        add(Hitung);
        add(reset);
       
        add(labelluasPersegi);
        add(labelKelilingPersegi);
        add(labelVolumeBalok);
        add(labelLuasPBalok);
        
        add(LuasPersegi);
        add(KelilingPersegi);
        add(VolumeBalok);
        add(PermukaanBalok);
        
        Hitung.setBackground(Color.WHITE);
        reset.setBackground(Color.WHITE);
        
        tulisan.setFont(new Font("Arial", Font.BOLD, 24));
        tulisann.setFont(new Font("Arial", Font.BOLD, 15));
        labelPanjang.setFont(new Font("Arial", Font.BOLD, 14)); 
        labelLebar.setFont(new Font("Arial", Font.BOLD, 14));
        labelTinggi.setFont(new Font("Arial", Font.BOLD, 14));
        labelHasil.setFont(new Font("Arial", Font.BOLD, 14));
        
        Hitung.setFont(new Font("Arial", Font.BOLD, 14));
        reset.setFont(new Font("Arial", Font.BOLD, 14));
     
        labelluasPersegi.setFont(new Font("Arial", Font.BOLD, 14)); 
        labelKelilingPersegi.setFont(new Font("Arial", Font.BOLD, 14));
        labelVolumeBalok.setFont(new Font("Arial", Font.BOLD, 14));
        labelLuasPBalok.setFont(new Font("Arial", Font.BOLD, 14));
      
        LuasPersegi.setFont(new Font("Arial", Font.BOLD, 14));
        KelilingPersegi.setFont(new Font("Arial", Font.BOLD, 14));
        VolumeBalok.setFont(new Font("Arial", Font.BOLD, 14));
        PermukaanBalok.setFont(new Font("Arial", Font.BOLD, 14));
              
        tulisan.setText(" Welcome, " + panggilan + username );
        tulisan.setBounds(26, 30, 500, 30);
        tulisann.setBounds(30, 60, 800, 24);
        
        Panjang.setBounds(140, 100, 400, 32);
        Lebar.setBounds(140, 160, 400, 32);
        Tinggi.setBounds(140, 220, 400, 32);
        
        labelPanjang.setBounds(28, 100, 100, 32);
        labelLebar.setBounds(28, 160, 100, 32);
        labelTinggi.setBounds(28, 220, 100, 32);
        labelHasil.setBounds(310, 370, 100, 32);
        
        Hitung.setBounds(30, 280, 600, 32);
        reset.setBounds(30, 330, 600, 32);
        
        labelluasPersegi.setBounds(28, 410, 400, 32);
        labelKelilingPersegi.setBounds(28, 450, 400, 32);
        labelVolumeBalok.setBounds(28, 490, 400, 32);
        labelLuasPBalok.setBounds(28, 530, 400, 32);
         
        LuasPersegi.setBounds(270, 410, 300, 32);
        KelilingPersegi.setBounds(270, 450, 300, 32);
        VolumeBalok.setBounds(270, 490, 300, 32);
        PermukaanBalok.setBounds(270, 530, 300, 32);
  
        Hitung.addActionListener(this);
        reset.addActionListener(this);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Hitung) {
            double panjang = Double.parseDouble(Panjang.getText());
            double lebar = Double.parseDouble(Lebar.getText());
            double tinggi = Double.parseDouble(Tinggi.getText());

            Persegi bangun1 = new Persegi(panjang, lebar);
            Balok bangun2 = new Balok(panjang, lebar, tinggi);
            
            String hasilLuasPersegi = String.valueOf(bangun1.Luas());
            String hasilKelilingPersegi = String.valueOf(bangun1.Keliling());
            String hasilvolumebalok = String.valueOf(bangun2.Volume());
            String hasilLuaspermukaan = String.valueOf(bangun2.LuasPermukaan());

            LuasPersegi.setText(hasilLuasPersegi);
            KelilingPersegi.setText(hasilKelilingPersegi);
            VolumeBalok.setText(hasilvolumebalok);
            PermukaanBalok.setText(hasilLuaspermukaan);
            
        } else if (e.getSource() == reset) {
            
            Panjang.setText("");
            Lebar.setText(""); 
            Tinggi.setText(""); 
            LuasPersegi.setText(" [Hasil berupa angka] "); 
            KelilingPersegi.setText(" [Hasil berupa angka] ");
            VolumeBalok.setText(" [Hasil berupa angka] ");
            PermukaanBalok.setText(" [Hasil berupa angka] "); 
        }
    }
}