class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {

        unordered_map<int, int> mp;

        // First pass
        for(int i = 0; i < nums.size(); i++) {
            mp[nums[i]] = i;
        }

        // Second pass
        for(int i = 0; i < nums.size(); i++) {

            int complement = target - nums[i];

            if(mp.count(complement) && mp[complement] != i) {
                return {i, mp[complement]};
            }
        }

        return {};
    }
};