
package com.backbase.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DTO for "ThisAccount" consisting member variables, getters, setters, builder
 * methods
 * 
 * @author Arka Bhattacharya
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "holders", "number", "kind", "IBAN", "swift_bic", "bank" })
public class ThisAccount {

	@JsonProperty("id")
	private String id;
	@JsonProperty("holders")
	private List<Holder> holders = null;
	@JsonProperty("number")
	private String number;
	@JsonProperty("kind")
	private String kind;
	@JsonProperty("IBAN")
	private String iBAN;
	@JsonProperty("swift_bic")
	private String swiftBic;
	@JsonProperty("bank")
	private Bank bank;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public ThisAccount withId(String id) {
		this.id = id;
		return this;
	}

	@JsonProperty("holders")
	public List<Holder> getHolders() {
		return holders;
	}

	@JsonProperty("holders")
	public void setHolders(List<Holder> holders) {
		this.holders = holders;
	}

	public ThisAccount withHolders(List<Holder> holders) {
		this.holders = holders;
		return this;
	}

	@JsonProperty("number")
	public String getNumber() {
		return number;
	}

	@JsonProperty("number")
	public void setNumber(String number) {
		this.number = number;
	}

	public ThisAccount withNumber(String number) {
		this.number = number;
		return this;
	}

	@JsonProperty("kind")
	public String getKind() {
		return kind;
	}

	@JsonProperty("kind")
	public void setKind(String kind) {
		this.kind = kind;
	}

	public ThisAccount withKind(String kind) {
		this.kind = kind;
		return this;
	}

	@JsonProperty("IBAN")
	public String getIBAN() {
		return iBAN;
	}

	@JsonProperty("IBAN")
	public void setIBAN(String iBAN) {
		this.iBAN = iBAN;
	}

	public ThisAccount withIBAN(String iBAN) {
		this.iBAN = iBAN;
		return this;
	}

	@JsonProperty("swift_bic")
	public String getSwiftBic() {
		return swiftBic;
	}

	@JsonProperty("swift_bic")
	public void setSwiftBic(String swiftBic) {
		this.swiftBic = swiftBic;
	}

	public ThisAccount withSwiftBic(String swiftBic) {
		this.swiftBic = swiftBic;
		return this;
	}

	@JsonProperty("bank")
	public Bank getBank() {
		return bank;
	}

	@JsonProperty("bank")
	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public ThisAccount withBank(Bank bank) {
		this.bank = bank;
		return this;
	}

}
