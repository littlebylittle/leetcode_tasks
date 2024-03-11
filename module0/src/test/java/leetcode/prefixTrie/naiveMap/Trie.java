package leetcode.prefixTrie.naiveMap;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private final Element head;

    public Trie() {
        this.head = new Element('_', false);
    }

    public void insert(String word) {
        char[] chars = word.toCharArray();
        if (chars.length == 0) {
            return;
        }

        Element current = head;
        for (char aChar : chars) {
            current = current.propose(aChar, false);
        }
        current.setEnd(true);
    }

    public boolean search(String word) { //has the whole word
        char[] chars = word.toCharArray();
        Element element = this.head;
        for (char cur : chars) {
            element = element.get(cur);
            if(null == element) {
                return false;
            }
        }
        return element.isEnd;
    }

    public boolean startsWith(String prefix) {
        char[] chars = prefix.toCharArray();
        Element element = this.head;
        for (char cur : chars) {
            element = element.get(cur);
            if(null == element) {
                return false;
            }
        }
        return true;
    }
}

final class Element {

    private final Map<Character, Element> next = new HashMap<>();
    private final char current;
    public boolean isEnd;
    Element(char current, boolean isEnd) {
        this.current = current;
        this.isEnd = isEnd;
    }

    /**
     * checks only a `current` (char) field
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Element element = (Element) o;

        return current == element.current;
    }

    @Override
    public int hashCode() {
        return current;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public Element get(char element) {
        return next.get(element);
    }

    public Element propose(char newElement, boolean isEnd) {
        Element element = next.get(newElement);
        if (element != null) {
            return element;
        }

        Element newEl = new Element(current, isEnd);
        next.put(newElement, newEl);
        return newEl;
    }
}