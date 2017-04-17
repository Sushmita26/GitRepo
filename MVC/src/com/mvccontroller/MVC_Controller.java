package com.mvccontroller;
///this is my second commit
///this will be shown only after i commit
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVC_Controller {
	
	@RequestMapping(value="/employeeForm.html" , method = RequestMethod.GET)
	public ModelAndView getEmployeeForm()
	{
		ModelAndView model = new ModelAndView("EmployeeForm");
		
		return model;
	

	}
	
	@RequestMapping(value="/submitEmployeeForm.html" , method = RequestMethod.POST)
	public ModelAndView submitEmployeeForm(@RequestParam("employeeName") String name , @RequestParam("employeeAge") int num)
	{
		ModelAndView model = new ModelAndView("EmployeeSuccess");
		model.addObject("msg","Details submitted by you:: Name: "+name+ " , Age:" + num);
		
		return model;
	}

}
