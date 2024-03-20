import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUI_utama extends JFrame implements ActionListener {
   String user = "tukang_083";
   String pass = "tukang_083";
   private JLabel lUsername;
   private JTextField fUsername;
   private JLabel lPassword;
   private JTextField fPassword;
   private JButton bLogin;
   private JButton bBatal;
   private JLabel status;

   public GUI_utama() {
        lUsername = new JLabel("Username ");
        fUsername = new JTextField(20);
        lPassword = new JLabel("Password ");
        fPassword = new JTextField(20);
        bLogin = new JButton("Login");
        bBatal = new JButton("Batal");
        status = new JLabel ("Status : Silahkan Login");
        bLogin.addActionListener(this);
        bBatal.addActionListener(this);

	setLayout(null);
        add(lUsername);
        add(fUsername);
        add(lPassword);
        add(fPassword);
        add(bLogin);
        add(bBatal);
        add(status);
        
        lUsername.setBounds (10, 10, 120, 20);
        fUsername.setBounds (130, 10, 150, 20);
        lPassword.setBounds (10, 30, 120, 20);
        fPassword.setBounds (130, 30, 150, 20);
        bLogin.setBounds (10, 50, 100, 20);
        bBatal.setBounds (130, 50, 100, 20);
        status.setBounds (80, 90, 150, 20);
        
        setTitle("Login");
        setResizable(false);
	setDefaultCloseOperation(3);
	setSize(300,150);
	setVisible(true);
   }
   public void actionPerformed(ActionEvent e){
       if(e.getSource() == bLogin){
           //Menyimpan username dan password yang diinput
           String username = fUsername.getText();
           String password = fPassword.getText();
           
           //Membandingkan username dan password yang sudah disimpan apakah sama
           //dengan username dan pass yang ditentukan
           if(username.equals(user) && password.equals(pass)){
               //jika sama maka statusnya menjadi login berhasil
               status.setText("Status : Login Berhasil");
               Menu2 m2 = new Menu2 ();
               m2.setup();
           } else {
               //jika tidak sama maka statusnya menjadi login gagal
               status.setText("Status : Login Gagal");
           }
           //jika menekan tombol batal
       } else if (e.getSource() == bBatal){
           status.setText("Status : Login Batal");
       }
   }
}



class Kuis_PBO {
   public static void main(String[] args) {
	new GUI_utama();
   }
}
