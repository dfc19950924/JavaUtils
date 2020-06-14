package TreeBianLi;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * 二叉树的深度优先遍历
 * @author 小济公
 *栈
 */
public class Dfs<T> {
	//定义一个二叉树的实现
	class TreeNode{
		T val;
		TreeNode left;
		TreeNode right;
	}
	public  List<T> dfs(TreeNode root){
		Stack<TreeNode> stack = new Stack<>();
		List<T> res = new LinkedList<>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode temp = stack.pop();
			if(temp.right != null)stack.push(temp.right);
			if(temp.left != null)stack.push(temp.left);
			res.add(temp.val);
		}
		return res;
	}
	List<T> list = new LinkedList<>();
	public List<T> dfs2(TreeNode root){
		return list;
	}
	public void dfs3(TreeNode node){
		if(node == null)return;
		list.add(node.val);
		dfs2(node.left);
		dfs2(node.right);
	}
}
