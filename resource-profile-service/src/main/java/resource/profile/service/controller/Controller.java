package resource.profile.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import resource.profile.service.repositories.Profile;

@RestController
@RequestMapping("/profile")
public class Controller {
	
	@GetMapping
	public List<Profile> getAllProfiles(){
		
		List<Profile> profileArray = new ArrayList<>();
		profileArray.add(new Profile(1, "Denuwan", "149, Kottawa"));
		profileArray.add(new Profile(2, "Kamal", "123, Matara"));
		profileArray.add(new Profile(3, "Nimal", "145, Godagama"));
		profileArray.add(new Profile(4, "Saman", "13, Matara"));
		
		return profileArray;
	}

}
