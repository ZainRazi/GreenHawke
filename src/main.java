import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Zain
 * Date: 18/01/13
 * Time: 19:44
 * To change this template use File | Settings | File Templates.
 */
public class main {
    public static void main(String[] args){
        String urlOutput = "";
        urlOutput = reader.getURL();
        List<googleSearchResult> resultList = jsonParser.getURL(urlOutput);
        //String finalOutput = jsonParser.getURL(urlOutput);
        for(googleSearchResult searchResultInstance: resultList)        //for every googleSearchResult object (i call these searchResultInstance neil called it k) : in the resultList
            {System.out.println(searchResultInstance + "\n");}

        //System.out.print(jsonParser.getURL(urlOutput));
    }

    public static int getIdentifier(){
        return 1;
    }
}
