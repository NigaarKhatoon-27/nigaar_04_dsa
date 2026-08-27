import java.util.*;

class RandomizedSet {

    private List<Integer> list;
    private Map<Integer, Integer> map;
    private Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        
        if (map.containsKey(val)) {
            return false;
        }

        list.add(val);

        map.put(val, list.size() - 1);

        return true;
    }

    public boolean remove(int val) {
        
        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);
        int lastIndex = list.size() - 1;
        int lastValue = list.get(lastIndex);

        list.set(index, lastValue);

        
        map.put(lastValue, index);

        
        list.remove(lastIndex);

    
        map.remove(val);

        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }
}