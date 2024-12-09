package org.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Aplikasi untuk mengelola catatan harian.
 * Pengguna dapat menambah, melihat daftar, dan melihat detail catatan.
 */
public class NotesApp {

    /**
     * Daftar catatan yang disimpan dalam aplikasi.
     */
    static ArrayList<Note> notes = new ArrayList<>();

    /**
     * Scanner untuk membaca input dari pengguna.
     */
    static Scanner scanner = new Scanner(System.in);

    /**
     * Metode utama untuk menjalankan aplikasi catatan.
     * Menampilkan menu utama dan menangani pilihan pengguna.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Catatan");
            System.out.println("2. Lihat Semua Catatan");
            System.out.println("3. Lihat Detail Catatan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addNote();
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    viewNoteDetails();
                    break;
                case 4:
                    System.out.println("Keluar dari aplikasi. Sampai jumpa!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    /**
     * Menambahkan catatan baru ke daftar.
     * Pengguna diminta untuk memasukkan judul dan isi catatan.
     */
    static void addNote() {
        System.out.print("Masukkan judul catatan: ");
        String title = scanner.nextLine();
        System.out.print("Masukkan isi catatan: ");
        String content = scanner.nextLine();
        notes.add(new Note(title, content));
        System.out.println("Catatan berhasil ditambahkan!");
    }

    /**
     * Menampilkan semua catatan yang ada dalam daftar.
     * Jika tidak ada catatan, akan menampilkan pesan bahwa daftar kosong.
     */
    static void viewNotes() {
        if (notes.isEmpty()) {
            System.out.println("Belum ada catatan!");
            return;
        }
        System.out.println("\nDaftar Catatan:");
        for (int i = 0; i < notes.size(); i++) {
            System.out.println((i + 1) + ". " + notes.get(i).title);
        }
        System.out.println();
    }

    /**
     * Menampilkan detail catatan berdasarkan pilihan pengguna.
     * Jika tidak ada catatan, akan keluar dari metode ini.
     * Jika pilihan pengguna tidak valid, akan menampilkan pesan kesalahan.
     */
    static void viewNoteDetails() {
        viewNotes();
        if (notes.isEmpty()) return;

        System.out.print("Pilih nomor catatan untuk melihat detail: ");
        int choice = scanner.nextInt() - 1;
        scanner.nextLine(); // consume newline

        if (choice >= 0 && choice < notes.size()) {
            Note note = notes.get(choice);
            System.out.println("\nJudul: " + note.title);
            System.out.println("Isi: " + note.content + "\n");
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    /**
     * Kelas untuk merepresentasikan catatan.
     */
    static class Note {
        /**
         * Judul catatan.
         */
        String title;

        /**
         * Isi catatan.
         */
        String content;

        /**
         * Konstruktor untuk membuat catatan baru.
         *
         * @param title judul catatan
         * @param content isi catatan
         */
        Note(String title, String content) {
            this.title = title;
            this.content = content;
        }
    }
}
