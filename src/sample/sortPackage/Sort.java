package sample.sortPackage;

import java.io.*;
import java.util.Scanner;

public abstract class Sort {
    public abstract void sorting(int array[]);
    public abstract void sortg(int array[]);

    protected void print(int size, int[] a, String sortName) {
        int i;
        System.out.println(sortName + " succeeded");

        if(size < 30){
            System.out.println("\nSorted array:");
            for(i = 0; i < size; i++)
                System.out.print(a[i] + " ");
        }
    }

    protected void grafic(int v[], int q, String fileName) {

        try(FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {

            //writer.print(" ");

            int size = v.length;
            if(q == 0)
                out.print("Vectorul initial: \n");
            else
                out.print("Mutarea " + q + ":\n");

            for(int i1 = size; i1 > 0;i1--) {
                for(int j = 0; j < size; j++)
                    if(v[j] >= i1)
                        out.print("_ ");
                    else
                        out.print("  ");
                out.print("\n");
            }

            System.out.println("Fisierul " + fileName +" a fost creeat.");
        }
        catch (IOException e){
            System.out.println("Erroare la deschiderea/scrierea in fisier");
        }
    }
}
