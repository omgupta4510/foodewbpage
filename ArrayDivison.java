import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
 
public class Solution {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
 
    public static void main(String[] args) {
        FastReader br=new FastReader();
        int n= br.nextInt();
        int k= br.nextInt();
        int[] arr=new int[n];
        long sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]= br.nextInt();
            sum+=arr[i];
            if(max<arr[i])max=arr[i];
        }
        long l=max;
        long h=sum;
        long ans=max;
        while(l<=h){
            long mid=l+(h-l)/2;
            int count=check(mid,arr,k,n);
            if(count<=k){
                h=mid-1;
                ans=mid;
 
            }
            else{
                l=mid+1;
            }
 
        }
        System.out.println(ans);
    }
 
    public static int check(long mid,int[] arr,int k,int n){
        long sum=0;
        int count=0;
        for(int i=0;i<n;i++){
 
            if(sum+arr[i]>mid){
                count++;
                sum=0;
            }
            if(arr[i]>mid){
                return k+1;
            }
            sum+=arr[i];
        }
        if(sum>0)count++;
        return count;
    }
 
}
