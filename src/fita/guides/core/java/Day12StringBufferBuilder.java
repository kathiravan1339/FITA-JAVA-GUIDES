package fita.guides.core.java;

public class Day12StringBufferBuilder {

	public static void main(String[] args) {
		
		

		// =====================================================
		// 1. StringBuffer - append()
		// =====================================================
		
		
		
		String str = "Hello"; // immutable
		str = str.concat(" java");
		System.out.println(str);
		String str1 = new String("hi");
		str1 = str1.concat(" sql");
		
		//JVM => garbage collector collect and clean the no more longer data, no need object data.

		StringBuffer buffer = new StringBuffer("Hello"); // mutable

		buffer.append(" world");

		System.out.println("StringBuffer: " + buffer);

		// =====================================================
		// 2. StringBuffer - insert()
		// =====================================================

		buffer.insert(6, " World");

		System.out.println("After insert: " + buffer);

		// =====================================================
		// 3. StringBuffer - replace()
		// =====================================================

		buffer.replace(6, 12, "Programming");

		System.out.println("After replace: " + buffer);

		// =====================================================
		// 4. StringBuffer - delete()
		// =====================================================

		buffer.delete(0, 6);

		System.out.println("After delete: " + buffer);

		// =====================================================
		// 5. StringBuffer - reverse()
		// =====================================================

		StringBuffer name = new StringBuffer("Kathiravan");

		name.reverse();

		System.out.println("Reversed: " + name);

		// =====================================================
		// 6. StringBuffer - length()
		// =====================================================

		StringBuffer message = new StringBuffer("Hello Java");

		System.out.println("Length: " + message.length());

		// =====================================================
		// 7. StringBuilder - append()
		// =====================================================

		StringBuilder builder = new StringBuilder("Hello");

		builder.append(" Java");

		System.out.println("StringBuilder: " + builder);

		// =====================================================
		// 8. StringBuilder - insert()
		// =====================================================

		builder.insert(6, "World ");

		System.out.println("After insert: " + builder);

		// =====================================================
		// 9. StringBuilder - replace()
		// =====================================================

		builder.replace(6, 12, "Programming");

		System.out.println("After replace: " + builder);

		// =====================================================
		// 10. StringBuilder - delete()
		// =====================================================

		builder.delete(0, 6);

		System.out.println("After delete: " + builder);

		// =====================================================
		// 11. StringBuilder - reverse()
		// =====================================================

		StringBuilder city = new StringBuilder("Chennai");

		city.reverse();

		System.out.println("Reversed: " + city);

		// =====================================================
		// 12. Practical example - building a message
		// =====================================================

		StringBuilder result = new StringBuilder();

		result.append("Name: ");
		result.append("Kathiravan");
		result.append(", Age: ");
		result.append(25);
		result.append(", Course: ");
		result.append("Java");

		System.out.println(result);

		// =====================================================
		// 13. String vs StringBuffer vs StringBuilder
		// =====================================================

		String text = "Java";

		StringBuffer bufferExample = new StringBuffer("Java");

		StringBuilder builderExample = new StringBuilder("Java");

		// String
		text = text + " Programming";

		// StringBuffer
		bufferExample.append(" Programming");

		// StringBuilder
		builderExample.append(" Programming");

		System.out.println("String        : " + text);
		System.out.println("StringBuffer  : " + bufferExample);
		System.out.println("StringBuilder : " + builderExample);
	}
	
/*	
    
    String
    ------
    → Immutable
    → in the every modification it's create a new instance in heap memory.

    StringBuffer
    ------------
    → Mutable
    → Can modify the same instance
    → Synchronized (Thread Safety -> at a time one thread only can access on it. )

    StringBuilder
    ------------
    → Mutable
    → Can modify the same instance
    → Generally faster than StringBuffer ( Non Thread Safety -> at a time multiple thread can access on it. )
    
*/
	
/*	
    
	Common methods
	--------------
	append()
	insert()
	replace()
	delete()
	reverse()
	length()
    
*/

}

class StringBufferTask {
	
	public static void main(String[] args) {
		
		//String qry = "SELECT * FROM users;";
		//System.out.println("qry ::" + qry);

		String nameFilter = "John";
		String statusFilter = "ACTIVE";
		Integer minAgeFilter = 21;

		StringBuilder query = new StringBuilder("SELECT * FROM users WHERE 1=1");

		if (nameFilter != null) {
			query.append(" AND name LIKE '%").append(nameFilter).append("%'");
		}
		if (statusFilter != null) {
			query.append(" AND status = '").append(statusFilter).append("'");
		}
		if (minAgeFilter != null) {
			query.append(" AND age >= ").append(minAgeFilter);
		}
		
		System.out.println(query);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}