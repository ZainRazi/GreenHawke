/**
 * Created with IntelliJ IDEA.
 * User: Zain
 * Date: 22/01/13
 * Time: 21:50
 * To change this template use File | Settings | File Templates.
 */
public class googleSearchResult {

    String link;
    String title;
    String snippet;
    int identifier;

    public googleSearchResult(int identifier, String link, String snippet, String title) {
        this.identifier = identifier;
        this.link = link;
        this.title = title;
        this.snippet = snippet;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }
           //overwrites object.class default toString so that we can use System.out (otherwise just prints memory location)
    public String toString(){
            //build the string in the format we want
        return (String.valueOf(identifier).concat(" ").concat(title).concat(" ").concat(snippet).concat(" ").concat(link));
    }
}
