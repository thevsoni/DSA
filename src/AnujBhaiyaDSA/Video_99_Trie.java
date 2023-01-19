package AnujBhaiyaDSA;

import java.util.TreeMap;

public class Video_99_Trie {
    static class TrieNode{
        TrieNode[] children;
        boolean isEndOfWord;
        TrieNode(){
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }
    static void insertString(TrieNode root, String key){
        TrieNode curNode = root;
        for(int i=0; i<key.length(); i++){
            char cur = key.charAt(i);
            if (curNode.children[cur-'a']==null){
                curNode.children[cur-'a']= new TrieNode();
            }
            curNode = curNode.children[cur-'a'];
        }
        curNode.isEndOfWord = true;
    }

    //check whether string present or not
    static boolean searchString(TrieNode root, String key){
        TrieNode curNode = root;
        for (int i=0; i<key.length(); i++){
            char cur = key.charAt(i);
            if (curNode.children[cur-'a']==null){
                return false;
            }
            curNode = curNode.children[cur-'a'];
        }
        return curNode.isEndOfWord;
    }
    public static void main(String[] args) {
    }
}
