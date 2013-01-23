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

import java.util.ArrayList;
import java.util.List;


public class jsonParser {

    private String urlOutput;

    public static List<googleSearchResult> getURL(String output){
       //make an arrayList of googleSearchResult and call it resultList
       ArrayList<googleSearchResult> resultList = new ArrayList<googleSearchResult>();
       String link = "";
       int identifier;                //simple int to id which search result it is
       Gson gson = new Gson();
        JsonObject obj = gson.fromJson(output, JsonObject.class);
       identifier = main.getIdentifier();     //get id from main (if we send two requests main will feed in id 11, but that's not written yet)

               //for every item in the json
       for (Items website : obj.items) {
                //call constructor for googleSearchResult
           googleSearchResult mySearchResult = new googleSearchResult(identifier, website.getLink(), website.getSnippet(), website.getTitle());
           identifier++;
           resultList.add(mySearchResult);    //add the googleSearchResult instance to the resultList array
       }
        return resultList;
    }

}
