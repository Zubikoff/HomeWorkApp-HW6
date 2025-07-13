package lesson_12;

import java.io.*;
import java.util.ArrayList;

public class SaveLoadToFileAsCSV {
    public static void main(String[] args) {
        String[] header = {"One", "Two", "Three"};
        int[][] data = new int[3][];
        data[0] = new int[]{1, 2, 3};
        data[1] = new int[]{11, 12, 13};
        data[2] = new int[]{101, 102, 103, 105};

        String filePath = ".\\myData.csv";

        try {
            DataContainerCSV csv = new DataContainerCSV(header, data);
            csv.printAsTable();
            saveToFile(csv, filePath);

            System.out.println("===================");

            DataContainerCSV csv2 = readFromFile(filePath);
            csv2.printAsTable();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveToFile(DataContainerCSV csv, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(String.join(";", csv.getHeader()));
            writer.newLine();

            for (int[] row: csv.getData()){
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < row.length; i++) {
                    sb.append(row[i]);
                    if (i < row.length-1) { sb.append(";"); }
                }
                writer.write(sb.toString());
                writer.newLine();
            }
        }
    }

    public static DataContainerCSV readFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String[] header;
            ArrayList<int[]> rows = new ArrayList<>();
            header = reader.readLine().split(";");

            String line; //current line
            int rowNumber = 2; //row number to send if error occurs
            while ((line = reader.readLine()) != null) {
                String[] strData = line.split(";"); //getting an array in text form
                int[] row = new int[strData.length];
                for (int i = 0; i < row.length; i++) {
                    try {
                        row[i] = Integer.parseInt(strData[i]);
                    }
                    catch (NumberFormatException e) {
                        System.out.println("While reading number on position " + i + " in row " + rowNumber + " from the file an error occurred " + e.getMessage());
                        row[i] = 0;
                    }
                }
                rows.add(row);
                rowNumber++;
            }
            return new DataContainerCSV(header, rows.toArray(new int[0][]));
        }
    }
}
