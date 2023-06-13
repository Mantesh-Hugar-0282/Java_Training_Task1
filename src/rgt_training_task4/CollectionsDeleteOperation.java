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

public class CollectionsDeleteOperation {

	private static long getMemoryUsage() {
		Runtime runtime = Runtime.getRuntime();
		return runtime.totalMemory() - runtime.freeMemory();
	}

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();

		Set<String> hashSet = new HashSet<>();
		Set<String> treeSet = new TreeSet<>();

		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();

		long startTime, endTime;
		long memoryBefore, memoryAfter;

		// ArrayList
		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		for (int i = 0; i < 10; i++) {
			arrayList.add("Mantesh");
			arrayList.remove(arrayList);
		}

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==========");
		System.out.println("ArrayList Deletion Time :" + (endTime - startTime) + " ns");
		System.out.println("ArrayList Memory Usage :" + (memoryAfter - memoryBefore) + " bytes");
		System.out.println("=======");

		// LinkedList
		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();
		for (int i = 0; i < 10; i++) {
			linkedList.add("Dinesh");
			linkedList.remove(linkedList);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();
		System.out.println("=======");
		System.out.println("LinkedList Deletion time :" + (endTime - startTime) + " ns");
		System.out.println("LinkedList Memory Usage :" + (memoryAfter - memoryBefore) + " bytes");
		System.out.println("=======");

		// HashSet
		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();
		for (int i = 0; i < 10; i++) {
			hashSet.add("Adesh");
			hashSet.remove(hashSet);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();
		System.out.println("=======");
		System.out.println("HashSet Deletion time :" + (endTime - startTime) + " ns");
		System.out.println("HashSet Memory Usage :" + (memoryAfter - memoryBefore) + " bytes");
		System.out.println("=======");

		// TreeSet
		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();
		for (int i = 0; i < 10; i++) {
			treeSet.add("Amar");
			treeSet.remove("Amar");
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();
		System.out.println("=======");
		System.out.println("TreeSet Deletion time :" + (endTime - startTime) + " ns");
		System.out.println("TreeSet Memory Usage :" + (memoryAfter - memoryBefore) + " bytes");
		System.out.println("=======");

		// HashMap
		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();
		for (int i = 0; i < 10; i++) {
			hashMap.put(i, "Mantesh");
			hashMap.remove(i);
		}
		
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();
		System.out.println("=======");
		System.out.println("HashMap Deletion time :" + (endTime - startTime) + " ns");
		System.out.println("HashMap Memory Usage :" + (memoryAfter - memoryBefore) + " bytes");
		System.out.println("=======");

		// TreeMap
		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();
		for(int i = 0; i < 10; i++) {
			treeMap.put(i, "Mantesh");
			treeMap.remove(i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();
		System.out.println("=======");
		System.out.println("TreeMap Deletion time :" + (endTime - startTime) + " ns");
		System.out.println("TreeMap Memory Usage :" + (memoryAfter - memoryBefore) + " bytes");
		System.out.println("===========");
	}

}
