
class StudentMarks{
    constructor(RollNo,Subject,Marks) {
        this.RollNo = RollNo
        this.Subject=Subject
        this.Marks = Marks
        // this.Grade=''
    }
    
    grade() {
        if (this.Marks >=90) {
            this.Grade="A"
        }
        else if (this.Marks <= 89 && this.Marks >= 50) {
            this.Grade ="B"
        }
        else {
            this.Grade="C"
        }

    }
      
    display() {
        console.log(this.RollNo)
        console.log(this.Subject+":-" + this.Marks)
        // console.log(this.Marks)
        console.log(this.Grade)
     }
}
var s = new StudentMarks("S21-626", "Math ", 89)
s.grade()

s.display();