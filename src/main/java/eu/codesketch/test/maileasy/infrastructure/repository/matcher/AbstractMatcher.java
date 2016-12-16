/*    */ package eu.codesketch.test.maileasy.infrastructure.repository.matcher;

/*    */
/*    */
/*    */
/*    */ public abstract class AbstractMatcher/*    */ implements Matcher
/*    */ {
	/*    */ private final String property;
	/*    */
	/*    */ private final String matcher;
	/*    */
	/*    */ private String value;

	/*    */
	/*    */
	/*    */ public AbstractMatcher(String property, String matcher)
	/*    */ {
		/* 17 */ this.property = property;
		/* 18 */ this.matcher = matcher;
		/*    */ }

	/*    */
	/*    */ public boolean canMatch(String filter, String matcher)
	/*    */ {
		/* 23 */ String[] parts = matcher.split(":");
		/* 24 */ return (getProperty().equals(filter)) && (getMatcher().equals(parts[0]));
		/*    */ }

	/*    */
	/*    */ public String getMatcher() {
		/* 28 */ return this.matcher;
		/*    */ }

	/*    */
	/*    */ public String getProperty() {
		/* 32 */ return this.property;
		/*    */ }

	/*    */
	/*    */ public String getValue() {
		/* 36 */ return this.value;
		/*    */ }

	/*    */
	/*    */ protected void setValue(String value) {
		/* 40 */ this.value = value;
		/*    */ }
	/*    */ }

/*
 * Location:
 * /home/quirino/Projects/maileasy/maileasy/target/classes/!/eu/codesketch/test/
 * maileasy/infrastructure/repository/matcher/AbstractMatcher.class Java
 * compiler version: 8 (52.0) JD-Core Version: 0.7.1
 */