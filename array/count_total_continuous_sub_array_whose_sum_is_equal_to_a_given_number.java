/*
Count total continuous sub array whose sum is equal to a given number
Note: Rename this filename as Main.java or your wish
*/
public class ArjKeys
{
    static Scanner scan=new Scanner(System.in);
    static int n;
    static int a[];
    
    public void subarraySum() 
    {
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=nums[j];
                if(sum==k)
                    res+=1;
            }
        }
        System.out.println(res);
    }
	public static void main(String args[])
	{
		n=scan.nextInt();
		
		for(int i=0;i<n;i++)
            a[i]=scan.nextInt();
		subarraySum();
	}
}
