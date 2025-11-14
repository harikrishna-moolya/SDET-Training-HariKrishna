package ofc1;
import java.util.*;

public class HKCollections {
public static void main(String[] args) {
	System.out.println("---- ARRAYLIST ----"+"\n");
	ArrayList<Integer> a= new ArrayList<Integer>();
	a.add(40);
	a.add(30);
	a.add(20);
	a.add(50);
	a.add(10);
	
	System.out.println("ArrayList: "+a+"\n");
	a.remove(2);
	System.out.println("After removing an element:"+a+"\n");
	System.out.println("Contains '30'? :-" + "'"+a.contains(30)+"'\n");
	Collections.sort(a);
	System.out.println("After Sorting:"+a+"\n");
	
	System.out.println("\n---- HASHMAP ----"+"\n");
    HashMap<Integer, String> emp = new HashMap<>();
    emp.put(1, "HARI");
    emp.put(2, "KRISHNA");
    emp.put(3, "RAM");
    emp.put(4, "SHYAM");
    System.out.println("Emp HashMap: " + emp+"\n");
    Set<Map.Entry<Integer, String>> entries = emp.entrySet();
    for (Map.Entry<Integer, String> entry : entries) {
        System.out.println("id: " + entry.getKey() + " → Name: " + entry.getValue()+"\n");
    }
    System.out.println("Traversing only values:");
    for (String name : emp.values()) {
        System.out.println(name);
    }
    System.out.println("\n"+"Traversing only keys:");
    for (Integer id : emp.keySet()) {
        System.out.println(id);
    }
    
    
    System.out.println("\n---- HashSet ----"+"\n");
    HashSet<String> user = new HashSet<>();
    user.add("HARI");
    user.add("RAM");
    user.add("SHYAM");
    user.add("PREM");
    user.add("RAM");
    user.add("PREM");
    System.out.println("user Set: " + user+"\n");
    System.out.println("Contains RAM? " + user.contains("RAM")+"\n");
    user.remove("PREM");
    System.out.println("After removing PREM: " + user+"\n");
    for (String u : user) {
        System.out.println(u);
    }
    System.out.println("\n---- LinkedList ----"+"\n");
    LinkedList<String> q = new LinkedList<>();
    q.add("Hari");
    q.add("Suri");
    q.add("shyam");
    q.add("karim");
    System.out.println("Initial Queue: " + q+"\n");
    System.out.println("Front element (peek): " + q.peek()+"\n");
    System.out.println("Removed: " + q.remove()+"\n");
    System.out.println("Queue after remove: " + q+"\n");
    q.add("Kusuma");
    System.out.println("After adding 'Kusuma': " + q+"\n");
    System.out.println("Polled element: " + q.poll()+"\n");
    System.out.println("Queue after poll: " + q+"\n");
    System.out.println("Is queue empty? " + q.isEmpty());
	
	}
}
