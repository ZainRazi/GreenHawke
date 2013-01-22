/**
 * Created with IntelliJ IDEA.
 * User: Zain
 * Date: 18/01/13
 * Time: 20:01
 * To change this template use File | Settings | File Templates.
 */
import Json.Items;
import Json.JsonObject;
import com.google.gson.Gson;



public class jsonParser {

    private String urlOutput;

    public static String getURL(String output){

       String link = "";
       Gson gson = new Gson();
       JsonObject obj = gson.fromJson(output, JsonObject.class);

       for (Items k : obj.items) {

           link = link + k.getLink() +"\n";

       }
        return link;
    }

}
