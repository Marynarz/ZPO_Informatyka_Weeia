package zad2;

import java.util.List;
import java.util.ListIterator;

public class upperStringList {
	private List<String>stringList;
	private ListIterator<String> it1;
	public upperStringList(List<String>lista){
		this.stringList = lista;
		this.it1 = this.stringList.listIterator();
	}
	public List<String> getStringList(){
		return this.stringList;
	}
	public void setStringList(List<String>lista){
		this.stringList = lista;
	}
	public List<String> indListUp(){
		for(int i=0; i < this.stringList.size();i++){
			this.stringList.set(i, this.stringList.get(i).toUpperCase());
		}
		return this.stringList;
	}
	public List<String> repAllStr(){
		this.stringList.replaceAll(s->s.toUpperCase());
		return this.stringList;
	}
	public List<String> itMetStr(){
		while(this.it1.hasNext()){
			Object elem = this.it1.next();
			this.it1.set(elem.toString().toUpperCase());
		}
		return this.stringList;
	}
	

}
