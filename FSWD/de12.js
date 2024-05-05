var arr1 = [1, 3, 5, 7]
var arr2 = [6, 9, 8]
//var third=arr1.concat(arr2)
var third = [...arr1, 50, 60, ...arr2, 90]
//console.log(third)

var person = { name: 'james', age: 30 }
var address = { city: 'Margso', state: 'Goa' }
var jamesadd = { ...person, rating: 40, ...address }
console.log(jamesadd)
