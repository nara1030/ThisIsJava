package collection.ex_06_lifo_and_fifo.queue;

class Message {
	String command;
	String to;

	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
