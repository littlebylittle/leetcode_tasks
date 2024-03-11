package leetcode.designSearchTrie_0211;

import java.util.Arrays;

public class WordDictionary {
    private final Node root;
    public WordDictionary() {
        root = new Node('\0');
    }
    public void addWord(String word) {
        root.insert(word.toCharArray(), 0);
    }

    public boolean search(String word) {
        return root.search(word.toCharArray(), 0);
    }

    static final class Node {
        private final Node[] nodes;
        private final char letter;
        private boolean isEnd;

        private Node(final char input) {
            nodes = new Node[26];
            this.letter = input;
        }

        private void insert(char[] word, int idx) {
            if (idx >= word.length) return;
            int i = word[idx] - 'a';
            if (nodes[i] == null) {
                nodes[i] = new Node(word[idx]);
            }

            if (idx == word.length-1) {
                nodes[i].isEnd = true;
            }

            nodes[i].insert(word, idx+1);
        }

        private boolean search(char[] word, final int idx) {
            Arrays a;
            if (idx >= word.length) {
                return false;
            }
            if(word[idx] == '.') {
                for (var n : nodes) {
                    if(n == null) {
                        continue;
                    }
                    if(n.isEnd && idx == word.length -1) return true;
                    boolean res = n.search(word, idx + 1);
                    if(res) return true;
                }
                return false;
            }

            Node node = nodes[word[idx] - 'a'];
            if (node == null) {
                return false;
            }
            if (idx == word.length - 1) return node.isEnd;

            return node.search(word, idx+1);
        }

        @Override
        public String toString() {
            return String.valueOf(this.letter);
        }
    }
}
