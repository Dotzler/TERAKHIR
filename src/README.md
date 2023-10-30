# AutocompleteAndTemplates

Program ini adalah contoh implementasi fitur autocomplete dan custom live template dalam Java menggunakan IntelliJ IDEA. Program juga mencakup kelas untuk konversi bilangan desimal ke oktal.

## Cara Menjalankan Program

1. Buka proyek dalam IntelliJ IDEA.
2. Buka file `Main.java` dan jalankan program.
3. Untuk konversi bilangan desimal ke oktal, digunakan kelas `DecimalToOctalConverter`. Jalankan `main` dengan user menginputkan bilangan desimal yang akan dikonversikan ke oktal.

## Tentang Program

Program ini mencakup fitur-fitur seperti:

- Autocomplete dalam kode Java.
- Custom live template untuk kalkulator sederhana.
- Kelas `DecimalToOctal` untuk konversi bilangan desimal ke oktal.

## Fungsi Program

Program tersebut memiliki dua fungsi utama:

1. Meminta Input: Program ini meminta pengguna untuk memasukkan bilangan desimal menggunakan Scanner. Kemudian, nilai desimal yang dimasukkan oleh pengguna disimpan dalam variabel decimal.

2. Konversi Decimal ke Octal: Program ini mengkonversi bilangan desimal yang dimasukkan oleh pengguna menjadi bentuk oktal (basis 8) dengan memanggil fungsi decimalToOctal. Fungsi decimalToOctal mengambil bilangan desimal sebagai argumen dan mengembalikan string yang merupakan representasi oktal dari bilangan tersebut.

Pada akhirnya, program mencetak hasil konversi ke oktal ke layar. Program ini menggunakan operasi pembagian dan sisa bagi untuk mengkonversi bilangan desimal ke oktal dengan mengambil sisa bagi dari pembagian bilangan desimal oleh 8 dan memasukkannya dalam string oktal hingga bilangan desimal mencapai 0.
