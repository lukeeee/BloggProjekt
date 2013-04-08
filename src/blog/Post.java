package blog;

import java.util.Date;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;

public class Post {
	private String title;
	private String content;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();

	public Author author = new Author();
	public Category category = new Category();

	public void SetValues(String title_in, String content_in, Date date_in) {
		content = content_in;
		title = title_in;
		date = date_in;

	}

	public String GetContent() {
		return content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String GetDate() {
		return dateFormat.format(date);
	}

	public String GetBloggPost() {
		return "Författare: " + author.GetName() + "\r\n" + "Kategori: "
				+ category.GetCategory() + "\r\n" + "E-mail: "
				+ author.GetEmail() + "\r\n" + title + "\r\n" + GetDate()
				+ "\r\n" + content;
	}
}