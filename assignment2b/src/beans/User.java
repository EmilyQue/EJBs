package beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class User {

	@NotNull(message = "Please enter a first name. This is a required field.")
	@Size(min=2, max=15)
	String firstName = "";
	
	@NotNull(message = "Please enter a last name. This is a required field.")
	@Size(min=2, max=15)
	String lastName = "";
	
	public User() {
		firstName = "Emily";
		lastName = "Quevedo";
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
