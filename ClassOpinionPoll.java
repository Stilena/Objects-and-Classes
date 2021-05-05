package OpinionPoll_03;

public class ClassOpinionPoll {
    private String name;
    private  int age;


    public ClassOpinionPoll(String name, int age) {
        this.name=name;
        this.age=age;
    }

public String name(){
  return   this.name;
}
public int age(){

        return this.age;
}

    @Override
    public String toString() {
        return name + " - "  + age;
    }
}
