
public class node<T>{
		T val;
		int index = 0;
		static int size = 0;
		node [] children = null;
		node parent = null;
		
		public node(T val){
			this.val = val;
			this.children = new node[10];
			size++;
		}
		
		public void setParent(node parent) {
			this.parent = parent;
		}
		
		public node getParent() {
			return this.parent;
		}
		public T getValue() {
			return this.val;
		}
		
		public void next(node n) {
			children[index] = n;
			index++;
			size++;
		}
		
		public String toString() {
			return this.val.toString();
		}
	}
	