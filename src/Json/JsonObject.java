
package Json;

import java.util.Collection;
import java.util.List;

public class JsonObject{
   	private Context context;
   	public Collection<Items> items;
   	private String kind;
   	private Queries queries;
   	private SearchInformation searchInformation;
   	private Url url;

 	public Context getContext(){
		return this.context;
	}
	public void setContext(Context context){
		this.context = context;
	}
 	public Collection<Items> getItems(){
		return this.items;
	}
	public void setItems(List items){
		this.items = items;
	}
 	public String getKind(){
		return this.kind;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
 	public Queries getQueries(){
		return this.queries;
	}
	public void setQueries(Queries queries){
		this.queries = queries;
	}
 	public SearchInformation getSearchInformation(){
		return this.searchInformation;
	}
	public void setSearchInformation(SearchInformation searchInformation){
		this.searchInformation = searchInformation;
	}
 	public Url getUrl(){
		return this.url;
	}
	public void setUrl(Url url){
		this.url = url;
	}
}
