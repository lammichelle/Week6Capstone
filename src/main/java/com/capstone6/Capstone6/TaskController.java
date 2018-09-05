package com.capstone6.Capstone6;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.capstone6.Capstone6.entity.User;
import com.capstone6.Capstone6.repo.TaskRepository;
import com.capstone6.Capstone6.repo.UserRepository;

@Controller
public class TaskController {

	

	@Autowired
	private TaskRepository taskRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	
	@RequestMapping("/")
	public ModelAndView showHomePage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/login")
	public ModelAndView showLoginForm() {
		return new ModelAndView("login");
	}

	@PostMapping("/login")
	// get the username and password from the form when it's submitted.
	public ModelAndView submitLoginForm(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session, RedirectAttributes redir) {
		// Find the matching user.
		User user = userRepo.findByEmail(email);
		if (user == null || !password.equals(user.getPassword())) {
			// If the user or password don't match, display an error message.
			return new ModelAndView("login","message", "Incorrect username or password.");
			
		}
		
		// On successful login, add the user to the session.
		session.setAttribute("user", user);
		
		// A flash message will only show on the very next page. Then it will go away.
		// It is useful with redirects since you can't add attributes to the mav.
		redir.addFlashAttribute("message", "Logged in.");
		return new ModelAndView("redirect:/showTasks");
		
	}
		@RequestMapping("/newuser")
		public ModelAndView newUserForm() {
			return new ModelAndView("useraddform");
			
		}
		
		@PostMapping("/adduser")
		public ModelAndView addUser(HttpSession session,RedirectAttributes redir,@RequestParam("email")String email, @RequestParam("password")String password) {
			User user = new User(null,email,password,null, null);
			userRepo.save(user);
			session.setAttribute("user", user);
			redir.addFlashAttribute("message", "Logged in.");
			return new ModelAndView("redirect:/tasklist");
			
		}
		
		@RequestMapping("/tasklist")
		public ModelAndView viewTaskList(@SessionAttribute(name="user", required=false) User user, RedirectAttributes redir) {
				// For this URL, make sure there is a user on the session.
				if (user == null) {
					// if not, send them back to the login page with a message.
					redir.addFlashAttribute("message", "Wait! Please log in.");
					return new ModelAndView("redirect:/index");
				}
				
				// if the user is logged in, proceed as normal.
				ModelAndView mv = new ModelAndView("tasklist");
				mv.addObject("items", taskRepo.findAllByUser(user));
				System.out.println(taskRepo.findAll().toString());
				return mv;
			}
	}

