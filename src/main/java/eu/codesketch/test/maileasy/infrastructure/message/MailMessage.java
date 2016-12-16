package eu.codesketch.test.maileasy.infrastructure.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MailMessage implements Message {
	private static final long serialVersionUID = -1576171374836021316L;
	@JsonProperty("to")
	private String to;
	@JsonProperty("cc")
	private String cc;
	@JsonProperty("bcc")
	private String bcc;
	@JsonProperty("from")
	private String from;
	@JsonProperty("subject")
	private String subject;
	@JsonProperty("body")
	private String body;

	@JsonCreator
	public MailMessage(@JsonProperty("to") String to, @JsonProperty("cc") String cc, @JsonProperty("bcc") String bcc,
			@JsonProperty("from") String from, @JsonProperty("subject") String subject,
			@JsonProperty("body") String body) {
		this.to = to;
		this.cc = cc;
		this.bcc = bcc;
		this.from = from;
		this.subject = subject;
		this.body = body;
	}

	@JsonIgnore
	public String getTo() {
		return this.to;
	}

	@JsonIgnore
	public String getCc() {
		return this.cc;
	}

	@JsonIgnore
	public String getBcc() {
		return this.bcc;
	}

	@JsonIgnore
	public String getFrom() {
		return this.from;
	}

	@JsonIgnore
	public String getSubject() {
		return this.subject;
	}

	@JsonIgnore
	public String getBody() {
		return this.body;
	}

	@Override
	@JsonIgnore
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MailMessage [to=").append(this.to).append(", cc=").append(this.cc).append(", bcc=")
				.append(this.bcc).append(", from=").append(this.from).append(", subject=").append(this.subject)
				.append(", body=").append(this.body).append("]");
		return builder.toString();
	}
}
