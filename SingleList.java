package ed.listas;

public class SingleList<T> {
	
    private Node<T> head;

    public void add(T data){
    
        if(head==null){
            Node<T> n = new Node<T>(data);
            
            head = n;
        }else{
    
            Node<T> f = new Node<T>();
            f.setData(data);

            Node<T> p = head;

            while(p.getNext()!=null){
                p = p.getNext();
            }

            p.setNext(f);
        }
    }
    
    public void print() {
    	Node<T> p = head;
    	
    	while(p!=null) {
            System.out.print(p.getData() + "->");
            p = p.getNext();
    	}
    	System.out.println();
    }
    
    public void deleteLast() {
    	Node<T> p = head;
    	Node<T> n = null;
    	
    	while(p.getNext()!=null) {
            n = p.getNext();
            if(n.getNext()==null) {
                p.setNext(null);
                break;
            }
            p = p.getNext();
    	}
    }
    
    public void deleteFirst() {
    	Node<T> p = head;
        head = head.getNext();
        p.setNext(null);
    }
    
    public void delete(T data) {
    	Node<T> p = head;
        Node<T> q = null;
        while (p.getData()!= data){
            q = p;
            if (p.getNext()!=null){
                p = p.getNext();
            }
        }
        q.setNext(p.getNext());
        p.setNext(null);
    }
    
    public void addBefore(T newData, T data) {
    	Node<T> p = head;
        Node<T> q = null;
        Node<T> n = new Node(newData);
        while (p.getData()!= data){
            q = p;
            if (p.getNext()!=null){
                p = p.getNext();
            }
        }
        q.setNext(n);
        n.setNext(p);
    }
    
    public void addAfter(T newData, T data) {
    	Node<T> p = head;
        Node<T> n = new Node(newData);
        while (p.getData()!= data){
            if (p.getNext()!=null){
                p = p.getNext();
            }
        }
        n.setNext(p.getNext());
        p.setNext(n);
    }
	
}









