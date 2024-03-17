package pertemuan6;

public class listTest3 {
	public static void main(String[] args) {
        strukturList list = new strukturList();
        list.addTail(5);
        list.addTail(4);
        list.addTail(6);
        list.displayElement();
        System.out.println("\nList Kosong"+ list.deleteList());
        
        
}
}
