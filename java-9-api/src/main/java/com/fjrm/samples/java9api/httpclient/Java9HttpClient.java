package com.fjrm.samples.java9api.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;

public class Java9HttpClient {
	public void performGet() throws URISyntaxException {
		
		URI httpURI = new URI("https://www.google.es");
		HttpRequest.Builder requestBuilder = HttpRequest.newBuilder(httpURI);
		HttpRequest request = requestBuilder.GET().build();
		try {
			HttpClient.newHttpClient().send(request, null);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Java9HttpClient client = new Java9HttpClient();
		try {
			client.performGet();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
