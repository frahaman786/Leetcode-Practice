class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> sol = new ArrayList<>();
        int Minisum = Integer.MAX_VALUE;
        for(int i = 0; i < list1.length; i++){
            for(int j = 0; j < list2.length; j++){
               if(list1[i].equals(list2[j])){
                 int Sum = i+j;

                 if(Sum < Minisum){
                    Minisum = Sum;
                    sol.clear();
                    sol.add(list1[i]);
                 }
                 else if(Sum == Minisum){
                    sol.add(list1[i]);
                 }

               }
            }
        }
        return sol.toArray(new String[0]);
    }
}