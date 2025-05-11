package week1;

public class timeConversionSolution {
    public static void main(String[] args) {
        String s = "01:59:00AM";
        timeConversion(s);
    }

    public static void timeConversion(String s) {
        String[] arr = s.split(":");
        int hour = Integer.parseInt(arr[0]);
        String period = arr[2].substring(2).toUpperCase(); // "AM" or "PM"

        if (period.equals("AM")) {
            if (hour == 12) {
                arr[0] = "00"; // Midnight
            } // else keep hour as-is (1-11AM)
        } else { // PM
            if (hour != 12) {
                hour += 12;
                arr[0] = String.valueOf(hour);
            }
        }
        System.out.println(arr[0] + ":" + arr[1] + ":" + arr[2].substring(0, 2));
    }


}
