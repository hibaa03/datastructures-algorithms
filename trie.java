public class trie {
    private trienode root;
    public trie(){
        root = new trienode(); //root empty
    }
    private class trienode{
        private trienode[] children;
        private boolean isWord;

        public trienode(){
            this.children = new trienode[26]; // letters a-z
            this.isWord = false;
        }
    }

    public void insert(String word){
        if (word == null || word.isEmpty()){
            throw new IllegalArgumentException("Invalid input");
        }
        word = word.toLowerCase();
        trienode current = root;
        for (int i=0; i<word.length();i++){
            char c = word.charAt(i);
            int index = c - 'a';
            if (current.children[index]==null){
                trienode node = new trienode();
                current.children[index] = node;
                current = node;
            } else{
                current = current.children[index];
            }
        }
        current.isWord = true;
    }

    public boolean search(String word){
        return false;
    }

    public static void main(String[] args) {
        trie trie = new trie();
        trie.insert("cat");
        trie.insert("cab");
        System.out.println("values inserted successfully");
    }
}
