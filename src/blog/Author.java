package blog;
public class Author {
	private String name;
	private String age;
	private String gender;
	private String country;
	private String email;
	
	public void SetValues(String name_in, String age_in, String gender_in, String country_in, String email_in){
	name = name_in;
	age = age_in;
	gender = gender_in;
	country = country_in;
	email = email_in;

}
	public String GetName(){
		return name;
	}
	public String GetAge(){
		return age;
	}
	public String GetEmail(){
		return email;
	}
	
	public String ReturnString(){
		return "Namn: " + name + "\r\n" + "Ålder: " + age + "\r\n" + "Kön: " + gender + "\r\n" + "Nationalitet: " + country + "\r\n" + "E-mail: " + email + "\r\n";
	}
	
}