package com.sbmaster.springboot.learnspringboot;
/*
 * // http://localhost:8080
 * /courses
	[
  	{
    	"id": 1,
    	"name": "Learn AWS",
    	"author": "in28minutes"
	} ]
 */

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
					new Course(1, "Learn AWS", "inTenSeconds"),
					new Course(2, "Learn DevOps", "inTenSeconds")
				);
	}

}
