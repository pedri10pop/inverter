package inverter.src.main;

public class Main {
    
    public static void main(String[] args) {

        String word = "Targe Sistemas";

        String invertedWord = invertWord(word);

        System.out.println("A palavra "+word+" invertida é : "+ invertedWord);

    }

    private static String invertWord(String word) {
        
        char[] characters = word.toCharArray();
        
        String invertedWord = "";

        for(int i = characters.length - 1; i >= 0; i--){
            invertedWord += word.charAt(i);
        }

        return invertedWord;
    }

}
