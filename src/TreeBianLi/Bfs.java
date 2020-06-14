package TreeBianLi;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import TreeBianLi.Bfs.TreeNode;

/**
 * 
 * @author 小济公
 * 广度优先遍历
 * 队列
 */
public class Bfs<T>{
	class TreeNode{
		T val;
		TreeNode left;
		TreeNode right;
	}
	public List<T> bfs(TreeNode root){
		List<T> res = new LinkedList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		if(root == null)return res;
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode node = queue.remove();
			res.add(node.val);
			if(node.left != null)queue.add(node.left);
			if(node.right != null)queue.add(node.right); 
		}
		return res;
	}
}
