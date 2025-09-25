var addTwoPromises = async function(promise1, promise2) {
    const [num1, num2] = await Promise.all([promise1, promise2]);
    return num1 + num2;
};

const promise1 = Promise.resolve(2);
const promise2 = new Promise(resolve => {setTimeout(() => resolve(8), 2000)});

addTwoPromises(promise1, promise2).then(console.log);