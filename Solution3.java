/*3.     მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან. დაწერეთ ფუნქცია
         რომელსაც გადაეცემა ეს მასივი და აბრუნებს მინიმალურ მთელ რიცხვს,
         რომელიც 0-ზე მეტია და ამ მასივში არ შედის.
         Int notContains(Int[] array);
*/
public class Solution3 {
    int notContains(int[] array){
        boolean contains1=false;
        int length=array.length;
        for(int t : array){
            if(t==1){
                contains1=true;
                break;
            }
        }
        if(!contains1)return 1;

        for(int i = 0; i<length;i++){
            if(array[i]<=0 || array[i]>length)
                array[i]=1;
        }

        for(int i = 0; i<length;i++){
            int index=Math.abs(array[i]);
            if(array[index-1]>0)
                array[index-1]*=-1;
        }

        for(int i = 0; i<length;i++){
            if(array[i]>0)return i+1;
        }

        return length+1;
    }
}
