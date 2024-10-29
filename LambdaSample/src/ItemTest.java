import com.sample.Item;

public class ItemTest {
	public static void main(String[] args) {
//		ラムダ式（Consumerの中で、空のインスタンスの参照に、アイテム情報が入れる。
				Item.save(item -> {
					item.id("A100")
						.name("LX100G")
						.discription("sample")
						.price(10000);
				});

	}

}
