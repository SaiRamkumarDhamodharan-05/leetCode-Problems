class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int k=1;
        for(int i=1;i<nums.size();i++){
            nums[k]=nums[i-1]+nums[i];
            k++;
        }
        return nums;
    }
};