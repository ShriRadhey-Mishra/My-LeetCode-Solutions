var chunk = function (arr, size) {
    if (arr === null) return arr;
    const result = [];
    for (let i = 0; i < arr.length; i += size) {
        result.push(arr.slice(i, i + size))
    }
    return result;
};

let arr =[1,2,3,4,5]
let size = 2

console.log(chunk(arr, size))