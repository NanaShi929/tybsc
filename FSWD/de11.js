var items = [
    { itemcode: "I-1", itemname: "Laptop1", price: 12000 },
    { itemcode: "I-2", itemname: "Laptop2", price: 10000 },
    { itemcode: "I-3", itemname: "Laptop3", price: 15000 },
    { itemcode: "I-4", itemname: "Laptop4", price: 9000 }
]

var itmsArray = items.map(it => it.itemname)
for (i of itmsArray)
    console.log(i)


var filterItms = items.filter(i => i.price > 10000).map(c => c.itemname)
for (c of filterItms)
    console.log(f)

var tot = items.reduce((p, c) => p + c.price, 0)
console.log(tot)
