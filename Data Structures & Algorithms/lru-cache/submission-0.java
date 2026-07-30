class LRUCache {
    class Node{
        int key;
        int val;

        Node prev;
        Node next;
        Node(int key,int val){
            this.key=key;
            this.val=val;
        }

    }

    private HashMap <Integer,Node> map;
    private int capacity;
    private Node head;
    private Node tail;


    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();

        head=new Node(0,0);
        tail=new Node(0,0);

        head.next=tail;
        tail.prev=head;
        
    }

    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        Node node=map.get(key);
        
        //moved accesed node to fronte
        remove(node);
        addFirst(node);
        return node.val;
        
    }

    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    private void addFirst(Node node){
        head.next.prev=node;
        node.next=head.next;
        node.prev=head;
        head.next=node;

    }
    
    public void put(int key, int value) {

        if(map.containsKey(key)){
            Node node=map.get(key);
            node.val=value;

            remove(node);
            addFirst(node);
            return;
        }

        if(map.size()==capacity){
            Node lru=tail.prev; //removing last ele bcoz size is full
            remove(lru);
            map.remove(lru.key);
        }

        Node node=new Node(key,value);
        map.put(key,node);
        addFirst(node);
        
    }
}
