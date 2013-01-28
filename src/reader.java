import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: Zain
 * Date: 18/01/13
 * Time: 19:49
 * To change this template use File | Settings | File Templates.
 */
public class reader {

    public static String getURL(String scrapeURL){
    String output = "";

    try {
        //Performs the required search for the user id and returns the result as a JSON file
        URL my_url = new URL(scrapeURL);

            BufferedReader br = new BufferedReader(new InputStreamReader(my_url.openStream()));
            String strTemp;
            while(null != (strTemp = br.readLine())){
                //System.out.println(strTemp);
                output = output + strTemp + "\n";
            }
         }
        catch (IOException e) {
    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
}
        return output;
    }
}
