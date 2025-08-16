import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class APIclient {
    private String apiUrl;

    public APIclient(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String fetchData() {
        StringBuilder result = new StringBuilder();
        try{
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while((line=reader.readLine())!=null){
                result.append(line);
            }
        }
        catch(Exception e){
            System.out.println("URL open error:" + e.getMessage());
        }
        return result.toString();
    }
}
   

