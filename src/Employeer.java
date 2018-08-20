
public class Employeer {
    // Attributes
    private final String name;
    private String section;
    private final int id;
    private static int nextid =1;
    
    //methods
    public Employeer(String name){
        this.name = name;
        this.section = "Administration";
        this.id = nextid;
        nextid++;
        
    }
    
    public void setSection(String section){
        this.section=section;
    }
    
    public String getData(){
        return "Name: "+name+", Section: "+section+", Id: "+id;
    }
    
    public static String getNextId(){
        return "The Next id is: "+nextid;
    }
    
}
