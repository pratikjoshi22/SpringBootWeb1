package com.pratik.SpringBootWeb1.Controller;

// Package declaration for organizing the class into a specific namespace.

// Importing required classes and annotations.
import com.pratik.SpringBootWeb1.Model.Alien;
import org.springframework.stereotype.Controller; // Marks this class as a Spring MVC Controller.
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping; // Maps HTTP requests to specific methods.
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller // Marks this class as a Spring MVC Controller to handle HTTP requests.
public class HomeController {

    @ModelAttribute("course")
    public String courseName() {
        return "Java";
    }

    @RequestMapping("/") // Maps the root URL ("/") to this method.
    public String Home() {
        System.out.println("HomeController method is called"); // Logs a message to the console indicating this method was called.
        return "index"; // Returns the view name "index1.jsp" to render the home page.
    }

//    @RequestMapping("add") // Maps the URL "/add" to this method.
//    public String add(HttpServletRequest req, HttpSession session) {
//        System.out.println("welcome to add"); // Logs a message indicating the "add" method was triggered.
//
//        // Retrieves the first number from the request parameters and converts it to an integer.
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//
//        // Retrieves the second number from the request parameters and converts it to an integer.
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//
//        // Performs the addition of the two numbers.
//        int result = num1 + num2;
//
//        // Stores the result in the user's session, making it available across multiple requests.
//        session.setAttribute("result", result);
//
//        System.out.println(result); // Logs the result of the addition to the console.
//
//        return "result1.jsp"; // Returns the view name "result1.jsp" to display the addition result.
//    }



//    •	When the URL /add is accessed, Spring looks for query parameters named num1 and num2 in the HTTP request.
//            •	For example, if the URL is http://localhost:8080/add?num1=5&num2=10:
//            •	num1=5 and num2=10 are the query parameters passed to the request.
//    @RequestMapping("add") // Maps the URL "/add" to this method.
//    public String add(@RequestParam("num1") int no1, @RequestParam("num2") int no2, Model model) {
//
//        //we can also use the input type name ex:- int num1 & num2 as parameter without param
//
//        // Performs the addition of the two numbers.
//        int result = no1 + no2;
////        •	A Model object in Spring MVC is used to pass data from the controller to the view.
////     	•	Unlike HttpSession, data in the Model is stored temporarily for the duration of the request and does not persist across multiple requests.
//
//        model.addAttribute("result",result);
//
////  •	model.addAttribute("result", result);
////	•	This adds the result (sum of no1 and no2) to the Model object with the key "result".
////	•	The data stored in the model can be accessed directly in the view (e.g., JSP) using the key.
//
//        System.out.println(result); // Logs the result of the addition to the console.
//
//        return "result"; // Returns the view name "result1.jsp" to display the addition result.
//    }

    @RequestMapping("add") // Maps the URL "/add" to this method.
    public ModelAndView add(
            @RequestParam("num1") int no1,
            @RequestParam("num2") int no2,
            ModelAndView mv) {

//        if you want to work with model && view both if only data then use model obj

        // Performs the addition of the two numbers.
        int result = no1 + no2;

        // Set the view name to "result1.jsp".
        mv.setViewName("result"); // The framework resolves this to "/views/result1.jsp" based on application.properties.

        // Add the result to the model with the key "result".
        mv.addObject("result", result);

        System.out.println(result); // Logs the result to the console.

        // Return the updated ModelAndView object.
        return mv;
    }

    @RequestMapping("addAlien")
    public String addAlien(Alien alien) {
        //public String addAlien(@ModelAttribute("alien1") Alien alien) {

        return "result";
    }


}

//Explanation of Key Features:
//  1.	Annotations:
//        •	@Controller: Indicates that this class will handle web requests in a Spring Boot application.
//        •	@RequestMapping: Maps specific URLs to methods.
//	2.	HttpServletRequest:
//        •	Used to retrieve user input (e.g., num1, num2) from the request.
//        3.	HttpSession:
//        •	Used to store the result of the addition so it can be accessed in the view (result1.jsp).
//        4.	JSP Pages:
//        •	index1.jsp: The homepage rendered when accessing /.
//        •	result1.jsp: Displays the result of the addition.
//
//Let me know if you need further clarification or enhancements!