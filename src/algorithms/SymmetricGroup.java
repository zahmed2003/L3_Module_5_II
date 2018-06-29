package algorithms;

import java.util.List;
import java.util.*;

public class SymmetricGroup 
{
	
	List<Integer> set;
	ArrayList<String> group;
	
public static void main(String[] args) 
{
	SymmetricGroup sn = new SymmetricGroup();
	sn.permute(java.util.Arrays.asList(1, 2, 3, 4, 5), 0);
	System.out.println(sn.group);
	
}

public void insertOrder(List<Integer> set, int n)
{
	for(int i = 1; i <= n; i++)
	{
		set.add(i);
	}
}

 public void permute(List<Integer> arr, int k){
    for(int i = k; i < arr.size(); i++){
        Collections.swap(arr, i, k);
        permute(arr, k+1);
        Collections.swap(arr, k, i);
    }
    if (k == arr.size() -1){
    		group.add(Arrays.toString(arr.toArray()));
    }
}

}
