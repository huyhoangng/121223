package demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        ArrayList<String>  arrayList = new ArrayList<>();

        HashSet<String> hs = new HashSet<>();
        hs.add("Hello");
        hs.add("World");
        hs.add("Hello");
        System.out.println(hs.size());

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("BB");
        pq.add("CC");
        pq.add("AA");
        pq.add("BA");
        pq.add("AC");

        System.out.println("PQ size:"+pq.size());
        while (pq.size() > 0){
//            pq.peek(); // lấy thằng đầu danh sách chứ ko bỏ đi
            String s = pq.poll(); // lấy thằng đầu danh sách ra và bỏ đi
            System.out.println(s);
        }
        System.out.println(pq.size());

        PriorityQueue<Person> pqp = new PriorityQueue<>(
                (o1, o2) -> o1.getName().compareTo(o2.getName())
        );
        pqp.add(new Person("Hoang",23));
        pqp.add(new Person("Nam",20));
        pqp.add(new Person("Dien",22));
        while (pqp.size()>0){
            Person p = pqp.poll();
            System.out.println(p.getName());
        }
        HashMap<String,String> hm = new HashMap<>();
        hm.put("name","Hoang");
        hm.put("School","Fpt Aptech");
        System.out.println(hm.get("name"));
        System.out.println(hm.get("School"));
    }
}
