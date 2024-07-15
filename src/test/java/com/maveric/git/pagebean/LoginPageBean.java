package com.maveric.git.pagebean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageBean {

	@FindBy(how = How.ID, id = "login_field")
	private WebElement username;

	@FindBy(how = How.NAME, name = "password")
	private WebElement password;

	@FindBy(how = How.NAME, name = "commit")
	private WebElement commit;

	@FindBy(how = How.XPATH, xpath = "/html/body/div[1]/div[3]/main/div/div[2]/div/div/div")
	private WebElement errorMessage;

	public String getUsername() {
		return username.getText();
	}

	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public String getErrorMessage() {
		return errorMessage.getText();
	}

	public String getPassword() {
		return password.getText();
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void signIn() {
		commit.submit();
	}
}
