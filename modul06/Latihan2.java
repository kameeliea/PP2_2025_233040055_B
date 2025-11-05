/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2.modul06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Latihan2 {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Konverter Suhu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(3, 2, 5, 5));

        JLabel labelCelcius = new JLabel("Celcius:");
        JTextField inputCelcius = new JTextField();
        JButton btnKonversi = new JButton("Konversi");
        JLabel labelFahrenheit = new JLabel("Fahrenheit:");
        JLabel hasil = new JLabel("");

        frame.add(labelCelcius);
        frame.add(inputCelcius);
        frame.add(btnKonversi);
        frame.add(new JLabel(""));
        frame.add(labelFahrenheit);
        frame.add(hasil);

        btnKonversi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celcius = Double.parseDouble(inputCelcius.getText());
                    double fahrenheit = (celcius * 9 / 5) + 32;
                    hasil.setText(String.format("%.2f °F", fahrenheit));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Masukkan angka yang benar!");
                }
            }
        });

        frame.setVisible(true);
    }
    
}
