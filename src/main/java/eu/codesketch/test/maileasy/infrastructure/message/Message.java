package eu.codesketch.test.maileasy.infrastructure.message;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(content = JsonInclude.Include.NON_NULL)
public abstract interface Message extends Serializable {
}
