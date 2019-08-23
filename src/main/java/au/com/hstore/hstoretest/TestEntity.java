package au.com.hstore.hstoretest;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.basic.PostgreSQLHStoreType;

@Entity
@Table(name="TEST_TABLE")
@TypeDef(name = "hstore", typeClass = PostgreSQLHStoreType.class)
public class TestEntity  implements java.io.Serializable {


  private Long testId;
  private Map<String, String> dataMap = new HashMap<>(); 

 public TestEntity() {
     
 }

 
 @Column(name="TEST_ID", nullable=false, precision=22, scale=0)
 public Long getTestId() {
     return this.testId;
 }
 
 public void setTestId(Long syncId) {
     this.testId = syncId;
 }

 @Type(type = "hstore")
 @Column(columnDefinition = "hstore")
 public Map<String, String> getDataMap() {
     return dataMap;
 }

 public void setDataMap(Map<String, String> dataMap) {
     this.dataMap = dataMap;
 }
 
 
}
