package teamhalcon.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import teamhalcon.bo.UserBO;
import teamhalcon.domain.User;

@Controller
public class HomeController {


	UserBO userBO;

	@Autowired
	public void setUserBO(UserBO userBO) {
		this.userBO = userBO;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		// return home.jsp
		return "home";
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public @ResponseBody List<User> getUserList() {
		// return user list in JSON
		return userBO.getUserList();
	}

	@RequestMapping(value = "/userid/{userId}", method = RequestMethod.GET)
	public @ResponseBody User getUserById(@PathVariable int userId) {
		// return a single user in JSON
		return userBO.getUserById(userId);
	}

	@RequestMapping(value = "/username/{username}", method = RequestMethod.GET)
	public @ResponseBody User getUserByUsername(@PathVariable String username) {
		// return a single user in JSON
		return userBO.getUserByName(username);
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public @ResponseBody void addUser(@RequestBody User user) {
		userBO.createUser(user);
	}

}
