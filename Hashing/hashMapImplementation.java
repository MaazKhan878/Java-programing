package Hashing;
import java.util.*;
public class hashMapImplementation {
    static class HashMap<K, V>{//<> generic type mean Genral type we donnot lnow the type
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
           
        }
        private int n;
        private int N;
        private LinkedList<Node> buckts[];
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckts = new LinkedList[4];
            for(int i = 0; i<4; i++){
                this.buckts[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode(); // it return any int value
            // convert to passitive and take the reminder  beteween N N-1
            return Math.abs(bi) % N;

        }
        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckts[bi];
            int di = 0;
            for(int i = 0; i<ll.size(); i++){
                if(ll.get(i).key == key ){
                    return i;
                }
            }
            return -1;
        }
        private void rehashing(){
            LinkedList<Node> oldBucket[] = buckts;
            buckts = new LinkedList[N*2];
            for(int i = 0; i<N*2 ; i++){
                buckts[i] = new LinkedList<>();
            }
            for(int i = 0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put (K key , V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1){ // mean does not exist
                buckts[bi].add(new Node(key, value));
                n++;

            }
            else{// exist
                Node node = buckts[bi].get(di);
                node.value = value;

            }
            double lmbda = (double)n/N;
            if(lmbda > 2.0){
                // rehashing
                rehashing();
            }

        }
        public boolean containsKey(K key){
            return false;
        }
        public V remove(K key){
            return null;
        }
        public V get(K key){
            return null;
        }
        public ArrayList<K> keySet(){
            return null;
        }

    }

}
