package eu.codesketch.test.maileasy.domain.model;

public class Mail {
	private String to;

	private String cc;

	private String bcc;

	private String from;

	private String subject;

	private String body;

	public Mail(String to, String cc, String bcc, String from, String subject, String body) {
		this.to = to;
		this.cc = cc;
		this.bcc = bcc;
		this.from = from;
		this.subject = subject;
		this.body = body;
	}

	public String getTo() {
		return this.to;
	}

	public String getCc() {
		return this.cc;
	}

	public String getBcc() {
		return this.bcc;
	}

	public String getFrom() {
		return this.from;
	}

	public String getSubject() {
		return this.subject;
	}

	public String getBody() {
		return this.body;
	}
}
