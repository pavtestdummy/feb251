package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class GetPostInfo {
	
	@GetMapping("/postinfo/{param1}")
	public PostEntity getInfo(@PathVariable("param1")String postid)
	{
		String url="https://jsonplaceholder.typicode.com/posts/"+postid;
		RestClient restClient=RestClient.builder().build();
		
		PostEntity result= restClient.get()
				  .uri(url)
				  .retrieve()
				  .body(PostEntity.class);

		System.out.println(result);
				
		return result;
	}

}
