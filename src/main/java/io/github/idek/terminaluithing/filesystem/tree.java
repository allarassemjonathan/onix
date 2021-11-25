import java.util.ArrayList;
import java.util.Collections;

public class tree {

	private node root;
	public tree(node n){
		root = n;
	}
	
	public node getRoot() {
		return this.root;
	}
	public int depth(node n) {
		if(n == this.getRoot()) {
			return 0;
		}
		return 1 + depth(n.getParent());
	}
	public node getParent(node n) {
		return n.getParent();
	}
	public void printTree(node root, String ans) {
		if(root == null) {
			return;
		}
		System.out.println(ans + root.toString());
		ans += "└───";
		for (node child : root.children) {
			if(child == null) {
				ans = ans.substring(ans.length() - 2);
				printTree(child, ans);
			}else {
				printTree(child, ans);
			}
		}
	}
	
	public node lca(node n1, node n2) {
		if(n1 == null || n2 == null) {
			return null;
		}
		int delta = this.depth(n1) - this.depth(n2);
		
		for(int i = 0; i < Math.abs(delta); i++) {
			if(delta > 0) {
				n1 = n1.getParent();
			}
			else {
				n2 = n2.getParent();
			}
		}
		
		while(!n1.getValue().equals(n2.getValue())) {
			n1 = n1.getParent();
			n2 = n2.getParent();
		}
		return n1;
	}
	
	public node [] path (node n1, node n2) {
		node [] list = new node[node.size];
		node [] rev = new node[node.size];
		node lca = lca(n1, n2);
		if(lca == null) {
			return null;
		}
		int i1 = 0;
		while(!n1.getValue().equals(lca.getValue())) {
			list[i1] = n1;
			n1 = n1.getParent();
			i1++;
		}
		int i2 = 0;
		while(!n2.getValue().equals(lca.getValue())) {
			rev[i2] = n2;
			n2 = n2.getParent();
			i2++;
		}
		int j = i1;
		i2--;
		while(i2 >= 0){
			list[j] = rev[i2];
			i2--;
			j++;
		}
		return list;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node root = new node("root");
		tree myt = new tree(root);
		manager m = new manager(myt);
		node dir1 = new node("dir1");
		node dir2 = new node("dir2");
		node dir3 = new node("dir3");
		node dir4 = new node("dir4");
		node dir5 = new node("dir5");
		node dir6 = new node("dir6");
		node dir7 = new node("dir7");
		node dir8 = new node("dir8");
		node dir9 = new node("dir9");
		node dir10 = new node("dir10");
		node dir11 = new node("dir11");
		node dir12 = new node("dir12");
		
		root.next(dir1);
		dir1.setParent(root);
		root.next(dir2);
		dir2.setParent(root);
		root.next(dir3);
		dir3.setParent(root);
		dir1.next(dir4);
		dir4.setParent(dir1);
		dir4.next(dir5);
		dir5.setParent(dir4);
		dir5.next(dir9);
		dir9.setParent(dir5);
		dir4.next(dir12);
		dir12.setParent(dir4);
		dir12.next(dir11);
		dir11.setParent(dir12);
		root.next(dir6);
		dir6.setParent(root);
		dir7.next(dir8);
		dir8.setParent(dir7);
		dir9.next(dir10);
		dir10.setParent(dir9);
		root.next(dir7);
		dir7.setParent(root);
		
		node lca = myt.lca(root, dir12);
		System.out.println(m.find(dir1));
	}

}
