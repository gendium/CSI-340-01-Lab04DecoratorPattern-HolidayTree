package trees;

public class FraserFir implements Tree{


	@Override
	public double getCost() {
		return 12;
	}

	@Override
	public String getDecorations() {
		return "Fraser Fir Tree decorated with ";
	}

}
