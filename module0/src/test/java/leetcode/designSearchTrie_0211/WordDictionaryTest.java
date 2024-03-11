package leetcode.designSearchTrie_0211;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {
    @Test
    void name00() {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertFalse(wordDictionary.search("pad"));
        assertTrue(wordDictionary.search("bad"));
        assertTrue(wordDictionary.search(".ad"));
        assertTrue(wordDictionary.search("b.."), "b..");
    }

    @Test
    void name002() {
//            "addWord","addWord","addWord","addWord","search",   "search",   "addWord",  "search",   "search","search","search","search","search"]
//        [[],["at"],     ["and"],   ["an"],  ["add"],    ["a"],  [".at"],    ["bat"],    [".at"],    ["an."],["a.d."],["b."],["a.d"],["."]]
        WordDictionary d = new WordDictionary();
        d.addWord("at");
        d.addWord("and");
        d.addWord("an");
        d.addWord("add");
        assertFalse(d.search("a"));
        assertFalse(d.search(".at"));
        d.addWord("bat");
        assertTrue(d.search(".at"));
        assertTrue(d.search("an."));
        assertFalse(d.search("a.d."));
        assertFalse(d.search("b."));
        assertTrue(d.search("a.d")); //add
        assertFalse(d.search("."));
    }
}