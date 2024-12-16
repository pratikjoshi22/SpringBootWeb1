#Project Overview
	•	Spring Boot Web Application demonstrating basic Spring MVC features.
	•	Controller Layer:
	•	Handles requests and renders views (HomeController).
	•	Uses ModelAndView to pass model data to views.
	•	@ModelAttribute used for binding request parameters to model objects.
	•	Model and controller logic are separated into distinct packages.
	•	View Configuration:
	•	JSP views located in the /views/ directory with .jsp extension.
	•	Configured view resolution in application.properties:
        # spring.mvc.view.prefix = /views/
        #spring.mvc.view.suffix = .jsp
	•	Static Resources:
	•	CSS and other static files are placed in the /static/ folder.
	•	Flow:
	1.	User accesses homepage (/).
	2.	HomeController processes form submission (/add?num1=5&num2=10).
	3.	The result is added to the model and passed to the view.
	4.	result.jsp displays the calculated result.
