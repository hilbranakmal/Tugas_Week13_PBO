import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class SimpleImageViewer extends JFrame {
    
    private JLabel imageLabel;
    private JButton openButton;

    public SimpleImageViewer() {
        super("Aplikasi Image Viewer");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Area untuk menampilkan gambar (tengah)
        imageLabel = new JLabel("Belum ada gambar", SwingConstants.CENTER);
        add(new JScrollPane(imageLabel), BorderLayout.CENTER);

        // Tombol untuk buka gambar (bawah)
        openButton = new JButton("Buka Gambar");
        add(openButton, BorderLayout.SOUTH);

        // Aksi tombol
        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bukaFileGambar();
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void bukaFileGambar() {
        JFileChooser fileChooser = new JFileChooser();
        
        // Membuka dialog pilih file
        int result = fileChooser.showOpenDialog(this);
        
        // Jika user memilih file (klik Open)
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            
            // Membuat icon gambar
            ImageIcon icon = new ImageIcon(path);
            
            // Opsional: Kode ini untuk resize gambar agar pas di layar
            // Jika tidak ingin resize, hapus bagian Image image s/d new ImageIcon(newImg)
            Image image = icon.getImage(); 
            Image newImg = image.getScaledInstance(500, 400,  java.awt.Image.SCALE_SMOOTH); 
            icon = new ImageIcon(newImg); 
            
            // Menempelkan gambar ke label
            imageLabel.setText(""); // Hapus teks "Belum ada gambar"
            imageLabel.setIcon(icon);
        }
    }

    public static void main(String[] args) {
        new SimpleImageViewer();
    }
}