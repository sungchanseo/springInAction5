package tacos;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.id.enhanced.TableStructure;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Ingredient {
	
	@Id
	private final String id;
	private final String name;
	private final Type type;
	
	public static enum Type{
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}


	

}
