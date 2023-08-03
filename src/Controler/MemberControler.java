/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Models.Members.Member;
import Models.Members.MemberList;
import Views.View;

/**
 *
 * @author denze
 */
public class MemberControler implements Controler<Member>{
    private MemberList list;
    private View view;

    public MemberControler(View view) {
        this.list = MemberList.getInstance();
        this.view = view;
    }
    
    @Override
    public void insert(Member obj) {
        if (obj.isComplete()) {
            list.insert(obj);
            this.readAll();
        } else {
            view.displayErrorMessaje("El miembro no está completo.");
        }
    }

    @Override
    public void update(Member obj) {
        if (obj.isComplete()) {
            list.update(obj);
            this.readAll();

        } else {
            view.displayErrorMessaje("El miembro no se ha eliminado.");
        }
    }
    

    @Override
    public void delete(Member obj) {
        if (list.delete(obj)) {
            this.readAll();
        } else {
            view.displayErrorMessaje("El miembro no está completo.");
        }
    }

    @Override
    public void read(Object id) {
        Member member = list.search(id);
        if (member != null) {
            this.view.display(member);
        } else {
            view.displayErrorMessaje("El miembro no se ha encontrado");
        }
    }

    @Override
    public void readAll() {
        Member[] members = this.list.toArray();
        if (members.length > 0) {
            this.view.displayAll(members);
        }
    }
    
}