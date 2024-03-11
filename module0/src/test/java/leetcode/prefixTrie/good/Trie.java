package leetcode.prefixTrie.good;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private final Node root = new Node();

    public void insert(String word) {
        root.insert(word.toCharArray(), 0);
    }

    public boolean search(String word) {
        return root.search(word.toCharArray(), 0);
    }

    public boolean startsWith(String prefix) {
        return root.startsWith(prefix.toCharArray(), 0);
    }

    static final class Node {
        private final Node[] nodes;
        private boolean isEnd;

        private Node() {
            nodes = new Node[26];
        }

        private void insert(char[] word, int idx) {
            if (idx >= word.length) return;
            int i = word[idx] - 'a';
            if (nodes[i] == null) {
                nodes[i] = new Node();
            }

            if (idx == word.length-1) {
                nodes[i].isEnd = true;
            }
            nodes[i].insert(word, idx+1);
        }

        private boolean search(char[] word, int idx) {
            if (idx >= word.length) {
                return false;
            }
            Node node = nodes[word[idx] - 'a'];
            if (node == null) return false;
            if (idx == word.length - 1 && node.isEnd) return true;

            return node.search(word, idx+1);

        }

        private boolean startsWith(char[] prefix, int idx) {
            if (idx >= prefix.length) {
                return false;
            }
            Node node = nodes[prefix[idx] - 'a'];
            if (node == null) {
                return false;
            }
            if (idx == prefix.length - 1) return true;

            return node.startsWith(prefix, idx+1);
        }
    }
}