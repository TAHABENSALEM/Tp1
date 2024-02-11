/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp1;
import java.util.Scanner;
public class Tp1 {

    public static void main(String[] args) {
        System.out.println("Bonjour , mon premier TP en POO");
        //lecture du nom
        System.out.println("quel est votre nom ?");
        Scanner read = new Scanner(System.in);
        String name = read.next();
        //lecture de l'age
        System.out.println();
        System.out.println("Bonjour"+ name);
        System.out.println("Quel est votre  age "+ name+"?");
        read = new Scanner(System.in);
        int a;
        a = read.nextInt();
        System.out.println(name + "votre age est " +a);
    }
    public static double[] calculateProbability(int[][] image){
    double[] Tab = new double[255];
    int N = image.length;
    int nbocc = 0;
    for(int k=0 ;k<=255; k++){
        for(int i=0; i<=N; i++){
            for (int j=0; j<=N; j++){
                if (image[i][j]==k){
                    nbocc++;
                }
                double P = nbocc/N*N ;
                Tab[k] = P;    
            }
        }
    }
    return Tab;
    }
    public static double calculateEntropy(int[][] image){
        double[] T = calculateProbability(image);
        double H=0;
        for(int i=0;i<=255;i++){
            H-=T[i]* Math.log(T[i]/Math.log(2));
        }
        return H;
    }
}
