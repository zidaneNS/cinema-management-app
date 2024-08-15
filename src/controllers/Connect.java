package controllers;

import java.io.*;
import java.util.ArrayList;
// import java.util.Scanner;

public class Connect {
    
    public static void main(String[] args) {
        System.out.println(new Connect().getAllData().toString());
    }
    
    static FileWriter fileWriter;
    static BufferedWriter bufferedWriter;
    static FileReader fileReader;
    static BufferedReader bufferedReader;
    static String filePath = "C:\\Users\\Lenovo\\Documents\\dani\\programmerthings\\tutor java\\pjbl\\cinema-management\\bin\\database\\tickets.txt";
    
    public void addToDB(String data) {
        try {
            // Membuka file dalam mode append (true)
            fileWriter = new FileWriter(filePath, true);
            bufferedWriter = new BufferedWriter(fileWriter);

            // Menulis data ke file dan menambahkan newline
            bufferedWriter.append(data);
            bufferedWriter.newLine();  // Ini memastikan data baru ditulis di baris baru
            bufferedWriter.flush();
            System.out.println("data successfully added !");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Menutup bufferedWriter untuk memastikan tidak ada kebocoran sumber daya
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("finally")
    public ArrayList<String> getAllData(){
        ArrayList<String> result = new ArrayList<>();
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String rawData;

            // menganalisi tiap baris
            while((rawData = bufferedReader.readLine()) != null){
                String[] data = rawData.split(",");
                String movieDetail = String.join(" | ", data[0],data[1]);

                // menambahkan title dan waktu saja
                result.add(movieDetail);
            }

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            return result;
        }
    }
}
