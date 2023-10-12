public class NumTest {
    public static void main(String[] args) {
        ID_Num id1 = new ID_Num();
        ID_Num id2 = new ID_Num("55-1234");
        ID_Num id3 = new ID_Num("76-4286");
        ID_Num id4 = id3;
        ID_Num id5 = new ID_Num("98-2230");
        ID_Num id6 = new ID_Num(id5);

        id4.setID("28-3597");
        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id6);
    }
}