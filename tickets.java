package encap;

public class tickets {

	int movieId;
	int noOfSeats;
	double costPerTicket;
	
	tickets(int movieId, int noOfSeats) {
		super();
		this.movieId = movieId;
		this.noOfSeats = noOfSeats;
	
	}
	
	public void setMovieId(int movieId) {
		
		this.movieId=movieId;
	}
	
	public void setNoOfSeats(int noOfSeats) {
		
		this.noOfSeats=noOfSeats;
	}
	
	public void setCostPerTicket(int costPerTicket) {
		
		this.costPerTicket=costPerTicket;
		
	}
	
	public int getMovieId() {
		return movieId;
	}
	
	public int getNoOfSeats() {
		return noOfSeats;
	}
	
	public double getCostPerTicket() {
		return costPerTicket;
	}
	
	
}
