import javax.swing.*;
import java.awt.event.*;

public class FormLogin extends JFrame {
    
    // Deklarasi komponen
    private JLabel labelUser, labelPass;
    private JTextField textUser;
    private JPasswordField textPass;
    private JButton buttonLogin;

    public FormLogin() {
        // Judul Jendela
        super("Aplikasi Login Sederhana");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Kita atur posisi manual (koordinat)

        // 1. Setup Label dan Text Field Username
        labelUser = new JLabel("Username:");
        labelUser.setBounds(30, 30, 80, 25); // x, y, width, height
        add(labelUser);

        textUser = new JTextField(20);
        textUser.setBounds(110, 30, 180, 25);
        add(textUser);

        // 2. Setup Label dan Password Field
        labelPass = new JLabel("Password:");
        labelPass.setBounds(30, 70, 80, 25);
        add(labelPass);

        textPass = new JPasswordField(20);
        textPass.setBounds(110, 70, 180, 25);
        add(textPass);

        // 3. Setup Tombol Login
        buttonLogin = new JButton("Login");
        buttonLogin.setBounds(110, 110, 100, 25);
        add(buttonLogin);

        // 4. Aksi ketika tombol diklik
        buttonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = textUser.getText();
                String pass = new String(textPass.getPassword());

                // Contoh validasi sederhana
                if (user.equals("admin") && pass.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Login Berhasil!");
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau Password Salah!");
                }
            }
        });
        
        // Menampilkan frame di tengah layar
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    // Main method untuk menjalankan di BlueJ
    public static void main(String[] args) {
        new FormLogin();
    }
}