var cars = ['Zen', 'I10', 'Polo', 'Exter']
var cars1 = []
for (i = 0; i < cars.length; i++)
    cars1.push(`@@@${cars[i]}@@@`)
for (c of cars1)
    console.log(c)

var cars2 = []

cars.forEach((c) => cars2.push(`###${c}###`))
for (c of cars2)
    console.log(c)

//var carsmap=cars.map(c=>`$$$${c}$$$` ) .join("-").substr(0,6)

var carsmap = cars.map(c => `$$$${c}$$$`)
for (c of carsmap)
    console.log(c)
//console.log(carsmap)

