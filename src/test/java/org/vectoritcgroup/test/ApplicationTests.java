package org.vectoritcgroup.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles(value={"test"})
@RunWith(SpringRunner.class)
@SpringBootTest
@Sql({"classpath:create-tables.sql",
	  "classpath:insert-data.sql"
	  })
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
