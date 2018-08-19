package controllers;

import models.Task;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {
  
    public static Result index() {
        return redirect(routes.Application.tasks()); 
    }
    
	// formulario
    private static Form<Task> taskForm = Form.form(Task.class);
    
    public static Result tasks(){
    	return ok( views.html.tasks.list.render(Task.all(), taskForm) ); // Eclipse nao entende
    }
  
    public static Result addTask(){
    	Form<Task> formFilled = taskForm.bindFromRequest();
    	if(formFilled.hasErrors()){
    		return badRequest( views.html.tasks.list.render(Task.all(), formFilled) );
    	}else{
    		Task.add( formFilled.get() );
    		return redirect( routes.Application.tasks() );
    	}
    }
    
    public static Result deleteTask(Long id){
    	Task.delete(id);
    	return redirect(routes.Application.tasks());
    }
}
