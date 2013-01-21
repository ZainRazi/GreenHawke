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
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;


public class jsonParser {

    private String urlOutput;

    public static String getURL(String output){

        //urlOutput = reader.getURL();
        //urlOutput = gson.toJson(obj);
       Gson gson = new Gson();
       JsonObject obj = gson.fromJson(output, JsonObject.class);
       String firstparse = obj.getItems().toString();

       Items obj2 = gson.fromJson(firstparse, Items.class);

       String link = obj2.getLink();

        //Type listType = new TypeToken<ArrayList<Items>>(){}.getType();
        //Gson gson = new Gson();
        //java.util.ArrayList<Items> myList = gson.fromJson(firstparse, listType);
        //String listoflinks = "";
        //for (Items p : myList)
        //{
          //  listoflinks = listoflinks + p.getLink() + "\n";
        //}
        return link;
    }

    //urlOutput = reader.getURL();
    //urlOutput = reader.toJson(obj);
}
