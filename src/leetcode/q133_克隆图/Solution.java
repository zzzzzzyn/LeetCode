package leetcode.q133_克隆图;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public Node cloneGraph(Node node) {
        if (node == null) return node;

        // key为node，value为克隆节点
        HashMap<Node, Node> map = new HashMap<>();

        LinkedList<Node> queue = new LinkedList<>();
        queue.push(node);
        map.put(node, new Node(node.val));

        while (!queue.isEmpty()) {
            Node n = queue.poll();
            List<Node> neighbors = n.neighbors;
            for (int i = 0; i < neighbors.size(); i++) {
                // 将不存在的节点克隆到map
                if (!map.containsKey(neighbors.get(i))) {
                    map.put(neighbors.get(i), new Node(neighbors.get(i).val));
                    queue.push(neighbors.get(i));
                }
                // 更新n节点的相邻节点
                map.get(n).neighbors.add(map.get(neighbors.get(i)));
            }
        }
        return map.get(node);
    }

    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
