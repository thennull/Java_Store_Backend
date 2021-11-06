package br.com.server.northwind.controllers;

import br.com.server.northwind.models.Employees;
import br.com.server.northwind.repository.IEmployeesRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Base64;


@Controller
@RequestMapping("/")
public class TestController {
   
   @Value( "${serverApi.services.url}" )
   private String BASE_URL;
   
   @Autowired
   private IEmployeesRepo repository;
   
   private static final Logger LOGGER = LoggerFactory.getLogger( TestController.class );
   
   @GetMapping("testApi")
   public void logData (){
      LOGGER.info( "Logging for test purposes: {}", BASE_URL );
   }
   
   @GetMapping("hello")
   public String hello () {
      return "hello";
   }
   
   @GetMapping("sendData")
   public ModelAndView sendData () {
      ModelAndView mav = new ModelAndView( "data" );
      mav.addObject( "message", "Take up one ideia and make it your life" );
      return mav;
   }
   
   @GetMapping("employee")
   public ModelAndView getEmployee () {
      Employees employee = this.repository.findById( 1L ).get();
      ModelAndView mav = new ModelAndView( "employee" );
      mav.addObject( "employee", employee );
      mav.addObject( "image", Base64.getMimeEncoder().encodeToString( employee.getPhoto() ) );
      System.out.println("Image here: " +  Base64.getMimeEncoder().encodeToString( employee.getPhoto() ));
      return mav;
   }
   
   @GetMapping("employees")
   public ModelAndView getEmployees () {
      ModelAndView mav = new ModelAndView( "employees" );
      mav.addObject( "employees", this.repository.findAll() );
      return mav;
   }
}
