package product.run;

import product.model.vo.Product;

public class TestProduct {

	public static void main(String[] args) {
		Product product = new Product();// product랑 관계 맺음

		product.printProduct();// 명령어 호출
	}

}
