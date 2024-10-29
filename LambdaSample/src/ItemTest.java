import com.sample.Item;

public class ItemTest {
	public static void main(String[] args) {
		Item item = new Item()
//				各参照を戻して、その参照に別の変数を入れてさらに呼び出しを行う。
				.id("A100")
				.name("LX100G")
				.discription("sample")
				.price(10000);

	}

}
