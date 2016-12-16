/*    */ package eu.codesketch.test.maileasy.domain.model;

/*    */
/*    */
/*    */
/*    */ public class Mail
/*    */ {
	/*    */ private String to;
	/*    */
	/*    */ private String cc;
	/*    */
	/*    */ private String bcc;
	/*    */
	/*    */ private String from;
	/*    */
	/*    */ private String subject;
	/*    */
	/*    */ private String body;

	/*    */
	/*    */
	/*    */ public Mail(String to, String cc, String bcc, String from, String subject, String body)
	/*    */ {
		/* 22 */ this.to = to;
		/* 23 */ this.cc = cc;
		/* 24 */ this.bcc = bcc;
		/* 25 */ this.from = from;
		/* 26 */ this.subject = subject;
		/* 27 */ this.body = body;
		/*    */ }

	/*    */
	/*    */ public String getTo() {
		/* 31 */ return this.to;
		/*    */ }

	/*    */
	/*    */ public String getCc() {
		/* 35 */ return this.cc;
		/*    */ }

	/*    */
	/*    */ public String getBcc() {
		/* 39 */ return this.bcc;
		/*    */ }

	/*    */
	/*    */ public String getFrom() {
		/* 43 */ return this.from;
		/*    */ }

	/*    */
	/*    */ public String getSubject() {
		/* 47 */ return this.subject;
		/*    */ }

	/*    */
	/*    */ public String getBody() {
		/* 51 */ return this.body;
		/*    */ }
	/*    */ }

/*
 * Location:
 * /home/quirino/Projects/maileasy/maileasy/target/classes/!/eu/codesketch/test/
 * maileasy/domain/model/Mail.class Java compiler version: 8 (52.0) JD-Core
 * Version: 0.7.1
 */