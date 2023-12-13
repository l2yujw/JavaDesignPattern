package command.home.undo;

public interface Command {
	public void execute();
	public void undo();
}
