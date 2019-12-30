package collection2;

public class HashSetDemo2 {
	
	NodeDemo[] arr = new NodeDemo[16];
	
	public boolean add(Object e){
		int index = hash(e);
		if(arr[index]==null){
			arr[index] = new NodeDemo(e,e.hashCode(),null);
		}
		else{
			NodeDemo n = arr[index];
			while(n.next!=null){
				n = n.next;
			}
			n.next = new NodeDemo(e,e.hashCode(),null);
			
		}
	}
	
	public Object get(Object e){
		int index = hash(e);
		NodeDemo values = arr[index];
		if(values==null) return null;
		else if(values.next == null) return values.element;
		else{
			
		}
	}

	private int hash(Object e) {
		int h = e.hashCode();
		int index= (h) ^ (h>>>16);
		return index;
	}

}

class NodeDemo{
	Object element;
	int hash;
	NodeDemo next;
	
	NodeDemo(Object element,int hash, NodeDemo next){
		this.element = element;
		this.hash = hash;
		this.next = next;
	}
}
