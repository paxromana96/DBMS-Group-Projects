package com.frontrow;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.File;
import java.net.URISyntaxException;

class TomlFileAzureAuthLoaderTest
{

	@org.junit.jupiter.api.Test
	void getJbdc() throws URISyntaxException
	{
		File configFile = new File(getClass().getResource("config.toml").toURI());
		AuthLoader azureAuthLoader = new TomlFileAzureAuthLoader(configFile);

		assertNotEquals("Loaded auth data should not be empty", 0, azureAuthLoader.getJbdc());
	}
}