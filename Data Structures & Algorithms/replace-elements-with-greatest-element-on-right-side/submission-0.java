class Solution {
    public int[] replaceElements(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int max=arr[right];
        arr[right]=-1;
        for(int i=right-1;i>=left;i--)
        {
            if(arr[i]>max)
            {
                int temp=arr[i];
                arr[i]=max;
                max=temp;

            }
            else
            {
                arr[i]=max;
            }

        }
        return arr;
    }
}