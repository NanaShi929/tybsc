var per = { name: "Jim", age: 50, year: "FYBSC", address: { city: "Margao", state: "Goa" } }
const { name: n, age, year, address: { city, pin = 678678 } } = per
console.log(n)
console.log(age)
console.log(year)

console.log(city)

console.log(pin)
