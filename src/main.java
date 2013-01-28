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
        String scrapeURL;
        int numberofrequests = 10;
        int pageindex = 1;
        //Unique Identifier for each user, Possibly store against a logon?
        String userKey = "AIzaSyDBonMWKPup9hgCA3IUNsDSLW2ySQiwp9g";
        //Search will be gathered from user inputs the constructed into a string here
        String searchParameter = "Neil";
        //Return the exact number of results we want, each time page index is increased by 10, causing the search to return the next 10 results
        while (pageindex <= (numberofrequests*10)-9){

            String google_url  = "https://www.googleapis.com/customsearch/v1?key=" + userKey + "&start=" + pageindex + "&cx=013036536707430787589:_pqjad5hr1a&q=" + searchParameter + "&alt=json";
            urlOutput = reader.getURL(google_url);
            List<googleSearchResult> resultList = jsonParser.getURL(urlOutput);
            //String finalOutput = jsonParser.getURL(urlOutput);
            for(googleSearchResult searchResultInstance : resultList){        //for every googleSearchResult object (I call these searchResultInstance Neil called it website in jsonParser) : in the resultList

                scrapeURL = searchResultInstance.getLink();
                urlOutput = reader.getURL(scrapeURL);
                System.out.print(urlOutput);

            }
            if (pageindex<91){
                pageindex = pageindex + 10;
            }
            else {
                pageindex = 1000;
            }
        }
    }

    public static int getIdentifier(){
        return 1;
    }
}
