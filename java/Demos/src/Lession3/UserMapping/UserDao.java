package Lession3.UserMapping;

import Lession3.Demo002.User;

public interface UserDao {
		void save(User user);
		
		void delete(int age);
		
		int update(User user); 
		
		void deleteMany();

}
