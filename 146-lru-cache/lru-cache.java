class LRUCache {
    class Node {
        int key;
        int val;
        Node prev;
        Node next;
        public Node(int key , int val){
            this.key = key;
            this.val= val;
        }
    }
    Node head;
    Node tail;
    int capacity;
    HashMap<Integer , Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        map = new HashMap<>();
         head.next = tail;
        tail.prev = head;
        

    }
    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void addToFront(Node node){
        node.next = head.next;
        node.prev = head;

        node.next.prev = node;
        head.next = node;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        addToFront(node);
        return node.val;

        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            remove(node);
            addToFront(node);
            return;
        }
        if(map.size() == capacity){
            Node LRU = tail.prev;
            remove(LRU);
            map.remove(LRU.key);
        }
        Node newNode = new Node(key , value);
        addToFront(newNode);
        map.put(key,newNode);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */