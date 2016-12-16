/*    */ package eu.codesketch.test.maileasy.infrastructure.message;

/*    */
/*    */ import com.fasterxml.jackson.annotation.JsonCreator;
/*    */ import com.fasterxml.jackson.annotation.JsonIgnore;
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;

/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ public class MailMessage/*    */ implements Message
/*    */ {
	/*    */ private static final long serialVersionUID = -1576171374836021316L;
	/*    */ @JsonProperty("to")
	/*    */ private String to;
	/*    */ @JsonProperty("cc")
	/*    */ private String cc;
	/*    */ @JsonProperty("bcc")
	/*    */ private String bcc;
	/*    */ @JsonProperty("from")
	/*    */ private String from;
	/*    */ @JsonProperty("subject")
	/*    */ private String subject;
	/*    */ @JsonProperty("body")
	/*    */ private String body;

	/*    */
	/*    */ @JsonCreator
	/*    */ public MailMessage(@JsonProperty("to") String to, @JsonProperty("cc") String cc,
			@JsonProperty("bcc") String bcc, @JsonProperty("from") String from, @JsonProperty("subject") String subject,
			@JsonProperty("body") String body)
	/*    */ {
		/* 47 */ this.to = to;
		/* 48 */ this.cc = cc;
		/* 49 */ this.bcc = bcc;
		/* 50 */ this.from = from;
		/* 51 */ this.subject = subject;
		/* 52 */ this.body = body;
		/*    */ }

	/*    */
	/*    */ @JsonIgnore
	/*    */ public String getTo() {
		/* 57 */ return this.to;
		/*    */ }

	/*    */
	/*    */ @JsonIgnore
	/*    */ public String getCc() {
		/* 62 */ return this.cc;
		/*    */ }

	/*    */
	/*    */ @JsonIgnore
	/*    */ public String getBcc() {
		/* 67 */ return this.bcc;
		/*    */ }

	/*    */
	/*    */ @JsonIgnore
	/*    */ public String getFrom() {
		/* 72 */ return this.from;
		/*    */ }

	/*    */
	/*    */ @JsonIgnore
	/*    */ public String getSubject() {
		/* 77 */ return this.subject;
		/*    */ }

	/*    */
	/*    */ @JsonIgnore
	/*    */ public String getBody() {
		/* 82 */ return this.body;
		/*    */ }

	/*    */
	/*    */ @JsonIgnore
	/*    */ public String toString()
	/*    */ {
		/* 88 */ StringBuilder builder = new StringBuilder();
		/* 89 */ builder.append("MailMessage [to=").append(this.to).append(", cc=").append(this.cc).append(", bcc=")
				.append(this.bcc)/* 90 */ .append(", from=").append(this.from).append(", subject=").append(this.subject)
				.append(", body=").append(this.body)/* 91 */ .append("]");
		/* 92 */ return builder.toString();
		/*    */ }
	/*    */ }

/*
 * Location:
 * /home/quirino/Projects/maileasy/maileasy/target/classes/!/eu/codesketch/test/
 * maileasy/infrastructure/message/MailMessage.class Java compiler version: 8
 * (52.0) JD-Core Version: 0.7.1
 */