var argumentsLength = function(...args) {
    let x = 0;
    for (let arg of args) x++;
    return x;
};

console.log(argumentsLength(1, 2, 3, 4, 5));