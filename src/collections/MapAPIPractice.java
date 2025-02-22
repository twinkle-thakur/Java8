package collections;

	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.function.BiConsumer;
	import java.util.Set;

	public class MapAPIPractice {
		public static void main(String[] args) {
			Map<String, Integer> map = new HashMap<>();
			map.put("Twinkle", 40000);
			map.put("Prince", 35000);
			map.put("Kartik", 40000);
			map.put("Kundan", 40000);
			System.out.println("Iterate entries from the map ");
			 // public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();//To Iterate the entries
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
			while(iterator.hasNext()) {
				Entry<String, Integer> next = iterator.next();
				//System.out.println(next.getKey()+ " "+next.getValue());
			}
			System.out.println("Second Approach");
			for(Entry<String, Integer>entry: map.entrySet()) {
				//System.out.println(entry.getKey()+" "+entry.getValue());
			}
		System.out.println("Approach 3");	
		 //default void forEach(BiConsumer<? super K, ? super V> action) {
		 // void accept(T t, U u);
		BiConsumer<String, Integer> con =(k,v)->System.out.println(k+" "+v);	
		
		
		map.forEach(con);
		System.out.println("Advance version of Approach 3");
		//map.forEach(System.out::println);
//		map.entrySet().forEach(System.out::println);
//		map.entrySet().forEach(e->System.out.println(e.getKey()+ " "+e.getValue()));
		//map.forEach((k,v)->System.out.println(k+" "+v));
		map.keySet().forEach(System.out::println);
		map.values().forEach(System.out::println);
		}

	}


