let func = function (a, b) {
    return a + b
}

console.log(func(2, 3))

let funcArrow = (a, b) => a + b
console.log(funcArrow(2, 3))

let sqr = a => a ** 2

let srq1 = function (a) {
    return (a ** 2)
}
console.log(sqr(5))

let twice = () => {
    console.log("more sta")
    return 2 * 5
}
console.log(twice())
