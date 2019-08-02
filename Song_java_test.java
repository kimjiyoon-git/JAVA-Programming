
public class Song {
	
	private String title;
	
	
	public Song(String title) {
		this.title=title;
	}

	private String getTitle() {
		return title;
	}
	
	public static void main(String[] args) {
	    Song mysong = new Song("ABCD"); 
	    Song yoursong = new Song("1234"); 
	    System.out.println(mysong.getTitle());
	    System.out.println(yoursong.getTitle());
	  }
	}

