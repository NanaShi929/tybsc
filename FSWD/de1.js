var age = 56;
str = (age >= 18) ? "can vote" : "cannot";
console.log(str)

if (age > 18)
    str = "can vote";
else
    str = "cant vote";
console.log(typeof ('john'));

for (i = 0; i < 5; i++) {
    console.log("value" + i);
}

var per = { name: "jim", age: 20, address: "margao", bool: true }
for (x in per)
    console.log(x + "-" + per[x]);
var num = [1, 2, 3]
for (x of num)
    console.log(x)
// let num = 2;
// let word =
//     num === 1
//         ? 'one'
//         : num === 2
//             ? 'two'
//             : num === 3
//                 ? 'three'
//                 : 'unknown';
//                 console.log(word)