
public class APCSAConsumerReview {

	public static void main(String[] args) {
		double value = Review.sentimentVal("absurd");
		System.out.println(value);

		
		double total = Review.totalSentiment("src/SimpleReview.txt");
		System.out.println("Total Sentiment: " +total);
		
		double review = Review.starRating("src/SimpleReview.txt");
		System.out.println("Review:" + stars);
	}

}
