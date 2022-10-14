class ListNode{
    int key;
    int val;
    ListNode next;
    public ListNode(int key, int val){
        this.key = key;
        this.val = val;
        next = null;
    }
}

class MyHashMap {
    ListNode head;
    public MyHashMap() {
        head = null;
    }
    
    public void put(int key, int value) {
        if(head == null){
            head = new ListNode(key, value);
            return;
        }
        ListNode tmp = head;
        while(tmp != null){
            if(tmp.key == key){
                tmp.val = value;
                return;
            }
            tmp = tmp.next;
        }
        ListNode newNode = new ListNode(key, value);
        newNode.next = head;
        head = newNode;
        return;
    }
    
    public int get(int key) {
        ListNode tmp = head;
        while(tmp != null){
            if(tmp.key == key) return tmp.val;
            tmp = tmp.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        if(head == null) return;
        if(head.key == key){
            head = head.next;
            return;
        }
        ListNode tmp = head;
        while(tmp != null){
            if(tmp.next != null && tmp.next.key == key){
                tmp.next = tmp.next.next;
            }
            tmp = tmp.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */