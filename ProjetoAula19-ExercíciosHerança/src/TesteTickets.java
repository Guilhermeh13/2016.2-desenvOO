
public class TesteTickets {

	public static void main(String[] args) {
		Ticket ticketNormal = new Ticket();
		ticketNormal.setNome("Show Safad�o");
		ticketNormal.setValor(new Double(400));
		ticketNormal.imprimeValor();
		
		TicketVIP ticketVip = new TicketVIP();
		ticketVip.setNome("Show Safad�o");
		ticketVip.setValor(new Double(400));
		ticketVip.setValorAdicional(new Double(250));
		ticketVip.imprimeValor();
		
	}

}
