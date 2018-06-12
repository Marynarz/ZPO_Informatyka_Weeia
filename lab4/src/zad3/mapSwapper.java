package zad3;

import java.util.Map;

public class mapSwapper {
    private Map<String,Integer> counts;

    public mapSwapper(Map<String,Integer> tmpM){
        this.counts = tmpM;
    }
    public Map<String,Integer> getMap(){
        return this.counts;
    }

    //containsKey
    public void contKSwp(String key, Integer val){
        if(this.counts.containsKey(key)) this.counts.put(key, this.counts.get(key) + val);
    }

    //get/null
    public void geNuSwp(String key, Integer val) throws NullPointerException {
        if(this.counts.get(key)!=null) this.counts.put(key, this.counts.get(key) + val);
        else throw new NullPointerException();
    }
    //getOrDefault
    public void orDefSwp(String key, Integer val) throws NoSuchFieldException{
        if(this.counts.getOrDefault(key,-1)!=-1) this.counts.put(key, this.counts.get(key) + val);
        else throw new NoSuchFieldException();
    }

    //putIfAbsent
    public void ifAbsSwp(String key, Integer val){
        if(this.counts.putIfAbsent(key,val)==null) System.out.println("New key added: " + key);
        else this.counts.put(key, this.counts.get(key) + val);
    }
}
