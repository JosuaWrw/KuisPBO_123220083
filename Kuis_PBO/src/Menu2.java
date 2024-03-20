import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu2 extends JFrame implements ActionListener{
   private JLabel lAlas;
   private JTextField fAlas;
   private JLabel lTinggi;
   private JTextField fTinggi;
   private JButton bHitung;
   private JLabel lHitung;
   
   public Menu2(){
       lAlas = new JLabel("Alas ");
       fAlas = new JTextField(20);
       lTinggi = new JLabel("Tinggi ");
       fTinggi = new JTextField(20);
       bHitung = new JButton ("Hitung");
       lHitung = new JLabel ("Sisi Miring : - ");
       bHitung.addActionListener(this);
       
   }
   
   public void setup(){
       setLayout (null);
       add(lAlas);
       add(fAlas);
       add(lTinggi);
       add(fTinggi);
       add(bHitung);
       add(lHitung);
       
       lAlas.setBounds (10, 10, 100, 20);
       fAlas.setBounds (120, 10, 100, 20);
       lTinggi.setBounds (10, 30, 100, 20);
       fTinggi.setBounds (120, 30, 100, 20);
       bHitung.setBounds (10, 50, 100, 20);
       lHitung.setBounds (120, 50, 150, 20);
       
       setTitle("Menu 2");
       setResizable(false);
       setDefaultCloseOperation(3);
       setSize(300,150);
       setVisible(true);
   }
   public void actionPerformed(ActionEvent e){
       if(e.getSource() == bHitung){
           // mengubah tipe data string yang diinput ke int dan menyimpannya
           int alas = Integer.parseInt(fAlas.getText());
           int tinggi = Integer.parseInt(fTinggi.getText());
           double Hasil = alas * alas + tinggi * tinggi;
           //Menghitung akar dari Hasil yang sudah didapat
           double sMiring = Math.sqrt(Hasil);
           
           lHitung.setText("Sisi Miring :  " + sMiring);
       }
   }
}
