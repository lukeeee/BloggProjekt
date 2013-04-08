import java.util.Date;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import blog.Post;
import blog.Blogg;
import blog.Category;
import blog.Author;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Blogg blogg = new Blogg();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		Post post = new Post();
		post.author.SetValues("Bernt", "Schnieder", "13", "Man", "Germany", "berra_tysken@live.de");
		post.category.SetValues("okänd");
		post.SetValues("Nytt", "Fuck You", date);
		blogg.AddToList(post);
		
		post = new Post();
		post.author.SetValues("Greger", "Stenson", "36", "Man", "Sweden", "Greger2345@live.se");
		post.category.SetValues("okänd");
		post.SetValues("Ny", "Håll tyst Bernt", date);
		blogg.AddToList(post);
		
		post = new Post();
		post.author.SetValues("Jürgen", "Schnieder", "47", "Man", "Germany", "dasjürgen@live.de");
		post.category.SetValues("okänd");
		post.SetValues("Ny", "Nu ska du gå och lägga dig bernt och inte vara ute och skriva massa skit på svenska bloggar du ska få smaka på pappas skärp", date);
		blogg.AddToList(post);
		
		for(int i = 0; i < blogg.GetListSize(); i++){
			System.out.println(blogg.GetFromList(i).GetBloggPost());
			System.out.println("\r\n");
		}
	}

}