package pbo2;

import java.util.Scanner;

public class Mainmhs{
    ublic static void main(String[] args){
	System.out.print("=========Tugas PBO sesi3 Rival Wahyudi==========");
        Scanner input_new = new Scanner(System.in);
        String[] nama = new String[4];
        String[] nim = new String[4];
        int[] nilai = new int[4];
        boolean[] status = new boolean[4];
        char[] grade = new char[4];
        for(int i = 0; i < 4; i++){

            System.out.print("\nNama  :");
            nama[i] = input_new.nextLine();
	    System.out.print("NIM   : ");
            nim[i] = input_new.nextLine();
            System.out.print("Nilai : ");
            nilai[i] = input_new.nextInt();
            input_new.nextLine();
            if(nilai[i] >=80 && nilai[i] < 100){
                grade[i] = 'A';
                System.out.println("Grade : A");
            }else if(nilai[i] >= 70 && nilai[i] < 80){
                grade[i] = 'B';
                System.out.println("Grade : B");
            }else if(nilai[i] >= 60 && nilai[i] < 70){
                grade[i] = 'C';
                System.out.println("Grade : C");
            }else if(nilai[i] >= 50 && nilai[i] < 70){
                grade[i] = 'D';
                System.out.println("Grade : D");
            }else{
                grade[i] = 'E';
                System.out.println("Grade : E");
            }
            if(grade[i] == 'D' || grade[i] == 'E'){
                status[i] = false;
            }else{
                status[i] = true;
            }
            for(int j = 0; j < 30; j++){
                System.out.print("=");
            }
            System.out.println("\n");
        }
	Mahasiswa Mahasiswa = new Mahasiswa();
        Mahasiswa.setMhs(nama, nim, grade, nilai, status);
        System.out.println("Jumlah Mahasiswa : 4");
        System.out.print("Jumlah Mahasiswa yang lulus : " + Mahasiswa.jmlLulus(true));
        Mahasiswa.mhsLulus(true);
        System.out.print("Jumlah Mahasiswa yang lulus : " + Mahasiswa.jmlLulus(false));
        Mahasiswa.mhsLulus(false);
        System.out.print("Jumlah Mahasiswa dengan nilai A : " + Mahasiswa.jmlNilai('A'));
        Mahasiswa.mhsNilai('A');
        System.out.print("Jumlah Mahasiswa dengan nilai B : " + Mahasiswa.jmlNilai('B'));
        Mahasiswa.mhsNilai('B');
        System.out.print("Jumlah Mahasiswa dengan nilai D : " + Mahasiswa.jmlNilai('D'));
        Mahasiswa.mhsNilai('E');
        Mahasiswa.mhsRata();
        input_new.close();
    }
}
