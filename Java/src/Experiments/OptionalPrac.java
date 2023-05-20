package Experiments;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Member{
    private Long id;
    private String name;
    Member(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(Long id) {this.id = id;}
    public String getName() {
        return name;
    }
    public Long getId() {return id;}

    @Override
    public java.lang.String toString() {
        return String.format("(key: %d, value: %s)", this.id, this.name);
    }
}

public class OptionalPrac {
    public static void main(String[] args) {
        Map<Long, Member> memlist = new HashMap<>();
        memlist.put(0L, new Member(0L, "jae"));
        memlist.put(1L, new Member(1L, "lee"));
        Optional<Member> mem = Optional.ofNullable(memlist.get(2));
//        Member mem = Optional.ofNullable((memlist.get(2))).orElse(new Member(-1L, "null"));
        System.out.println(mem);

    }
}
