# Tugas GUI

**Nama:** Muhammad Hilbran Akmal Abrar  
**NRP:** 5025241052  
**Mata Kuliah:** Pemrograman Berbasis Objek

---

## 1. Program Login (FormLogin)

### A. Fungsi Program
Program ini berfungsi sebagai simulasi sistem keamanan sederhana (security gate). Aplikasi ini bertugas memverifikasi hak akses pengguna dengan membandingkan input data (username) dan kunci rahasia (password) yang dimasukkan terhadap data yang tersimpan di dalam kode. Jika data cocok, sistem memberikan umpan balik sukses; jika salah, sistem menolak akses.

### B. Cara Kerja
1. Program membangun antarmuka visual (`JFrame`) dan menempatkan label serta kotak isian.
2. Pengguna memasukkan teks pada kolom Username dan Password (karakter password otomatis diubah menjadi titik oleh `JPasswordField`).
3. Program "menunggu" di tombol Login. Saat tombol diklik, `ActionListener` aktif.
4. Program mengambil data String dari kedua kolom input dan melakukan validasi logika.
5. Hasil validasi (Berhasil/Gagal) ditampilkan langsung menggunakan jendela pop-up (`JOptionPane`).

---

## 2. Program Image Viewer (SimpleImageViewer)

### A. Fungsi Program
Program ini berfungsi sebagai galeri penampil citra digital sederhana. Aplikasi ini menjembatani antarmuka pengguna dengan sistem penyimpanan lokal komputer, memungkinkan pengguna untuk mencari, memilih, dan memuat file gambar (seperti .jpg atau .png) untuk ditampilkan secara grafis di dalam jendela aplikasi.

### B. Cara Kerja
1. Program menyiapkan jendela dengan tata letak `BorderLayout`, menyediakan area kosong di tengah untuk gambar dan tombol di bagian bawah.
2. Saat tombol "Buka Gambar" diklik, program memanggil `JFileChooser` untuk membuka jendela explorer bawaan sistem operasi.
3. Setelah pengguna memilih file dan menekan "Open", program menangkap alamat lengkap (absolute path) dari file tersebut.
4. File tersebut dikonversi menjadi objek `ImageIcon` dan ditampilkan pada komponen `JLabel` di tengah layar.

---

## Penjelasan Teknis

Berikut adalah penjelasan komponen Java Swing yang digunakan dalam tugas ini:

* **JFrame**: Container Utama. Ini adalah rangka dasar aplikasi window (jendela). Berfungsi sebagai wadah tempat semua komponen lain diletakkan.
* **JLabel**: Komponen Penampil Pasif. Digunakan untuk menampilkan teks statis (label input) atau sebagai kanvas untuk meletakkan gambar (`ImageIcon`).
* **JPasswordField**: Input Teks Terenkripsi Visual. Komponen ini secara otomatis menyamarkan karakter yang diketik menjadi simbol (`*` atau `●`) untuk menjaga privasi password.
* **JButton**: Pemicu Aksi. Komponen interaktif utama yang dipasangi `ActionListener` agar program tahu kapan harus mengeksekusi kode logika.
* **JOptionPane**: Jendela Dialog Instan. Class utilitas untuk memunculkan pop-up notifikasi standar (seperti "Login Berhasil") tanpa perlu mendesain jendela baru.
* **JFileChooser**: Manajer Seleksi File. Komponen yang menyediakan antarmuka navigasi folder standar untuk mengakses direktori harddisk pengguna.
* **ImageIcon**: Objek Representasi Gambar. Bertugas mengubah file gambar mentah (.jpg/.png) menjadi objek icon yang bisa dirender oleh komponen Swing.

---

## Hasil

<img width="618" height="251" alt="image" src="https://github.com/user-attachments/assets/9e9e4274-4bdf-422e-8e3c-dc349117b366" /> <br>

Form Login <br>
<img width="446" height="340" alt="image" src="https://github.com/user-attachments/assets/ebfd4241-d953-4350-8fb1-6c39c4650e3b" /> <br>

SimpleImageViewer<br>
<img width="714" height="570" alt="image" src="https://github.com/user-attachments/assets/e3493b9e-4486-4846-a3e7-c101d68ae2d0" />


