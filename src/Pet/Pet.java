package Pet;

class Animal{
	String name;
	int age;
	
	void printPet() {
		System.out.println("名前："+name);
		System.out.println("年齢："+age);
	}
}
class Cat extends Animal{
	String variety;
	
	void printPet() {
		super.printPet();
		System.out.println("種類："+variety);
		
	}
}
public class Pet {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cat cat = new Cat();
		cat.name="ラン";
		cat.age=5;
		cat.variety="ペルシャ";
		cat.printPet();
	}

}
