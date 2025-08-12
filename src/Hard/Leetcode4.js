var findMedianSortedArrays = function(nums1, nums2) {
    nums = [...nums1, ...nums2].sort((a, b) => a - b);
    console.log(nums)
    let median = (nums.length%2 === 0) ? (nums[nums.length/2] + nums[(nums.length/2 -1)])/2 :  nums[(nums.length-1)/2];
    return median;
};

let nums1 = [1,2];
let nums2 = [3]
console.log(findMedianSortedArrays(nums1, nums2));