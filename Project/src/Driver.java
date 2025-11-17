public class Driver {

    String name;
    int age;
    

    public Driver(String name,int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return " the dirvers name is " + name + " and is  driving " + ((age < 16) ? "illegally" : "legally") + " at the age of " + age;  
    }
}