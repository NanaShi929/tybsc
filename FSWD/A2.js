const prompt = require("prompt-sync")();

emps = [{
    ssn: '123', nkname: 'jim', salary: 5000, dept: 'sales'
},
{
    ssn: '234', nkname: 'kim', salary: 4000, dept: 'adv'

}, {
    ssn: '345', nkname: 'rim', salary: 5500, dept: 'production'
},
{
    ssn: '456', nkname: 'sim', salary: 5500, dept: 'sales'
},
{
    ssn: '567', nkname: 'tim', salary: 7000, dept: 'adv'
    }]
console.log(emps)
let empsData = emps.map((emps) => emps.dept)

console.log(empsData)
let deptName=prompt("enter dept name:-").toLowerCase()
// if(emps.filter(dept))
// let name = emps.map((emps) => emps.dept)
// if (name != /deptName/ig) {
//     console.log("not found")
// }
// else {
//     console.log("found it")
// } 
console.log(deptName)
let name = emps.filter((emps) => emps.dept==`${deptName}`
    

)

if (name .length== 0) {
    console.log(`${deptName} not found`)
  
}
else {
    console.log(`${deptName} found it`)
    let sal = name.reduce((p, c) => p + c.salary, 0)

    console.log(`${deptName} total ` + sal)
    // if (sal == null) {
    //     console.log("not found")
    // }
    // else {
        let avg = sal / name.length
        console.log(`Avg of ${deptName} dept ` + avg)
    // }
}

console.log(name)

// if (name == deptName) {
    

// }
// else {
//     return 0
// }


