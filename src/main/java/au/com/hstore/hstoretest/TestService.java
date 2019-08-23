package au.com.hstore.hstoretest;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestRepository repo;
    
    public void save() {
        TestEntity entity = new TestEntity();
        entity.setTestId(1L);
        entity.setDataMap(new HashMap<String, String>());
        repo.save(entity);
    }
    
}
