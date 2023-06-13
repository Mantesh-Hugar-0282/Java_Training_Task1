package rgt_training_task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsCompareason {

	//For Memory Usage
	private static long getMemoryUsage() {
		Runtime runtime = Runtime.getRuntime();
		return runtime.totalMemory()-runtime.freeMemory();
		
	}
	public static void main(String[] args) {
		
	List<Integer> arryList=new ArrayList<>();
	List<Integer> linkedList=new LinkedList<>();
	
	Set<Integer> hashSet=new HashSet<>();
	Set<Integer> treeSet = new TreeSet<>();
	
	Map<Integer, String> hashMap=new HashMap<>();
	Map<Integer, String> treeMap=new TreeMap<>();
	
	long startTime,endTime;
	long memoryBefore,memoryAfter;
	
	//ArrayList and LinkedList
	//ArrayList
	startTime=System.nanoTime();
	memoryBefore=getMemoryUsage();
	for(int i=0;i<100000;i++) {
		arryList.add(i);
	}
	memoryAfter=getMemoryUsage();
	endTime=System.nanoTime();
	System.out.println("=======");
	System.out.println("ArrayList insertion time :"+(endTime-startTime)+" ns");
	System.out.println("ArrayList Memory Usage :"+(memoryAfter-memoryBefore)+" bytes");
	System.out.println("=======");
	
	//LinkedList
	startTime=System.nanoTime();
	memoryBefore=getMemoryUsage();
	for(int i=0;i<100000;i++) {
		linkedList.add(i);
	}
	memoryAfter=getMemoryUsage();
	endTime=System.nanoTime();
	System.out.println("=======");
	System.out.println("LinkedList insertion time :"+(endTime-startTime)+" ns");
	System.out.println("LinkedList Memory Usage :"+(memoryAfter-memoryBefore)+" bytes");
	System.out.println("=======");
	
	//HashSet and TreeSet
	//HashSet
	startTime=System.nanoTime();
	memoryBefore=getMemoryUsage();
	for(int i=0;i<100000;i++) {
		hashSet.add(i);
	}
	memoryAfter=getMemoryUsage();
	endTime=System.nanoTime();
	System.out.println("=======");
	System.out.println("HashSet insertion time :"+(endTime-startTime)+" ns");
	System.out.println("HashSet Memory Usage :"+(memoryAfter-memoryBefore)+" bytes");
	System.out.println("=======");
	
	//TreeSet
	startTime=System.nanoTime();
	memoryBefore=getMemoryUsage();
	for(int i=0;i<100000;i++) {
		treeSet.add(i);
	}
	memoryAfter=getMemoryUsage();
	endTime=System.nanoTime();
	System.out.println("=======");
	System.out.println("TreeSet insertion time :"+(endTime-startTime)+" ns");
	System.out.println("TreeSet Memory Usage :"+(memoryAfter-memoryBefore)+" bytes");
	System.out.println("=======");
	
	//HashMap and TreeMap
	//HashMap
	startTime=System.nanoTime();
	memoryBefore=getMemoryUsage();
	for(int i=0;i<100000;i++) {
		hashMap.put(i,"StringValue"+i);
	}
	memoryAfter=getMemoryUsage();
	endTime=System.nanoTime();
	System.out.println("=======");
	System.out.println("HashMap insertion time :"+(endTime-startTime)+" ns");
	System.out.println("HashMap Memory Usage :"+(memoryAfter-memoryBefore)+" bytes");
	System.out.println("=======");
	
	//TreeMap
	startTime=System.nanoTime();
	memoryBefore=getMemoryUsage();
	for(int i=0;i<100000;i++) {
		treeMap.put(i,"StringValue"+i);
	}
	memoryAfter=getMemoryUsage();
	endTime=System.nanoTime();
	System.out.println("=======");
	System.out.println("TreeMap insertion time :"+(endTime-startTime)+" ns");
	System.out.println("TreeMap Memory Usage :"+(memoryAfter-memoryBefore)+" bytes");
	System.out.println("=======");
	}
}
