/*6.     დაწერეთ საკუთარი მონაცემთა სტრუქტურა, რომელიც საშუალებას მოგვცემს
         O(1) დროში წავშალოთ ელემენტი.
*/
public class MyStructure {
    private boolean [] nums=new boolean[0];
    private int size;

    public MyStructure() {
    }
    public MyStructure(short [] arr) {
        for(short i : arr){
           insert(i);
        }
    }

    public int getSize() {
        return size;
    }

    public void insert(short n){
        int val=2 * Math.abs(n)+1;

        if(nums.length<val) {
            boolean[] tmp = new boolean[val];
            for (int i = 0; i < nums.length; i++) {
                tmp[i] = nums[i];
            }
            nums = tmp;
        }
        int index;
        if (n <= 0) {
            index=-2 * n;
        } else {
            index= 1+2 * (n -1);
        }
        if(!nums[index]){
            nums[index]=true;
            size++;
        }

    }
    public void delete(short n){
        if(nums.length>2*Math.abs(n)){
            int index;
            if(n<=0){
                index=-2 * n;
            }else{
                index= 1+2 * (n -1);
            }
            if(nums[index]){
                nums[index]=false;
                size-=1;

            }
        }
    }

    @Override
    public String toString() {
        if (size==0)
            return "[]";
        StringBuilder str=new StringBuilder();
        for(int i=0;i<nums.length;i++) {
            if (nums[i]) {
                if (i % 2 == 0) {
                    str.insert(0, ",");
                    str.insert(0, -1 * i / 2);
                } else {
                        str.append((i / 2) + 1).append(",");
                }
            }
        }
        return str.insert(0,"[")
                   .replace(str.length()-1,str.length(),"]")
                      .toString();

    }
}
