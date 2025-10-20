var sortBy = function(arr, fn) {
    return arr.sort((a, b) => fn(a) - fn(b));
};

const arr = [
    { name: "Rider", speed: 120 },
    { name: "Hunter", speed: 150 },
    { name: "Blaze", speed: 90 },
    { name: "Ghost", speed: 200 }
];

const fn = bike => bike.speed;

console.log(sortBy(arr, fn))