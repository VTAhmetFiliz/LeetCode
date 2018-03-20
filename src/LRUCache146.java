import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache146 {
    //https://leetcode.com/problems/lru-cache/description/
    int capacity = 0;
    Map<Integer, Integer> map = null;

    public LRUCache146(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        if(this.map.containsKey(key)) {
            return this.map.get(key);
        }
        else return -1;
    }

    public void put(int key, int value) {
        this.map.put(key,value);
    }
}
