class Solution(object):
    def search(self, nums, target,l=0,h=None):
        if h is None:
               h=len(nums)
        m=(l+h)/2
        if(l==h):
            return -1
        if(nums[m]==target):
          return m
        if(nums[m]>target):
            return self.search(nums,target,l=l,h=m)
        else:
            return self.search(nums,target,l=m+1,h=h)
        