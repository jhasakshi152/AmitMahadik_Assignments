@interface Test{}

class Family{
	@Test
	public void Mom() {
		System.out.println("@Test applied on Method here");
	}
}
public class AnnotationTest {

	public static void main(String[] args) {
		Family family=new Family();
		family.Mom();
	}

}
