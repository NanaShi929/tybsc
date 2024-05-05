class Student {
    constructor(rollno, year) {
        this.rollno = rollno
        this.year = year
    }

    display() {
        console.log(`Rollno : ${this.rollno}`)
        console.log(`Year : ${this.year}`)

    }
}

var s1 = new Student("133", "FYBSc")
s1.display()

