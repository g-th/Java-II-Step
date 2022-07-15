/*1.     დაწერეთ ფუნქცია, რომელსაც გადაეცემა ტექსტი  და აბრუნებს პალინდრომია თუ არა.
        (პალინდრომი არის ტექსტი რომელიც ერთნაირად იკითხება ორივე მხრიდან).
        Boolean isPalindrome(String text);
        */

public class Solution1 {
    boolean isPalindrome(String text){
        boolean isPalindrome=true;
        int size=text.length();
        for(int i=0;i<size/2;i++){
            if(text.charAt(i)!=text.charAt(size-1)){
                isPalindrome=false;
                break;
            }
        }
    return isPalindrome;
    }
}
