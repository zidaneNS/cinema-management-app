package controllers;

import java.io.*;
import java.util.ArrayList;

public class Connect {
    
    public static void main(String[] args) {
        new Connect().deleteData(2);
    }
    
    static FileWriter fileWriter;
    static BufferedWriter bufferedWriter;
    static FileReader fileReader;
    static BufferedReader bufferedReader;
    static String filePath="C:\\Users\\Lenovo\\Documents\\dani\\programmerthings\\tutor java\\pjbl\\cinema-management\\bin\\database\\tickets.txt";
    
    public void addToDB(String data) {
        try {
            fileWriter = new FileWriter(filePath, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(data);
            bufferedWriter.newLine(); 
            bufferedWriter.flush();
            System.out.println("Data successfully added!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<String> getAllData() {
        ArrayList<String> result = new ArrayList<>();
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String rawData;
            
            while ((rawData = bufferedReader.readLine()) != null) {
                String[] data = rawData.split(",");
                String movieDetail= String.join(" | ", data[0], data[1]);
                result.add(movieDetail);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public void deleteData(int index) {
        ArrayList<String> movies = new ArrayList<>();
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String movie;

            while ((movie = bufferedReader.readLine()) != null) {
                movies.add(movie);
            }
            
            // Menghapus data pada index yang diberikan
            if (index >= 0 && index < movies.size()) {
                movies.remove(index);
            } else {
                System.out.println("Index out of bounds.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // menulis kembali data yang sudah dihapus ke dalam database
        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (String m : movies) {
                bufferedWriter.write(m);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            System.out.println("Data deleted successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
