package co.virtualdragon.vanillaVotifier.impl.server.event;

import co.virtualdragon.vanillaVotifier.server.event.SocketEvent;
import co.virtualdragon.vanillaVotifier.event.AbstractExceptionEvent;
import java.net.Socket;

public class ConnectionCloseExceptionEvent extends AbstractExceptionEvent implements SocketEvent {

	private final Socket socket;

	public ConnectionCloseExceptionEvent(Socket socket, Exception exception) {
		super(exception);
		this.socket = socket;
	}

	@Override
	public Socket getSocket() {
		return socket;
	}
}
