import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class MaapSort implements Comparator{
	List<Object> list = new ArrayList<Object>();
	Map<String, String> map = new HashMap<String, String>();
	public static void main(String args[])
	{
		MaapSort m=new MaapSort();
		m.map.put("raj","Singh");
		m.map.put("jay", "patel");
		m.list.add(m.map);
		
		m.map.put("raj","pawan");
		m.map.put("jay", "patel");
		m.list.add(m.map);
		
		m.map.put("raj","Sharma");
		m.map.put("jay", "patel");
		m.list.add(m.map);
		
		m.map.put("raj","Gupta");
		m.map.put("jay", "patel");
		m.list.add(m.map);
		}
	public int compare(List l, List l1)
	{
		//MaapSort m=new MaapSort();
		Iterator itr=l.iterator();
		Iterator itr1=l1.iterator();
		Map.Entry m1=(Map.Entry)itr.next();
		Map.Entry m2=(Map.Entry)itr.next();
		//Map.Entry m2=(Map.Entry)m1.entrySet();
		if(m1.getKey()=="raj" && m2.getKey()=="raj")
		return m1.getValue().compareTo(m2.getValue());
	} 
	
	
}
