var createCounter = function(init) {
    return {
        init,
        ogVal: init,
        increment() {
            this.ogVal++;
            return this.ogVal;
        },
        decrement(){
            this.ogVal--;
            return this.ogVal;
        },
        reset() {
            this.ogVal = init;
            return this.ogVal;
        }
    }
};

let init = 5;
const counter = createCounter(5);
console.log(counter.increment()); // 6
console.log(counter.reset()); // 5
console.log(counter.decrement()); // 4