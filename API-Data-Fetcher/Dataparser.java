import org.json.JSONObject;
public class Dataparser {
    public static void parseAndPrint(String json) {
        try{
            JSONObject obj=new JSONObject(json);
            System.out.println("ID:" + obj.getInt("id"));
            System.out.println("TITLE:" + obj.getString("title"));
            System.out.println("BODY:" + obj.getString("body"));
        }
        catch(Exception e){
            System.out.println("Error in opening in json:" + e.getMessage());
        }
    }
}

