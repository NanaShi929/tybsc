var day = ""
switch (new Date().getDay){
    case 0:
        day = "sun";
        break;
    case 1:
        day = "mon";
        break;
    case 2:
        day = "tue";
        break;
    case 3:
        day = "wed";
        break;
    case 4:
        day = "thu";
        break;
    case 5:
        day = "fri";
        break;
    case 6:
        day = "sat";
        break;
    default:
        console.log("uwu nigger");
}
console.log(day);
console.log(Date());


str = "we are the wOrld";
s = str.replace(/world/ig, "future");
console.log(s);
x = 89.92199;
console.log(x.toPrecision(6));
console.log((127 - 89).valueOf());
console.log(parseInt("10 20 30"));
console.log(parseInt("10 years"));
console.log(parseInt("years 10"));