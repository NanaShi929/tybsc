package Words;

public class Words {
    String words;

    public String getWords() {
        return words;
    }


    public void setWords(String words) {
        this.words = words;
    }
    public Words(){

    }
    public Words(String words){
        this.words=words;
    }
    public int Words(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
    public int Words(String[] words) {
        return words.length;
    }
}
