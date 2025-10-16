class Calculator {
    constructor(value) {
        this.current = value;
    }

    add(v) {
        this.current += v;
        return this;
    }

    subtract(v) {
        this.current -= v;
        return this;
    }

    multiply(v) {
        this.current *= v;
        return this;
    }

    divide(v) {
        if (v === 0) {
            throw new Error("Division by zero is not allowed");
        }
        this.current /= v;
        return this;
    }

    power(v) {
        this.current = this.current ** v;
        return this;
    }

    getResult() {
        return this.current;
    }
}



let obj = new Calculator(2).multiply(5).power(2).getResult()

console.log(obj);