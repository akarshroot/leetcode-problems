class MyHashMap {
    int map[] ;

    public MyHashMap() {
        this.map = new int[1000008];
    }
    
    public void put(int key, int value) {
        map[key] = value + 1;
    }
    
    public int get(int key) {
        if(map[key] == 0) return -1;
        return map[key] - 1;
    }
    
    public void remove(int key) {
        map[key] = 0;
    }
}

