package controllers;

import java.io.*;

public class Connect {
    static FileWriter fileWriter;
    static BufferedWriter bufferedWriter;

    public void addToDB(String file, String data) {
        String filePath = "C:\\Users\\Lenovo\\Documents\\dani\\programmerthings\\tutor java\\pjbl\\cinema-management\\bin\\database\\" + file;

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
}
