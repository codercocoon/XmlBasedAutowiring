package javaspringexamples.spring.ioc.autowiring.xml;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public interface UserService {

	String getUserinformation(int userId);

	void lockAccountUser(int userId);

	void unlockAccountUser(int userId);
}
