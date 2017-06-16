
package murach.business;

import java.io.Serializable;



public class User implements Serializable
{
    private String firstName;
    private String lastName;
    private String email;
    
    public User()
    {
        firstName="";
        lastName="";
        email="";
    }
    public User(String firstName, String lastName, String email)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
