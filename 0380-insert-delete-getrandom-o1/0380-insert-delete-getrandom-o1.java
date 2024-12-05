class RandomizedSet {

     private ArrayList<Integer> list;
    private Map<Integer, Integer> map;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean search(int val) {
        return map.containsKey(val);
    }

    
    public boolean insert(int val) {
        if(!search(val)){
            list.add(val);
            map.put(val,1);
            return true ;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(search(val)){
            list.remove(list.indexOf(val));
            map.remove(val);
            return true;
        }
        return false;
        
    }
    
    public int getRandom() {
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());
        int randomValue = list.get(randomIndex);
        return randomValue;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */