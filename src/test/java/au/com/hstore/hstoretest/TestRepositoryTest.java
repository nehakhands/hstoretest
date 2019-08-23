package au.com.hstore.hstoretest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest
public class TestRepositoryTest {
 
    @Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private TestRepository testRepository;
    
    @Test
    public void testInsert() {
        // given
        TestEntity entity = new TestEntity();
        entity.setTestId(1L);
        entityManager.persist(entity);
        entityManager.flush();
    }
}