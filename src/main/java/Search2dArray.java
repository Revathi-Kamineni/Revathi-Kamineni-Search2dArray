public class Search2dArray {
    /**
     * Receive a 2d array of ints. (That's an array of arrays!)
     * Your task is to search the array for a matching value, return true if found false otherwise.
     * You'll need to use a for loop within a for loop - each for loop handles searching in a particular dimension.
     * I recommend reasoning through this problem on pencil and paper.
     *
     * @param nums a two dimensional array - meaning, an array of arrays.
     * @param target a value that may be contained within nums.
     * @return true if nums contains target, and false otherwise.
     */
    public boolean search(int[][] nums, int target){
        /*
            for(int i=0;i<nums.length;i++){
            for(int j=0; j< num[i].length;j++){
            if(nums[i][j] == target){
            return true;
            }
            }
            }
            return false;
            }
            
        */

        /*int n = nums.length;
    int m = nums[0].length;
    int low=0;
    int high = (n*m)-1;
   
    
    while(low<=high){   
    int mid = (low+(high-low)/2);
    if(nums[mid/m][mid%m]==target){
        return true;
    }
    else if(nums[mid/m][mid%m]<target){
        low=mid+1;
    }else{
        high = mid-1;
    }
}
    return false;
    }
}
*/
        if(nums==null || nums.length==0 || nums[0].length==0) 
        return false;

    int m = nums.length;
    int n = nums[0].length;

    int start = 0;
    int end = m*n-1;

    while(start<=end){
        int mid=(start+end)/2;
        int midX=mid/n;
        int midY=mid%n;

        if(nums[midX][midY]==target) 
            return true;

        if(nums[midX][midY]<target){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
        return false;
    }
}
