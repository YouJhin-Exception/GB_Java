package StartJava.Sem6;

import java.util.List;

public class Cat {
    int age;
    String name;
    List<String> diseaseStory;
    Integer pass;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDiseaseStory() {
        return diseaseStory;
    }

    public void setDiseaseStory(List<String> diseaseStory) {
        this.diseaseStory = diseaseStory;
    }

    public Integer getPass() {
        return pass;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.equals(obj)) return true;
        if (!(obj instanceof Cat cat)) return false;
        return this.getName().equals(cat.getName()) && (this.getPass().equals(cat.getPass()));
    }

    @Override
    public int hashCode() {
        return pass + name.hashCode();
    }
}
