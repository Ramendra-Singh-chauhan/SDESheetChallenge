class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        
        for(int i=0 ; i<arr.size() ; i++){
            if(arr.get(i)>=0){
                positive.add(arr.get(i));
            }
            else{
                negative.add(arr.get(i));
            }
        }
        if(positive.size()>negative.size()){
            for(int i=0 ; i<negative.size() ;i++){
                arr.set(2*i, positive.get(i));
                arr.set(2*i+1, negative.get(i));
            }
            int index=negative.size()*2;
            for(int i=negative.size() ; i<positive.size() ; i++){
                arr.set(index, positive.get(i));
                index++;
            }
        }
        else{
            for(int i=0 ; i<positive.size() ;i++){
                arr.set(2*i, positive.get(i));
                arr.set(2*i+1, negative.get(i));
            }
            int index=positive.size()*2;
            for(int i=positive.size() ; i<negative.size() ; i++){
                arr.set(index, negative.get(i));
                index++;
            }
        }
    }
}