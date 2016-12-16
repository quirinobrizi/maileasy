/*    */ package eu.codesketch.test.maileasy.infrastructure.exception;

/*    */
/*    */ import org.springframework.http.HttpStatus;
/*    */ import org.springframework.web.bind.annotation.ResponseStatus;

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
/*    */ @ResponseStatus(code = HttpStatus.BAD_REQUEST)
/*    */ public class BadRequestException/*    */ extends RuntimeException
/*    */ {
	/*    */ private static final long serialVersionUID = -2251984470974650269L;

	/*    */
	/*    */ public BadRequestException() {
	}

	/*    */
	/*    */ public BadRequestException(String arg0)
	/*    */ {
		/* 31 */ super(arg0);
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */ public BadRequestException(Throwable arg0)
	/*    */ {
		/* 38 */ super(arg0);
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public BadRequestException(String arg0, Throwable arg1)
	/*    */ {
		/* 46 */ super(arg0, arg1);
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public BadRequestException(String arg0, Throwable arg1, boolean arg2, boolean arg3)
	/*    */ {
		/* 56 */ super(arg0, arg1, arg2, arg3);
		/*    */ }
	/*    */ }

/*
 * Location:
 * /home/quirino/Projects/maileasy/maileasy/target/classes/!/eu/codesketch/test/
 * maileasy/infrastructure/exception/BadRequestException.class Java compiler
 * version: 8 (52.0) JD-Core Version: 0.7.1
 */