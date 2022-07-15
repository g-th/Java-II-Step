/*2.    გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია,რომელსაც
        გადაეცემა თანხა (თეთრებში) და აბრუნებს მონეტების მინიმალურ რაოდენობას,
        რომლითაც შეგვიძლია ეს თანხა დავახურდაოთ.
        Int minSplit(Int amount);
*/
public class Solution2 {
    int minSplit(int amount){
        int [] coins={1,5,10,20,50};
        int ans=0;
        for(int i=coins.length-1;i>=0;i--){
            ans+=amount/coins[i];
            amount=amount%coins[i];
        }
        return ans;



    }
}
