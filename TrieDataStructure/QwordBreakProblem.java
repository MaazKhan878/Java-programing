package TrieDataStructure;

public class QwordBreakProblem {
    static class Node{
        Node [] children;
        boolean eow;
        Node(){
            children = new Node[26];
            for(int i = 0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i = 0; i<word.length(); i++){
            int indx = word.charAt(i) - 'a';
            if(curr.children[indx] == null){
                curr.children[indx] = new Node();
            }
            if(i == word.length() - 1){
                curr.children[indx].eow = true;
            }
            curr = curr.children[indx];
        }
    }
    static boolean search(String key){
        Node curr = root;
        for(int i = 0; i<key.length(); i++){
            int indx = key.charAt(i) - 'a';
            Node node = curr.children[indx];
            if(node == null){
                return false;
            }
            if(i == key.length() - 1 && curr.children[indx].eow == false){
                return false;
            }
            curr = curr.children[indx];
        }
        return true;
    }
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i = 1; i<=key.length(); i++){
            String firstPart = key.substring(0, 1);
            String secPart = key.substring(i);
            if(search(firstPart) && wordBreak(secPart)){
                return true;
            }
        }
        return false;
    }
    public static boolean startWith(String prefix){
        Node curr = root;
        for(int i = 0; i<prefix.length(); i++){
            int indx = prefix.charAt(i) - 'a';
            if(curr.children[indx] == null){
                return false;
            }
            curr = curr.children[indx];
        }
        return true;
    }
    // prefix: how many word you can made from the string
    // sufix: from end side how many word you can made
    // All prefix of all sufix
    // All sufix of all prefix
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i<26; i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String args[]){
        // String []words = {"i","likes","sam","samsung","ice"};
        // String key = "ilikesamsung";
        // for(int i = 0; i<words.length; i++){
        //     insert(words[i]);
        // }
        // System.out.println(wordBreak(key));
        // String []combination = {"apple", "app", "mango", "man","woman"};
        // for(int i = 0; i<combination.length; i++){
        //     insert(combination[i]);
        // }
        String prefix = "app";
        System.out.println(startWith(prefix));
        String str = "ababa";
        for(int i = 0; i<str.length(); i++){
            String suffix = str.substring(i);
            System.out.println(suffix);
            insert(suffix);
        }
        int length = countNode(root);
        System.out.println(length);
    }
}
