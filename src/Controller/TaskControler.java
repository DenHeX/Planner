/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Task.Task;
import Views.View;

/**
 *
 * @author Pablo Rod
 */
public class TaskControler implements Controller<Task> {

      private TaskList task;
      private View view;
    
    
    @Override
    public void insert(Task obj) {
        if (obj.isComplete()) {
            task.insert(obj);
            this.readAll();
        } else {
            view.displayErrorMessaje("El miembro no está completo.");
        }
    }

    @Override
    public void update(Task obj) {
       if (obj.isComplete()) {
            task.update(obj);
            this.readAll();

        } else {
            view.displayErrorMessaje("El miembro no se ha eliminado.");
        }
    }

    @Override
    public void delete(Task obj) {
        if (task.delete(obj)) {
            this.readAll();
        } else {
            view.displayErrorMessaje("El miembro no está completo.");
        }
    }

    @Override
    public void read(Object id) {
        Task task = taskList.search(id);
        if (task != null) {
            this.view.display(task);
        } else {
            view.displayErrorMessaje("El miembro no se ha encontrado");
        }
    }

    @Override
    public void readAll() {
        
    }
    
}
