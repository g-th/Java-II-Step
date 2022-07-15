/*5.     გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით.
         დაწერეთ ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას.
         Int countVariants(Int stearsCount);
*/
public class Solution5 {
    int countVariants(int stearsCount) {
        if(stearsCount<=0)
            return 0;
        int a=1;
        int b=2;
        for(int i=2;i<=stearsCount;i++){
            b+=a;
            a=b-a;

        }
        return a;
    }
}
