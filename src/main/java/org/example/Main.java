package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, choices;
        Boolean repeat = true;

        do {
        System.out.println("---------------------------------------" +
                "\nKalkulator Penghitung Luas dan Volume" +
                "\n---------------------------------------");
        System.out.println("Menu");
        System.out.println("1. Hitung Luas Bidang");
        System.out.println("2. Hitung Volume");
        System.out.println("0. Tutup Aplikasi");
        System.out.println("---------------------------------------");
        menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("---------------------------------------" +
                            "\nPilih bidang yang akan dihitung" +
                            "\n---------------------------------------");
                    System.out.println("1. persegi");
                    System.out.println("2. lingkaran");
                    System.out.println("3. segitiga");
                    System.out.println("4. persegi panjang");
                    System.out.println("0. kembali ke menu sebelumnya");
                    System.out.println("---------------------------------------");
                    choices = input.nextInt();
                    switch (choices) {
                        case 1:
                            System.out.println("---------------------------------------" +
                                    "\nAnda memilih persegi" +
                                    "\n---------------------------------------");
                            System.out.print("Masukkan sisi: ");
                            double sisi = input.nextDouble();
                            double luasPersegi = sisi * sisi;
                            System.out.println("Luas dari persegi adalah " + luasPersegi);
                            break;
                        case 2:
                            System.out.println("---------------------------------------" +
                                    "\nAnda memilih lingkaran" +
                                    "\n---------------------------------------");
                            System.out.print("Masukkan jari - jari: ");
                            double jari = input.nextDouble();
                            double luasLingkaran = 3.14 * jari * jari;
                            System.out.println("Luas dari lingkaran adalah " + luasLingkaran);
                            break;
                        case 3:
                            System.out.println("---------------------------------------" +
                                    "\nAnda memilih segitiga" +
                                    "\n---------------------------------------");
                            System.out.print("Masukkan alas: ");
                            double alas = input.nextDouble();
                            System.out.print("Masukkan tinggi: ");
                            double tinggi = input.nextDouble();
                            double luasSegitiga = (alas * tinggi)/2;
                            System.out.println("Luas dari segitiga adalah " + luasSegitiga);
                            break;
                        case 4:
                            System.out.println("---------------------------------------" +
                                    "\nAnda memilih persegi panjang" +
                                    "\n---------------------------------------");
                            System.out.print("Masukkan panjang: ");
                            double panjang = input.nextDouble();
                            System.out.print("Masukkan lebar: ");
                            double lebar = input.nextDouble();
                            double luasPersegiPanjang = panjang * lebar;
                            System.out.println("Luas dari persegi panjang adalah " + luasPersegiPanjang);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Pilihan tidak ada");
                    }
                    break;
                case 2:
                    System.out.println("---------------------------------------" +
                            "\nPilih bidang yang akan dihitung" +
                            "\n---------------------------------------");
                    System.out.println("1. kubus");
                    System.out.println("2. balok");
                    System.out.println("3. tabung");
                    System.out.println("0. kembali ke menu sebelumnya");
                    System.out.println("---------------------------------------");
                    choices = input.nextInt();
                    switch (choices) {
                        case 1:
                            System.out.println("---------------------------------------" +
                                    "\nAnda memilih kubus" +
                                    "\n---------------------------------------");
                            System.out.print("Masukkan sisi kubus: ");
                            double sisi = input.nextDouble();
                            double volumeKubus = Math.pow(sisi, 3);
                            System.out.println("Volume kubus adalah " + volumeKubus);
                            break;
                        case 2:
                            System.out.println("---------------------------------------" +
                                    "\nAnda memilih balok" +
                                    "\n---------------------------------------");
                            System.out.print("Masukkan panjang balok: ");
                            double panjang = input.nextDouble();
                            System.out.print("Masukkan lebar balok: ");
                            double lebar = input.nextDouble();
                            System.out.print("Masukkan tinggi balok: ");
                            double tinggi = input.nextDouble();
                            double volumeBalok = panjang * lebar * tinggi;
                            System.out.println("Volume balok adalah " + volumeBalok);
                            break;
                        case 3:
                            System.out.println("---------------------------------------" +
                                    "\nAnda memilih tabung" +
                                    "\n---------------------------------------");
                            System.out.print("Masukkan jari - jari alas: ");
                            double jariAlas = input.nextDouble();
                            System.out.print("Masukkan tinggi: ");
                            double tinggi1 = input.nextDouble();
                            double volumeTabung = (3.14 * jariAlas * jariAlas) * tinggi1;
                            System.out.println("Luas dari persegi adalah " + volumeTabung);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Pilihan tidak ada");
                            repeat = false;
                    }
                    break;
                case 0:
                    repeat = false;
                    break;
            }

            if (repeat) {
                System.out.println("---------------------------------------");
                System.out.println("tekan apa saja untuk kembali ke menu utama");
                input.nextLine();
                String answer = input.nextLine();
            }

        }while(repeat);
    }
}