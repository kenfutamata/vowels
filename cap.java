public class cap{

    private String sentence; 
    private int count = 0; 
    private char ch; 
    public cap(String sentence){
        this.sentence = sentence; 
    }

    public void vowels(){
        for(int i = 0; i < sentence.length(); i++){
            ch = sentence.charAt(i); 

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                ++count; 
            } 
        }
        System.out.println("Number of vowels is: "+count); 
    }

    public void lowercase(){
        System.out.println("The lowercase is "+this.sentence.toLowerCase()); 
    }
}