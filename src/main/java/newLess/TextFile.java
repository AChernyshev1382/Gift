package newLess;

public class TextFile{
    String name;
    String pass;

    public TextFile(String name, String pass){
        this.name=name;
        this.pass=pass;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPass(String pass){
        this.pass=pass;
    }

    public String getName(){
        return name;
    }

    public String getPass(){
        return pass;
    }

    @Override
    public String toString(){
        return this.name + this.pass;

    }
}
