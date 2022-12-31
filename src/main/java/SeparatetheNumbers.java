import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeparatetheNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            SeparatetheNumbers.separateNumbers(s);
        }

        bufferedReader.close();
    }
    public static void separateNumbers(String s) {
        
        
    
        }
}
