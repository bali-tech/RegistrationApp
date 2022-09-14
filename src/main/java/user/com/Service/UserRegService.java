package user.com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.com.Model.UserReg;
import user.com.Repository.UserRepo;

@Service
	public class UserRegService {
	@Autowired
		
		UserRepo userRegRepo;
		
		public  UserReg addUser(UserReg userobj) {
			return userRegRepo.save(userobj);
			
		}
		
		public  List<UserReg> getAllUsers(){
			return (List<UserReg>) userRegRepo.findAll();
		}
		public List<UserReg> fetchUserByName(String firstName){ 
			  return userRegRepo.findByFirstName(firstName); 
			  }
		  
		  public List<UserReg> fetchUserByEmail(String email){ 
			  return userRegRepo.findByEmail(email); 
			  }
	}



