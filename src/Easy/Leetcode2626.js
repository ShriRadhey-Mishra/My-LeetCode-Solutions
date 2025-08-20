var reduce = function(nums, fn, init) {
    for (let i = 0; i < nums.length; i++) {
        init = fn(init, nums[i]);
    }
    return init;
};

let nums = [1,2,3,4];
let fn = function sum(accum, curr) { return accum + curr; };
let init = 0;

console.log(reduce(nums, fn, init));