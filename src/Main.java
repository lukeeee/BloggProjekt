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
		post.category.SetValues("ok�nd");
		post.SetValues("Nytt", "Fuck You", date);
		blogg.AddToList(post);
		
		post = new Post();
		post.author.SetValues("Greger", "Stenson", "36", "Man", "Sweden", "Greger2345@live.se");
		post.category.SetValues("ok�nd");
		post.SetValues("Ny", "H�ll tyst Bernt", date);
		blogg.AddToList(post);
		
		post = new Post();
		post.author.SetValues("J�rgen", "Schnieder", "47", "Man", "Germany", "dasj�rgen@live.de");
		post.category.SetValues("ok�nd");
		post.SetValues("Ny", "Nu ska du g� och l�gga dig bernt och inte vara ute och skriva massa skit p� svenska bloggar du ska f� smaka p� pappas sk�rp", date);
		blogg.AddToList(post);
		
		for(int i = 0; i < blogg.GetListSize(); i++){
			System.out.println(blogg.GetFromList(i).GetBloggPost());
			System.out.println("\r\n");
		}
	}

}