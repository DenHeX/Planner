/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Members;

import Models.List;
import java.util.HashMap;

/**
 *
 * @author Student
 */
public class MemberList implements List<Member>{
    HashMap<String, Member> members = new HashMap<>();

    @Override
    public boolean insert(Member obj) {
        members.put(obj.getId(), obj);
        return true;
    }
    
    public boolean update(Member member) {
        return insert(member);
    }

    @Override
    public boolean delete(Member obj) {
        if (members.containsKey(obj)) {
            members.remove(obj);
            return true;
    }

    @Override
    public Member search(Object id) {
        return members.get(id);
    }

    @Override
    public Member[] toArray() {
        return members.values().toArray(new Member[0]);
    }

    public MemberList() {
        this.members=new HashMap<>();
    }    
    
}
