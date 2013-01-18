/**
 * Created with IntelliJ IDEA.
 * User: Zain
 * Date: 18/01/13
 * Time: 20:01
 * To change this template use File | Settings | File Templates.
 */
import com.google.gson.Gson;

public class jsonParser {

    private String urlOutput;

    public String getURL(String output){

        //urlOutput = reader.getURL();
        //urlOutput = gson.toJson(obj);

        Gson gson = new Gson();
        gson.toJson(output);

        String output = gson.get("link").getAsString();

        return output;
    }

    //urlOutput = reader.getURL();
    //urlOutput = reader.toJson(obj);
}
