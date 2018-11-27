package com.test.mock;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.test.context.junit4.*;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyMockTests {

	@MockBean
	private RemoteService remoteService;

	@Autowired
	private Reserver reserver;

	@Test
	public void exampleTest() {
		// RemoteService has been injected into the reverser bean
		given(this.remoteService.call()).willReturn("mock");
		String reverse = reserver.callRemote();
		assertThat(reverse).isEqualTo("testmock");
	}

}