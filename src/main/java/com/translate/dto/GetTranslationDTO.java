package com.translate.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetTranslationDTO {
	
	@NotEmpty
	@NotNull
	private String text ;
	
	@JsonProperty("lang")
	@NotNull
	@NotEmpty
	private String targetLanguage;
	
	@JsonProperty("sourcelang")
	@NotNull
	@NotEmpty
	private String sourceLanguage;
	
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @return the targetLanguage
	 */
	public String getTargetLanguage() {
		return targetLanguage;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	public void setTargetLanguage(String targetLanguage) {
		this.targetLanguage = targetLanguage;
	}
	@Override
	public String toString() {
		return "GetTranslationDTO [text=" + text + ", targetLanguage=" + targetLanguage + "]";
	}
	public String getSourceLanguage() {
		return sourceLanguage;
	}
	public void setSourceLanguage(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
	}
}
