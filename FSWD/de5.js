function display(input) {
    for (x in input)
        console.log(x + "-" + input[x]);
}
function getinput(inp, cbf) {
    if (typeof (inp) == "object")
        cbf(inp);
    else
        console.log(inp);
}
var str = { name: "jimmy", age: 89, address: "margao" };
getinput(str,display)