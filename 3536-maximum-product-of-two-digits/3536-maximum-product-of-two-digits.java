class Solution {
    public int maxProduct(int n) {

       String s = String.valueOf(n);
int[] arr = new int[s.length()];

for (int i = 0; i < s.length(); i++) {
    arr[i] = s.charAt(i) - '0';
}
        int max=0;
       for(int i=0;i<arr.length;i++)
       {
        for(int j=i+1;j<arr.length;j++)
        {
            int mul=arr[i]*arr[j];
            if(mul>max)
            {
                max=mul;
            }
        }
       }
        return max;
    }
}