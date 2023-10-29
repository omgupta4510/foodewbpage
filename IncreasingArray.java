import java.util.Scanner;
 
class IncreasingArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] nums=new long[n];
        long c=0;
        for(int i=0;i<n;i++){
            nums[i]=sc.nextLong();
            if(i!=0 && nums[i-1]>=nums[i]){
                c+=nums[i-1]-nums[i];
                nums[i]=nums[i-1];
            }
        }
        System.out.println(c);
    }
}
