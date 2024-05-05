import javax.lang.model.element.Name;

//employee profile will include name, title, post held, institute name.
public class Employee {
    public String Name,Title,Post,institute_Name;
    public Employee(String Name,String Title,String Post,String institute_Name){
        this.institute_Name=institute_Name;
        this.Name=Name;
        this.Post=Post;
        this.Title=Title;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }

    public String getInstitute_Name() {
        return institute_Name;
    }

    public void setInstitute_Name(String institute_Name) {
        this.institute_Name = institute_Name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", Title='" + Title + '\'' +
                "Name='" + Name + '\'' +
                ", Post='" + Post + '\'' +
                ", institute_Name='" + institute_Name + '\'' +
                '}';
    }
}