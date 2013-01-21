
package Json;

import java.util.List;

public class Queries{
   	private List nextPage;
   	private List request;

 	public List getNextPage(){
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
