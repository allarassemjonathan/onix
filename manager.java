
public class manager {
	private tree mytree;
	private node curr;
	
	public manager(tree myTree) {
		this.mytree = myTree;
		this.curr = mytree.getRoot();
	}
	public void see() {
		mytree.printTree(curr, "");
	}
	
	public void copy() {
		
	}
	
	public String find(node n) {
		node [] l = mytree.path(curr, n);
		if(l == null) {
			return "empty directory";
		}
		String path = "root/";
		int i = 0;
		while( l[i] != null) {
			path+= l[i].toString() + "/";
			i++;
		}
		return path;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
