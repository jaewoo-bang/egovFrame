package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repository.Posts;
import com.example.demo.repository.PostsRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class PostsRepositoryTest {
	@Autowired
	PostsRepository postsRepository;
	
	@Test
	public void 게시글_등록() {
		//given
		String title = "테스트 게시글";
		String content = "테스트 본문";
		
		postsRepository.save(Posts.builder()
						.title(title)
						.content(content)
						.author("jojolju@gamil.com")
						.build());
		
		//when
		List<Posts> postsList = postsRepository.findAll();
		//then
		Posts posts = postsList.get(0);
		assertThat(posts.getTitle()).isEqualTo(title);
		assertThat(posts.getContent()).isEqualTo(content);
		
		
	}
}
