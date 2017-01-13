package sample.util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Created by Frunza on 11.01.2017.
 */
public class IO {

    public static void generareNumere(){

        try{
            PrintWriter writer = new PrintWriter("vectorGenerat.txt", "UTF-8");
            Scanner in = new Scanner(System.in);

            int arrayLenght = in.nextInt();
            int randomNumber;

            for(int i = 0; i < arrayLenght; i++){
                randomNumber = (int) (Math.random() * 3000) + 1;
                writer.print(randomNumber + " ");
            }
            writer.close();
        }
        catch (IOException e){
            System.out.println("Erroare la deschiderea/scrierea in fisier");
        }
    }

    public static void readFile(){
        /*try(BufferedReader br = new BufferedReader(new FileReader("vectorGenerat.txt"))) {
            StringBuilder sb = new StringBuilder();

            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();

            System.out.println(everything);
        }
        catch (IOException e){
            System.out.println("Erroare la deschiderea/scrierea in fisier");
        }*/
        /*try {
            Files.write(Paths.get("bubbleSort.txt"), "the text".getBytes(), StandardOpenOption.APPEND);
            Files.write(Paths.get("bubbleSort.txt"), "the text".getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            System.out.println("err");
        }*/
    }

    public static void deleteFileC(String fileName){

        try{
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            writer.print("");
            System.out.println("Continutul fisierului " + fileName + " a fost sters.");
        }
        catch (IOException e){
            System.out.println("Erroare la stergerea continutului fisierului " + fileName);
        }

    }
}
