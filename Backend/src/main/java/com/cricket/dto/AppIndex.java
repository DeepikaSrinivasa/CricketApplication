package com.cricket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppIndex {

	private String seoTitle;

	private String webURL;

	public String getSeoTitle() {
		return seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}

	public String getWebURL() {
		return webURL;
	}

	public void setWebURL(String webURL) {
		this.webURL = webURL;
	}

	@Override
	public String toString() {
		return "AppIndex [seoTitle=" + seoTitle + ", webURL=" + webURL + "]";
	}

}
