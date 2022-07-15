/*4.     მოცემულია String რომელიც შედგება „(„ და „)“ ელემენტებისგან. დაწერეთ ფუნქცია
         რომელიც აბრუნებს ფრჩხილები არის თუ არა მათემატიკურად სწორად დასმული.
         Boolean isProperly(String sequence);
         მაგ: (()()) სწორი მიმდევრობაა,  ())() არასწორია
*/
public class Solution4 {
    boolean isProperly(String sequence){
        char open='(';
        char close=')';
        int st=0;
        for(int i=0;i<sequence.length();i++){
            char element=sequence.charAt(i);
            if(element==open)st+=1;
            if(element==close&& st!=0)st-=1;

        }
        return st==0;
    }

}
