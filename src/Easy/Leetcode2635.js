var map = function(arr, fn) {
    const mapArr = [];
    for (let i = 0; i < arr.length; i++) {
        mapArr[i] = fn(arr[i], i);
    }
    return mapArr;
};

const arr = [1,2,3];
const fn = (arrElem, i) => {
    return arrElem+1;
};

console.log(map(arr, fn));