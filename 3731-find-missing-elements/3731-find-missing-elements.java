class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int s=Integer.MAX_VALUE;
        int e=0;
        for(int i: nums){
            s=Math.min(s,i);
            e=Math.max(e,i);
        }
        int fq[]=new int[e+1];
        for(int i: nums){
            fq[i]++;
        }
        List<Integer>res=new ArrayList<>();
        for(int i=s;i<=e;i++){
            if(fq[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}