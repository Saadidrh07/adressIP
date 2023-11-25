package com.example.ipi.Model;

import java.util.Scanner;

public class IP {


        private int octet1, octet2, octet3, octet4;

        public IP(int octet1, int octet2, int octet3, int octet4) {
            this.octet1 = octet1;
            this.octet2 = octet2;
            this.octet3 = octet3;
            this.octet4 = octet4;
        }

        public IP() {
        }

        public void setOctet1(int octet1) {
            this.octet1 = octet1;
        }

        public void setOctet2(int octet2) {
            this.octet2 = octet2;
        }

        public void setOctet3(int octet3) {
            this.octet3 = octet3;
        }

        public void setOctet4(int octet4) {
            this.octet4 = octet4;
        }

        public int getOctet1() {
            return octet1;
        }

        public int getOctet2() {
            return octet2;
        }

        public int getOctet3() {
            return octet3;
        }

        public int getOctet4() {
            return octet4;
        }

        @Override
        public String toString() {
            return
                    octet1 +
                            "." + octet2 +
                            "." + octet3 +
                            "." + octet4;
        }

        public char getClasse() {
            if (this.octet1 <= 126) {
                return 'A';
            } else if (this.octet1 >= 128 && this.octet1 <= 191) {
                return 'B';
            } else if (this.octet1 >= 192 && this.octet1 <= 223) {
                return 'C';
            } else {
                return 'x';
            }
        }

        public boolean equals(IP autreAdresse) {
            if (this.octet1 == autreAdresse.octet1 && this.octet2 == autreAdresse.octet2 && this.octet3 == autreAdresse.octet3) {
                return true;
            } else {
                return false;
            }
        }

        public IP getAdresseReseau() {
            if (this.getClasse() == 'A') {
                this.octet2 = 0;
                this.octet3 = 0;
                this.octet4 = 0;
            } else if (this.getClasse() == 'B') {
                this.octet3 = 0;
                this.octet4 = 0;
            } else if (this.getClasse() == 'C') {
                this.octet4 = 0;
            }

            System.out.print("(classe " + this.getClasse() + ") aura pour adresse réseau :");

            return new IP(this.octet1, this.octet2, this.octet3, this.octet4);
        }

        public boolean estMemeReseau(IP ip) {
            if (this.getAdresseReseau().equals(ip.getAdresseReseau())) {
                return true;
            } else {
                return false;
            }
        }
        public IP saisir(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Saisir l'adresse com.example.IP :");
            System.out.println("Octet 1 :");
            int octet1 = sc.nextInt();
            while(octet1<0 || octet1>255){
                System.out.println("recommencez");
                octet1 = sc.nextInt();
            }

            System.out.println("Octet 2 :");
            int octet2 = sc.nextInt();
            while(octet2<0 || octet2>255){
                System.out.println("recommencez");
                octet2 = sc.nextInt();
            }
            System.out.println("Octet 3 :");
            int octet3 = sc.nextInt();
            while(octet3<0 || octet3>255){
                System.out.println("recommencez");
                octet3 = sc.nextInt();
            }
            System.out.println("Octet 4 :");
            int octet4 = sc.nextInt();
            while(octet4<0 || octet4>255){
                System.out.println("recommencez");
                octet4 = sc.nextInt();
            }
            return new IP(octet1,octet2,octet3,octet4);
        }

    }

