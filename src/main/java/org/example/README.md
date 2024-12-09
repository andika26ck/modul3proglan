Notes App
Notes App adalah aplikasi sederhana untuk mengelola catatan harian. Dengan aplikasi ini, pengguna dapat menambahkan catatan, melihat daftar catatan yang sudah dibuat, serta membaca detail isi dari catatan tertentu. Program ini ditulis dalam bahasa Java dan menggunakan pendekatan berbasis konsol.
Fitur Utama
1.	Tambah Catatan: Pengguna dapat menambahkan catatan baru dengan memasukkan judul dan isi.
2.	Lihat Semua Catatan: Menampilkan daftar semua catatan yang sudah dibuat.
3.	Lihat Detail Catatan: Menampilkan detail isi dari sebuah catatan yang dipilih pengguna.
4.	Keluar dari Aplikasi: Menutup aplikasi dengan aman.
      Teknologi yang Digunakan
      •	Bahasa Pemrograman: Java
      •	IDE yang Disarankan: IntelliJ IDEA atau IDE lain yang mendukung Java
      •	Java Development Kit (JDK): Minimal versi 8
      Cara Menjalankan Proyek
      Prasyarat
1.	Pastikan Java Development Kit (JDK) sudah terinstall di komputer Anda. Anda dapat mengunduhnya dari situs resmi oracle
2.	Unduh atau clone repositori ini ke komputer Anda:
      git clone https://github.com/username/notes-app.git
3.	Buka proyek ini di IntelliJ IDEA atau IDE pilihan Anda.
      Langkah Menjalankan
1.	Navigasikan ke file utama NotesApp.java.
2.	Klik kanan pada file tersebut, lalu pilih Run 'NotesApp.main()'.
3.	Ikuti menu yang ditampilkan di konsol untuk menggunakan aplikasi.
      Struktur Proyek
      project-root
      ├── src
      │   └── org
      │       └── example
      │            ├── NotesApp.java
      │           └── Note.java
      ├── README.md
      └── .gitignore
      Dokumentasi Kode
      Kode telah didokumentasikan menggunakan JavaDoc. Anda dapat membaca dokumentasi langsung di kode sumber atau menghasilkan dokumentasi HTML dengan langkah berikut:
1.	Klik kanan pada proyek di IntelliJ IDEA.
2.	Pilih Generate > JavaDoc.
3.	Ikuti instruksi untuk menghasilkan file HTML.
4.	Buka file HTML yang dihasilkan menggunakan browser.
      Catatan untuk Pengembang
      •	Program menggunakan array list untuk menyimpan catatan selama aplikasi berjalan. Data tidak akan tersimpan jika aplikasi ditutup.
      •	Struktur dan fungsi sudah dirancang untuk modularitas sehingga mudah untuk dikembangkan lebih lanjut.
      Pengembangan Lebih Lanjut
      Beberapa ide untuk fitur baru:
1.	Menyimpan catatan ke file atau database sehingga tetap tersedia setelah aplikasi ditutup.
2.	Menambahkan fitur untuk mengedit atau menghapus catatan.
3.	Membuat antarmuka grafis (GUI) menggunakan JavaFX atau pustaka lainnya.

Kontribusi
Kontribusi terbuka untuk siapa saja! Jika Anda ingin menambahkan fitur atau memperbaiki bug, silakan buat pull request atau buka issue baru di repositori ini.
Lisensi
Proyek ini dilisensikan di bawah MIT License.
