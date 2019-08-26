package tw.commands;

import java.util.ArrayList;
import java.util.List;

public class GuessInputToList {
   
    
    public GuessInputToList() {
        // TODO Auto-generated constructor stub
    }
    public List<Integer> getArray(String input) {
    	List<Integer> list= new ArrayList<>();
        String[] strs=input.split(" ");
        for(int i=0;i<strs.length;i++) {
            list.add(Integer.valueOf(strs[i]));
        }

        return list;

    }
    public String sameCount(List<Integer> answer,List<Integer> input) {
    	int sameA=0;
    	int sameB=0;
    	 if(input.equals(answer)) {
    		   return "right";
    		  }
    	 else {
    	for (int i = 0; i < answer.size(); i++) {
			for (int j = 0; j < input.size(); j++) {
				if(answer.get(i)==input.get(j) && i==j) {
					sameA+=1;
				}else if (answer.get(i)==input.get(j) && i !=j) {
					sameB+=1;
				}
				
			}
		}
    	return sameA+"A"+sameB+"B"; 
	}
 }
}