class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int []c=new int[n1.length+n2.length];
        for(int i=0;i<n1.length;i++){
            c[i]=n1[i];
        }
        for(int i=0;i<n2.length;i++){
            c[n1.length+i]=n2[i];
        }
        Arrays.sort(c);
        int div=c.length%2;
        if(div != 0){
            float divi=c.length/2;
            int ans=(int)divi;
            int l=c[ans];
            return (double)l;

        }
        else{
            int divi1=c.length/2;
            int ans1=divi1;
            int ans2=divi1-1;
            int h=c[ans1]+c[ans2];
            double k=(double)h/2;
            return k;
        }
    }
}