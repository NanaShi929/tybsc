package Words;

public class Vowels {
    String vowels;


    public String getVowels() {
        return vowels;
    }

    public void setVowels(String vowels) {
        vowels = vowels;
    }
    public  Vowels(){

    }
    public Vowels(String vowels){
        this.vowels=vowels;
    }
    public int Vowels(String text) {
         text = text.toLowerCase();
         text=text.toUpperCase();
        int count = 0;
        for (char ch : text.toCharArray()) {
            if (ch == 'a' ||ch=='A' || ch == 'e' || ch=='E' || ch == 'i' || ch=='I' ||  ch == 'o' ||ch=='O'|| ch == 'u' ||ch=='U') {
                count++;
            }
        }
        return count;
    }
    public int Vowels(String[] words) {
        int count = 0;
        for (String word : words) {
            count += Vowels(word);
        }
        return count;
    }
}
