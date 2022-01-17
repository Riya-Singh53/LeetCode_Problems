import java.util.*;
public class TwoSum{
    public static int[] twoSum(int[] nums, int target) 
    {
       for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; ++j)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
    return new int[]{0,0};
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(twoSum(a,target));
    }
}