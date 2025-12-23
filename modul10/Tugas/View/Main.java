/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2.modul10.Tugas.View;

import id.ac.unpas.pp2.modul10.Tugas.Controller.MahasiswaAppController;
import id.ac.unpas.pp2.modul10.Tugas.Model.MahasiswaAppModel;
import id.ac.unpas.pp2.modul10.Tugas.View.MahasiswaAppView;
import javax.swing.SwingUtilities;
import javax.swing.text.View;

public class Main {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MahasiswaAppView view = new MahasiswaAppView();
            MahasiswaAppModel model = new MahasiswaAppModel();
            new MahasiswaAppController(view, model);
            view.setVisible(true);
        });
    }
}