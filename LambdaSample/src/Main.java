import com.sample.Factory;
import com.sample.Sample;

public class Main {

	public static void main(String[] args) {
//		Sample sample = new SampleImpl();
		//SampleImplへの参照をSample形で扱っている。
		
		Sample sample = Factory.create();
//		Factoryクラスのcreateメソッドで、Implの内容がSample形で返却される。これで情報隠ぺいができるようになる。
		sample.execute();
	}

}
