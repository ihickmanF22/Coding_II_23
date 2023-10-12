public class ID_Num {
    private String id;
    public ID_Num() {
        id = "##-####";
}
public ID_Num(String newID) {
id = newID;
    }
    public String getID(){
        return id;
    }
    public void setID(String newID){
        id = newID;
    }
    public ID_Num(ID_Num obj) {
        this.id = obj.getID();
    }
}