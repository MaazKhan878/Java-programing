package TrieDataStructure;
// Tri Data Structure ALso called prefix tree 
// prefix is the part of string like apple -> ap, app, apple 
// Work: there , their , the part same -> r - > e alse e -> i -> r
// time complexty better the binary tree
// time complexty big O(l) which better than big O(login)
public class TrieData {
    static class Node {
        Node [] children;
        boolean eow;
        public Node(){
            children = new Node[26];
            for(int i = 0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();
    // insert time complexty big O (L)
    public static void insert(String word){
        Node curr = root;
        for(int i = 0; i<word.length(); i++){
            int indx = word.charAt(i) - 'a';
            if(curr.children[indx] == null){
                curr.children[indx] = new Node();
            }
            if(i == word.length()-1){
                curr.children[indx].eow = true;
            }
            curr = curr.children[indx];
        }
    }
    public static boolean search(String key){
        Node curr = root;
        for(int i = 0; i<key.length(); i++){
            int indx = key.charAt(i) - 'a';
            Node node = curr.children[indx];
            if(node == null){
                return false;
            }
            if(i == key.length() - 1 && node.eow == false){
                return false;
            }
            curr = curr.children[indx];
        }
        return true;
    }
    public static void main(String args []){
        String words[] = {"the", "a", "there", "their", "any"};
        for(int i = 0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(search("there"));
        System.out.println(search("thor"));
        System.out.println(search("an"));
        System.out.println(search("their"));
        System.out.println(search("any"));
        System.out.println(search("a"));
    }
}
