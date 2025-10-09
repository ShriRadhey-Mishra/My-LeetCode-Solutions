let createHelloWorld = function() {
    const greet = "Hello World"
    return function(...args) {
        return greet
    }
};

console.log(createHelloWorld()());