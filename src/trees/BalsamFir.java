package trees;

public class BalsamFir implements Tree{


	@Override
	public double getCost() {
		return 5;
	}

	@Override
	public String getDecorations() {
		return "Balsam Fir Tree decorated with ";
	}
}
