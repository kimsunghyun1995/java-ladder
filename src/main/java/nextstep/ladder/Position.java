package nextstep.ladder;

public class Position {
    private final int position;

	public Position(int position) {
		this.position = position;
	}

	public Position rightMove() {
		return new Position(position + 1);
	}

	public Position leftMove() {
		return new Position(position - 1);
	}

	public int getPosition() {
		return position;
	}

}
