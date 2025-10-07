var filter = function(arr, fn) {
    let filtered = [];
    arr.forEach((el, i)=> {
        if (fn(el, i)) filtered.push(el);
    });
    return filtered;
};

const firstIndex = (n, i) => {
 return n>3;
}

let arr = [1, 2, 3, 4, 5];

console.log(filter(arr, firstIndex));
