package guest;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Guest")
public class Guest implements Serializable {
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   Long id;
   
   public void setId(Long id) {
	this.id = id;
   }


   private String name;
   private Date signingDate;

   // Constructors:
   public Guest() {
   }

   public Guest(String name) {
      this.name = name;
      this.signingDate = new Date(System.currentTimeMillis());
      //id = getId();
   }

   // String Representation:
   @Override
   public String toString() {
      return name + " (signed on " + signingDate + ") " + id;
   }
}