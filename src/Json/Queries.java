
package Json;

import java.util.Collection;
import java.util.List;

public class Queries{
   	public Collection<NextPage> nextPage;
   	private List request;

 	public Collection<NextPage> getNextPage(){
		return this.nextPage;
	}
	public void setNextPage(List nextPage){
		this.nextPage = nextPage;
	}
 	public List getRequest(){
		return this.request;
	}
	public void setRequest(List request){
		this.request = request;
	}
}
