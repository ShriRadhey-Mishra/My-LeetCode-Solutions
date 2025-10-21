var cancellable = function (fn, args, t) {
    fn(...args);

    // 2. schedule repeated calls every t ms
    const intervalId = setInterval(() => {
        fn(...args);
    }, t);

    // 3. return cancel function
    return () => {
        clearInterval(intervalId);
    };
};

const result = [];
const fn = (x) => x * 2;const args = [4], t = 35, cancelTimeMs = 190;
const start = performance.now();
const log = (...argsArr) => {const diff = Math.floor(performance.now() - start);result.push({"time": diff, "returned": fn(...argsArr)});}
const cancel = cancellable(log, args, t);
setTimeout(cancel, cancelTimeMs);
setTimeout(() => {
    console.log(result);
}, cancelTimeMs + t + 15)