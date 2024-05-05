// const prompt = require("prompt-sync")();

// // let name = prompt("enter name  ")
// // let address = prompt("enter address   ")
// let balance = parseInt(prompt("enter balance"))
// // let years = parseInt(prompt("enter year "))
// let interest



// function bankdetails(customer, simpleinterest) {

//     if (balance < 0) {
//         console.log("Number is not correct please enter again")
//         do {
//             // balance = Number.parseInt(balance);
//             balance = prompt("enter again")
//             balance = Number.parseInt(balance);
//         }while(balance>=0)
//     }
//     // do {
//     //     balance = Number.parseInt(balance);
//     //     if (balance < 0) {
//     //         balance = prompt("enter again")
//     //         balance = Number.parseInt(balance);
//     //     }
        
//     // }while(balance>=0)
//     else {
        
//      if (balance <= 100000) {
//         interest = balance * 0.05
//         balance = balance + interest

//     }
//     else {
//         interest = balance * 0.07
//         balance = balance + interest
//     }
//     }

//     return balance
//     // console.log(balance)
// }
// // console.log(customer)
// // let initialBalance = parseInt(prompt("enter balance"));
// // let finalBalance = bankdetails(initialBalance);
// bankdetails()
// const customer = {
//     // name: `${name}`,
//     // address: `${address}`,
//     balance: `${balance}`
//     // balance: finalBalance.toString(),
// }
// console.log(customer)

// // console.log(customer.name+ customer.address +`${balance}`)
// // const prompt = require("prompt-sync")();

// // let balance;

// // function getValidBalance() {
// //     do {
// //         balance = parseInt(prompt("Enter balance: "));
// //         if (isNaN(balance) || balance < 0) {
// //             console.log("Invalid balance. Please enter a non-negative number.");
// //         }
// //     } while (isNaN(balance) || balance < 0);
// // }

// // getValidBalance();

// // let interest;

// // function bankdetails() {
// //     do {
// //         if (balance <= 100000) {
// //             interest = balance * 0.05;
// //             balance = balance + interest;
// //         } else {
// //             interest = balance * 0.07;
// //             balance = balance + interest;
// //         }
// //     } while (balance >= 0);
// // }
// // getValidBalance();

// // bankdetails();
// // getValidBalance();

// // const customer = {
// //     // name: prompt("Enter name: "),
// //     // address: prompt("Enter address: "),
// //     balance: balance.toString()
// // };

// // console.log(customer);

const prompt = require("prompt-sync")();
let years = parseInt(prompt("Enter number of years: "));

let balance = parseInt(prompt("Enter balance: "));
let interest;

function getValidBalance() {
    let inputBalance;
    do {
        inputBalance = parseInt(prompt("Enter balance again: "));
    } while (inputBalance < 0);
    return inputBalance;
}

function bankdetails(initialBalance, numYears) {
    let totalBalance = initialBalance;

    for (let year = 1; year <= numYears; year++) {
        if (totalBalance < 0) {
            console.log("Number is not correct. Please enter again.");
            totalBalance = getValidBalance();
        } else {
            if (totalBalance <= 100000) {
                interest = totalBalance * 0.05;
                totalBalance += interest;
            } else {
                interest = totalBalance * 0.07;
                totalBalance += interest;
            }
            console.log(`Year ${year}: Balance after interest - ${totalBalance}`);
        }
    }

    return totalBalance;
}

const finalBalance = bankdetails(balance, years);

const customer = {
    balance: finalBalance.toString(),
};

console.log(customer);
