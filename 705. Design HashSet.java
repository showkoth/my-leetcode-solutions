class ListNode {
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class MyHashSet {
    ListNode head;
    public MyHashSet() {
        head = null;
    }
    
    public void add(int key) {
        if(head == null){
            head = new ListNode(key);
        }
        ListNode tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        if(!contains(key)){
            ListNode newNode = new ListNode(key);
            tmp.next = newNode;
        }
    }
    
    public void remove(int key) {
        if(head == null) return;
        if(head.val == key) {
            head = head.next;
            return;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode tmp = dummy;
        while(tmp != null){
            if(tmp.next == null) return;
            if(tmp.next.val == key){
                tmp.next = tmp.next.next;
            }
            tmp = tmp.next;
        }
    }
    
    public boolean contains(int key) {
        if(head == null) return false;
        ListNode tmp = head;
        while(tmp != null){
            if(tmp.val == key) return true;
            tmp = tmp.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */