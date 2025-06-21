package lesson_7;

public class _4_asterisk_YearLeap {
    public static boolean method4_asterisk(int y) {
        if ((y % 400)==0) return true;
        if ((y % 100)==0) return false;
        if ((y % 4) == 0) return true;
        return false;
    }
}
