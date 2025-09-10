function expect(val) {
    function toBe(anotherVal) {
        if (val === anotherVal) return true
        else {
            throw "Not Equal"
        }
    }
    function notToBe(anotherVal) {
        if (val !== anotherVal) return true
        throw "Equal"
    }
    return {
        toBe,
        notToBe
    }
}

try {
    let output = expect(5).toBe(5);
    console.log(output);
    output = expect(5).notToBe(6);
    console.log(output);
} catch (e) {
    console.log(e);
}

