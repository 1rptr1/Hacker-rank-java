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
        String flag = "NO";
        int ans1 = 0;
        if(s.length()>1){
            int j= Integer.valueOf(s.substring(0, 2));
            String number = String.valueOf(j + 1 );
            int k= Integer.valueOf(s.substring(0, 1));
            String number2 = String.valueOf(k + 1 );
            
             if(s.contains(number2) && !s.contains("99") )
            {
                flag = "YES";
                ans1 = k;
                int l =k;
                String g="";
                while(g.equalsIgnoreCase(s))
                {       
                      if(s.contains(String.valueOf(l)))
                      {
                          g+=l;  
                      }  
                      else
                      flag="NO";
                      l+=1;
                }

            }
            else if(s.contains(number))
            {
                flag = "YES"; 
                ans1 = j;
            }
        }
        
        if(flag.equalsIgnoreCase("YES")) 
        System.out.println(flag + " " +ans1 );
        else{
            System.out.println("NO");
        }
    }
}
