package lesson_12;

public class DataContainerCSV {
    private String[] header;
    private int[][] data;

    public DataContainerCSV(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() { return header; }

    public int[][] getData() { return data; }

    public void printAsTable() {
        for (String s: header) {
            System.out.print(s + "\t");
        }
        System.out.println();
        for (int[] row: data) {
            for (int number: row) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }
}
