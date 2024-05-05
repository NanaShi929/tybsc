class Per {
    constructor(name, age) {
        this.n = name
        this.age = age
    }
    display() {
        console.log(` Name: ${this.n}`)
        console.log(` Age: ${this.age}`)

    }
}

class Student extends Per {
    constructor(roll, year, name, age) {
        super(name, age)
        this.rollno = roll
        this.year = year


    }

    displaydetails() {
        this.display()
        console.log(` RollNo: ${this.rollno}`)
        console.log(` Year: ${this.year}`)
    }
}

var s1 = new Student("123", "SYBSC", "Adam", 20)
s1.displaydetails()

