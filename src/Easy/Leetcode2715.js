var cancellable = function (fn, args, t) {
    const timer = setTimeout(() => {
        fn(...args);
    }, t);

    return function cancelFn() {
        clearTimeout(timer);
    };
};

const cancelTimeMs = 50;
const cancelFn = cancellable((x) => console.log(x * 5), [2], 20);
setTimeout(cancelFn, cancelTimeMs)